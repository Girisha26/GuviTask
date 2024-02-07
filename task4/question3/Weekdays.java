package task4.question3;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        //String to store weekdays has been created.
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 0 to 6 : ");
        //Day postion has been take as input from user.
        int dayPosition = scanner.nextInt();

        try {
            String dayName = weekdays[dayPosition];
            //Printing the day name.
            System.out.println(dayPosition+" is "+dayName);
        }
        //Handling array index out of bound exception.
        catch (ArrayIndexOutOfBoundsException e) {
            //Printing that a proper index to be given
            System.out.println("Please enter number between 0 and 6.");
        }

        scanner.close();
    }
}
