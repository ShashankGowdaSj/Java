package Day5;
import java.util.Scanner;

public class prg14 {
    static void main() {
        System.out.println("Enter the no:");
        Scanner n=new Scanner(System.in);
        int fact = 1;
        int v=n.nextInt();

        for (int i = 1; i <= v; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " +v + " is " + fact);
    }
}
