package io.github.tomhuel.Processors.JsonAttribute;

import io.github.tomhuel.Annotations.Init.Init;
import io.github.tomhuel.Annotations.JsonAttribute.JsonAttribute;
import io.github.tomhuel.Processors.JsonAttribute.Exceptions.JsonSerializeException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonSerializer {

    public static void initObject(Object object) {
        if (Objects.isNull(object)) {
            throw new JsonSerializeException("Object to serialize cannot be NULL");
        }

        Method[] methods = object.getClass().getDeclaredMethods();

        Arrays.stream(methods).filter(m -> m.isAnnotationPresent(Init.class)).forEach(m -> {
            m.setAccessible(true);
            try {
                m.invoke(object);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new JsonSerializeException("Error serializing. Cannot init object" + e.getMessage());
            }
        });
    }

    public static String apply(Object object) {

        if (Objects.isNull(object)) {
            throw new JsonSerializeException("Object to serialize cannot be NULL");
        }

        initObject(object);
        Field[] fields = object.getClass().getDeclaredFields();
        return Arrays.stream(fields)
                .filter(f -> f.isAnnotationPresent(io.github.tomhuel.Annotations.JsonAttribute.JsonAttribute.class))
                .map(f -> {
                    f.setAccessible(true);
                    String name = f.getAnnotation(io.github.tomhuel.Annotations.JsonAttribute.JsonAttribute.class).name().equals("") ? f.getName() : f.getAnnotation(io.github.tomhuel.Annotations.JsonAttribute.JsonAttribute.class).name();
                    try {
                        Object value = f.get(object);
                        if (f.getAnnotation(JsonAttribute.class).capital() && value instanceof String) {
                            String newValue = (String) value;
                            newValue = Arrays.stream(newValue.split(" ")).map(c ->
                                    c.substring(0, 1).toUpperCase() + c.substring(1).toLowerCase()).collect(Collectors.joining(" "));
                            f.set(object, newValue);
                        }
                        if (isArray(value)) {
                            return "\"" + name + "\":" + arrayToJson(value);
                        }
                        return "\"" + name + "\":\"" + f.get(object) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializeException(e.getMessage());
                    }
                }).reduce("{", (a, b) -> {
                    if ("{".equals(a)) {
                        return a + b;
                    }
                    return a + ", " + b;
                }).concat("}");
    }

    private static String arrayToJson(Object array) {
        StringBuilder output = new StringBuilder();
        output.append("[");
        int length = java.lang.reflect.Array.getLength(array);
        for (int i = 0; i < length; i++) {
            output.append("\"").append(java.lang.reflect.Array.get(array, i)).append("\"");
            if (i != length - 1) {
                output.append(", ");
            }
        }
        output.append("]");
        return output.toString();
    }

    private static boolean isArray(Object o) {
        return o != null && o.getClass().isArray();
    }
}
