package task6;
import java.sql.*;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) throws SQLException {
         //calling method to insert data .
        insertrecords();
        //calling methods display data.
        displayrecords();
    }

    static void displayrecords () throws  SQLException
    {
        String url ="jdbc:mysql://localhost:3306/question2";
        String user ="root";
        String password = "root";
        String query = "select * from employee";

        Connection con = DriverManager.getConnection(url,user,password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);


        while (rs.next()){

            System.out.print(rs.getInt(1)+"     "+rs.getString(2)+"              "+rs.getInt(3)+"       "+rs.getInt(4));
            System.out.println();
        }

        con.close();
    }
    static void insertrecords () throws SQLException
    {
        //Scanner to get input from username
        Scanner sc = new Scanner (System.in);
        //no. of employee details to be stored.
        System.out.print("enter no of rows :");
        int rows= sc.nextInt();
        System.out.println("enter employee details : ");
        System.out.println();

        //connecting to database
        String url ="jdbc:mysql://localhost:3306/question2";
        //username of database
        String username ="root";
        //password of database
        String password = "root";

        Connection con = DriverManager.getConnection(url,username,password);
        //to store data in database
        PreparedStatement ps = con.prepareStatement("insert into employee values (?,?,?,?)");
        //getting input from username
        for (int i = 1; i < rows +1; i++) {
            System.out.println("enter "+ i+" employee :");

            System.out.print("enter employee id :");
            int id = sc.nextInt();

            System.out.print("enter employee name :");
            String name = sc.next();

            System.out.print("enter employee age :");
            int age = sc.nextInt();

            System.out.print("enter employee salary :");
            int salary = sc.nextInt();
            System.out.println();

            //gets it to prepare statement
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setInt(3,age);
            ps.setInt(4,salary);

           int result = ps.executeUpdate();


        }
        //displays no of records entered
        System.out.println("no.of rows affected : "+ rows );
        System.out.println();
        ps.close();
        con.close();
    }
}
