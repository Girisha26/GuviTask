

import java.util.*;
        import java.lang.*;

public class discount {
    public static void main(String[] args)
    {

        int final_amount;
        double discount;

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter purchase amount :");
        int purchase_amount = sc.nextInt();//getting input and storing at this feild

        //comparing purchase_amount to decide the discount
        if(purchase_amount <=500)
        {
            System.out.println("No discount");
        }
        else if (purchase_amount<=1000)
        {
            discount= purchase_amount * 10 / 100;
            final_amount = (int)(purchase_amount - discount);// Cast to int
            System.out.println(final_amount);
        }
        else
        {
            discount= purchase_amount * 20 / 100;
            final_amount = (int)(purchase_amount - discount);// Cast to int
            System.out.println(final_amount);
        }

    }
}
