package Day6;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

public class prg2 {
    static void main(String[] args)  throws Exception{
        String str;
        BufferedReader sj=null;

        try {
            sj=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("enter something:");
            str= sj.readLine();
            System.out.println("you Entered:"+str);


        }finally {
            sj.close();
            System.out.println("Good morning ");
        }

    }
}
