package Day5;

public class prg15 {
    static void main() {


        int n1 = 0, n2 = 1, count = 20;

        System.out.print("Fibonacci: " + n1 + " " + n2);

        for (int i = 2; i < count; i++) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println("hello Shash");
        System.out.print("today is a good day  ");
        System.out.printf("meow.. boww... mooo");
    }
}
