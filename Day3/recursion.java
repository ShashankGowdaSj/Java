import java.util.Scanner;

public class recursion {
static int addup(int k){
    if(k==0 |k<0){
        return 1;

    }
    else{
        return k+addup(k-1);
    }



}

    static void main() {
        System.out.println("Recursion in Sum");
        Scanner go= new Scanner(System.in );
        int k = go.nextInt();
        System.out.println("sum value is :"+addup(k));
    }}
