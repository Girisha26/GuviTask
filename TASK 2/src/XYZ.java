import java.util.Scanner;
class Product {
    int pid;
    double price;
    int quantity;
    //Paramtermized constructor for the product class
    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }



}
public class XYZ {
    //array to store Prodcut class
    static Product[] arr = new Product[5];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //getting input from user
        for (int i = 0; i < 5; i++) {
            System.out.println("Product " + i);

            System.out.print("pid: ");
            int pid = sc.nextInt();

            System.out.print("price: ");
            double price = sc.nextDouble();

            System.out.print("quantity: ");
            int quantity = sc.nextInt();

            //instantiation for Product and store in array
            arr[i] = new Product(pid, price, quantity);
        }
        //to print pid of highest price
        int maxprice = highest_price();
        System.out.println("pid of the product with the highest price : " + arr[maxprice].pid);

        //to print total amount spent
        int totalamt = total_amt();
        System.out.println("Total amount spent on all products : "+ totalamt);
    }

    // Method to find pid of highest price
    public static int highest_price() {

        int maxElement = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].price > arr[maxElement].price) {
                maxElement = i;
            }

        }
        return maxElement;
    }

    // Method to calculate total amount spent on all products
    public static int total_amt() {
        int totalamount = 0;
        for (int i = 0; i < arr.length; i++) {
            totalamount = (int) (totalamount + arr[i].price * arr[i].quantity);
        }
        return totalamount;
}

}


