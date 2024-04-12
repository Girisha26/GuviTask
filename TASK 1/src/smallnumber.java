import java.util.*;
public class smallnumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1 :");
        int x = sc.nextInt();

        System.out.print("Enter a number 1 :");
        int y = sc.nextInt();

        System.out.print("Enter a number 1 :");
        int z = sc.nextInt();

        if(x<=y && x<=z)
        {
            System.out.println(x + " is the smallest number ");
        }
        else if (y<=z)
        {
            System.out.println(y + " is the smallest number ");
        }
        else
        {
            System.out.println(z + " is the smallest number ");

        }





    }
}
