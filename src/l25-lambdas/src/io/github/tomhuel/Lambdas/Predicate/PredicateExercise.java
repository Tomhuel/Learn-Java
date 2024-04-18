package io.github.tomhuel.Lambdas.Predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExercise {
    public static void execute() {
        Predicate<Integer> above18 = (age) -> age >= 18;
        System.out.println(above18.test(17));

        Predicate<String> isAdmin = (role) -> role.equals("ADMIN");
        System.out.println(isAdmin.test("ADMINN"));

        BiPredicate<String, Integer> isAdminAndAbove18 = (role, age) -> above18.test(age) && isAdmin.test(role);
        System.out.println(isAdminAndAbove18.test("ADMIN", 19));
    }
}
