package javaLambdaExpressions;

public class VowelCountExample {

    public static void main(String[] args) {
        String input = "Jack Hello Functional Java";

        long vowelCount = input
            .toLowerCase()
            .chars()
            .filter(c -> "aeiou".indexOf(c) != -1)
            .count();

        System.out.println("Vowel count: " + vowelCount);
    }
}
	