package io.github.tomhuel.Annotations.JsonAttribute;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAttribute {
    String name() default "";
    boolean capital() default false;
}
