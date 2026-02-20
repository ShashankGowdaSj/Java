import java.util.Scanner;

public class today {
    static  int fact(int k){
        if (k==0|k<0){
            return 1;
        }
        else {
            return k* fact(k-1);
        }
    }

    static void main() {
        System.out.println("Beautiful day");
        int factorial_value=fact(8);
        System.out.println("factorial_value:"+factorial_value);
    }
}
