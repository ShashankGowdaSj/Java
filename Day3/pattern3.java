import java.util.Scanner;
public class pattern3 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of pattern size");
        int size;
        size= sc.nextInt();

        for(int i=0;i<size;i++){
            for(int space=0; space<size-i-1;space++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");}
            System.out.print("\n");
        }
        for(int i=size-2;i>=0;i--){
            for(int space=0; space<size-i-1;space++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");}
            System.out.print("\n");
        }

    }
}
