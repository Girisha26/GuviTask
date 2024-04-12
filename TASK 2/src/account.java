//created a class account
public class account {
    int balance ;
    int amt_to_deposit;
    int amt_to_withdraw;

    //constructor with no argument
    account(){}

   //constructor with two arguments
    account(int deposit_amt,int withdraw_amt){
           amt_to_deposit = deposit_amt;
           amt_to_withdraw = withdraw_amt;
    }

    //method to deposit
    void deposit(){

        balance = balance + amt_to_deposit;
    }

    //method to withdraw
    void withdraw(){

        balance = balance - amt_to_withdraw;
    }

    //method to display balance
    void display(){
        System.out.println("Balance : "+ balance);
    }


    public static void main(String[] args) {

        account user1 = new account();//Default constructor
        user1.deposit();
        user1.withdraw();
        user1.display();


        account user2 = new account(1000,500);//parameterized constructor
        user2.deposit();
        user2.withdraw();
        user2.display();


    }
}


