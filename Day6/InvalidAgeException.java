package Day6;
import java.io.IOException;

public class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
    }
}
class Driver{
    static  void vote(int age) throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("Age must be above 18");
        }
        System.out.println("you can vote");
    }

    static void main(String[] args) {
        try {
            vote(95);
        }catch ( InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
