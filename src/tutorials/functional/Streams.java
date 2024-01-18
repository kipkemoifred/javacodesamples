package tutorials.functional;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        // Example 1: Using a Supplier to generate a random number
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: " + randomSupplier.get());

        // Example 2: Using a Supplier to provide a constant value
        Supplier<String> greetingSupplier = () -> "Hello, World!";
        System.out.println("Greeting: " + greetingSupplier.get());

        // Example 1: Function to square a number
        Function<Integer, Integer> squareFunction = x -> x * x;
        System.out.println("Square of 5: " + squareFunction.apply(5));

        // Example 2: Function to convert a string to its length
        Function<String, Integer> lengthFunction = s -> s.length();
        System.out.println("Length of 'Java': " + lengthFunction.apply("Java"));


        // Use Consumer to print each element of a stream
        Stream<String> stream = Stream.of("Java", "is", "awesome");
        stream.forEach(System.out::println);


        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());



        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.forEach(printUpperCase);

        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> "Hello, ")
                .thenApplyAsync(value -> value + "World")
                .thenAcceptAsync(System.out::println);

        Predicate<String> startsWithA = s -> s.startsWith("A");

        System.out.println(startsWithA.test("Apple"));    // true
        System.out.println(startsWithA.test("Banana"));   // false

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        Stream<String> myStream = myList.stream();
       List<String> list=
               myStream
//               .filter(s->s.startsWith("c"))
               .sorted()
                       .distinct()
//                       .limit(3)
                       .skip(2)
                .collect(Collectors.toList());
        System.out.println(list);

        Predicate<String> endsWithO = s -> s.endsWith("o");

        Predicate<String> startsWithAAndEndsWithO = startsWithA.and(endsWithO);

        List<String> result = fruits.stream()
                .filter(startsWithAAndEndsWithO)
                .collect(Collectors.toList());

        System.out.println(result);

    }

}
