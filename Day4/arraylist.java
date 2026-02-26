package Day4;

import java.util.ArrayList;

public class arraylist {
    static void main() {


        ArrayList<String> sj = new ArrayList<>();
        sj.add("Hello");
        sj.add("Shas");
        sj.add(0,"Rahul");
        String rai=sj.get(2);
        Integer Sj=sj.size();
        System.out.println(rai);
        System.out.println(Sj);
        System.out.println(sj);
        sj.clear();
        System.out.println(sj);



    }

}
