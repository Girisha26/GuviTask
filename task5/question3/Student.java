package task5.question3;

import java.util.*;
import java.util.stream.Collectors;

public class Student
{
    public static void main(String[] args)
    {
        //Declaration and initialization of students list.
        List<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter students name :");
        //getting 10 students from user.
        for(int i = 0;i<10;i++)
        {
                 String student = sc.next();
                 students.add(student);
        }
            //Using lambhada and stream API to filter
            List<String> specialgifts  = students.stream()
                    .filter(student-> student.startsWith("a") || student.startsWith("A") )
                    .collect(Collectors.toList());

        //Printing students name which starts with a.
        System.out.print("Special gifts to be given to : ");
        System.out.println(specialgifts);


    }
}
