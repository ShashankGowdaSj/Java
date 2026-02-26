package Day4;
import java.util.LinkedList;
import java.util.Collections;

public class linkedlist {
    static void main() {
        LinkedList<Integer> pram=new LinkedList<>();
        pram.addFirst(2);
        pram.addLast(7);
        pram.add(5);
        pram.add(9);
        System.out.println(pram);
        Collections.sort(pram);
        for (int i:pram){
            System.out.println(i);
        }


    }
}
