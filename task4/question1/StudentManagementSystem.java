package task4.question1;

//Userdefined exception has been created for Age not within range exception.
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

//Userdefined exception has been created for Name bot valid exception .
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {//Student class to represent student information.
    private int rollNo;
    private String name;
    private int age;
    private String course;

    //Parameterized constructor has been initialized.
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("AgeNotWithinRangeException");
        }
        this.age = age;
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("NameNotValidExcpetion");
        }
        this.name = name;
        this.course = course;
    }


    // Getters and setters
}
public class StudentManagementSystem{
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "John", 22, "Computer Science");
            System.out.println("Student created successfully");
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }

}

