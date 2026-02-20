import java.util.Scanner;
public class pattern5 {
    static void main() {
        Scanner jp=new Scanner(System.in);
        int size;
        size = jp.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            for (int space = 2 * i; space < 2 * size; space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}
