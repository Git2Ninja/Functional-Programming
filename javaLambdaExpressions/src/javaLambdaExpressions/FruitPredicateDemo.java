package javaLambdaExpressions;

import java.util.List;
import java.util.function.Predicate;

public class FruitPredicateDemo {
    public static void main(String[] args) {

        // Sample data set
        List<String> fruits = List.of("Apple", "Banana", "Avocado", "Kiwi", "Strawberry", "Apricot");

        // Predicate: checks if fruit starts with 'A'
        Predicate<String> startsWithA = fruit -> fruit.startsWith("A");

        // Predicate: checks if fruit name length is greater than 5
        Predicate<String> lengthGreaterThanFive = fruit -> fruit.length() > 5;

        // Combining predicates using logical operations

        // AND → must start with A AND length > 5
        Predicate<String> startsWithAAndLongName = startsWithA.and(lengthGreaterThanFive);

        // OR → start with A OR length > 5
        Predicate<String> startsWithAOrLongName = startsWithA.or(lengthGreaterThanFive);

        // NEGATE → NOT starting with A
        Predicate<String> notStartsWithA = startsWithA.negate();

        System.out.println("=== Fruits starting with A ===");
        fruits.stream()
                .filter(startsWithA)
                .forEach(System.out::println);

        System.out.println("\n=== Fruits starting with A AND length > 5 ===");
        fruits.stream()
                .filter(startsWithAAndLongName)
                .forEach(System.out::println);

        System.out.println("\n=== Fruits starting with A OR length > 5 ===");
        fruits.stream()
                .filter(startsWithAOrLongName)
                .forEach(System.out::println);

        System.out.println("\n=== Fruits NOT starting with A ===");
        fruits.stream()
                .filter(notStartsWithA)
                .forEach(System.out::println);
    }
}
