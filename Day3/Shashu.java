
 import java.util.Scanner;

 public class Shashu {
    public static void main() {
        System.out.println("All is well");
        Scanner sp= new Scanner(System.in);
        System.out.println("enter percent ");
        int per= sp.nextInt();

            if (per< 49) {
                System.out.println("Low ");

            } else if (per > 74) {
                System.out.println("75-75");
            } else {
                System.out.println("Fail");
            }
        }

    }

