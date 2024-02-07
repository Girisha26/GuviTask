package task5.question2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyorNot {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();{// Create a new ArrayList to store strings

            // Add strings to the list
            list.add("abc");
            list.add("");
            list.add("bc");
            list.add("efg");
            list.add("abcd");
            list.add("");
            list.add("jkl");

            List<Boolean> checklist = list.stream()  //to process the list of strings
                    .map(String::isEmpty)            // Map each string to a boolean indicating whether it is empty or not
                    .collect(Collectors.toList());   // Collect the boolean values

            System.out.println(checklist);            // Print the list of boolean values

        }
    }

}
