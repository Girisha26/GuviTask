package task5.question1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class UpperCase {
    public static void main(String[] args) {
        // Create a stream of strings
        Stream<String> names = Stream.of("aBc","d","ef");

        // Use map to transform each string to uppercase
        List<String>uppercasenames = names.map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the list of uppercase strings
        System.out.println(uppercasenames);

    }
}