package task5.question4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        //Instance has been created to access its method birthday.
        Age age = new Age();
        age.birthday();


    }
    void birthday(){
        Scanner sc = new Scanner(System.in);
        //getting input from user
        System.out.print("Enter your birthdate (yyyy-mm-dd) : ");
        String date = sc.nextLine();

        //Today's date
        LocalDate today = LocalDate.now();
        //Day of birthday
        LocalDate dob = LocalDate.parse(date);

        //calculating days
        int days=Period.between(dob,today).getDays();
        //calculating months
        int months = Period.between(dob,today).getMonths();
        //calculating years
        int years = Period.between(dob,today).getYears();


        //printing output
        System.out.println("Your age is :"+years+" years,"+months+" months and "+days+" days.");


    }

}
