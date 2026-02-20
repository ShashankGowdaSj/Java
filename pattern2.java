import java.util.Scanner;
public class pattern2 {
    static void main(String[] args) {
        Scanner Sj=new Scanner(System.in);
        System.out.println("enter the value of pattern size");
        int size;
        size= Sj.nextInt();

        for(int i=0;i<size;i++){
            for(int space=0; space<size-i-1;space++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");}
            System.out.print("\n");
        }
        }
    }

