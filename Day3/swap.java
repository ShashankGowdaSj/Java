import java.util.Scanner;

public class swap {
    static void swap(int a , int b){
      int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("value of a&b:"+a+" "+b);

    }

    static void main() {
        System.out.println("hello");
        Scanner e= new Scanner(System.in);
        Scanner f= new Scanner(System.in);
        int a= e.nextInt();
        int b= f.nextInt();
        System.out.println("Value before Swap a: "+a+" b:"+b);

        swap(a,b);

    }
}
