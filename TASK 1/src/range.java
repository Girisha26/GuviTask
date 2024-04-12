import java.util.*;
public class range
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Starting point:");
        int x = sc.nextInt();

        System.out.print("Ending point:");
        int y = sc.nextInt();

        System.out.println("______________________");
        System.out.println("NUMBERS FROM " + x +" TO "+ y);
        System.out.println("______________________");


        for(int i=x ; i<=y ; i++)
        {
            System.out.println(x);
            x++;
        }



    }

}
