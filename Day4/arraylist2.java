package Day4;

import java.util.ArrayList;
import java.util.Collections;


public class arraylist2 {
    static void main() {
        ArrayList<Integer> Rai=new ArrayList<>();
        ArrayList<Integer> Red=new ArrayList<>();
        Rai.add(9);
        Rai.add(2);
        Rai.add(8);
        Rai.add(4);
        Rai.add(5);
        Rai.add(6);
        System.out.println(Rai);
        Collections.sort(Rai);
        for (int i:Rai){
            System.out.println(i);
            Red.add(i);
        }
        System.out.println(Red);


    }
}
