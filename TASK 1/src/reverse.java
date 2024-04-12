import java.util.*;
public class reverse
{
    public static void main(String[] args)
    {
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int num = number ;


        while(number !=0)
        {
            int r = number %10;
            reverse = reverse *10+r;
            number = number /10;
        }

        System.out.println("Reverse of " + num + " is : " + reverse);

    }


}
