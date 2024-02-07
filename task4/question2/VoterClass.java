package task4.question2;


//Userdefined exception has been manually created.
class InvalidAgeException extends Exception {
      InvalidAgeException(String message) {
        super(message);
    }
}
//Class Voter has been created.
class Voter{
    int voterID;
    String name ;
    int age ;

    // Parameterized constructor has been created which can throw an userdefined exception.
    public Voter(int voterID, String name, int age)throws InvalidAgeException {
        this.voterID = voterID;
        this.name = name;
        //Condition to check age.
        if (age < 18) {
            // An exception has been thrown with a message.
            throw new InvalidAgeException("Invalid age for voter");
        }
        this.age = age;


    }


    }


public class VoterClass{
public static void main(String[] args)
{
    //Statement which may give error is placed in try block.
    try {
        Voter vote1 = new Voter(123, "ram", 14);
        System.out.println();
    } catch (InvalidAgeException E) {
        //block which called if an exception is caught
        System.out.println(E.getMessage());
    }
  }
}
