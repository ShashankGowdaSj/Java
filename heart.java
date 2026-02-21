import java.util.Scanner;
public class heart {
    static void main() {

        int boy=6,girl=7;

        for(int b=0;b<boy;b++){
            for (int g=0;g<girl;g++){
                if( b==0&& g%3!=0){System.out.print(" * ");

            } else if (b==1 && g%3==0){

               System.out.print(" * ");
           }
                else if (b-g==2) {

                        System.out.print(" * ");

                    } else if (b+g==8)
                    {
                        System.out.print(" * ");
                    }
                else {
                    System.out.print("  ");
                }


                }
       System.out.println();


            }
}}
