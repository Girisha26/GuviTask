import java.util.*;
public class neagtivepositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if(a >= 0)
        {
            System.out.println("Result : " + a +" is a positive number");
        }
        else
        {
            System.out.println("Result : " + a +" is a neagtive number");

        }



    }
}