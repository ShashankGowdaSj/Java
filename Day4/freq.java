package Day4;
import java.util.HashMap;


public class freq {
    static void main() {
        System.out.println("Today is my day");
        String text="Placement_training";


        HashMap<Character,Integer> sp=new HashMap<>();
        for(char c:text.toCharArray()){
            sp.put(c,sp.getOrDefault(c,0)+1);}
        System.out.println(sp);
            int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
            float sum=0,avg=0;
            for (int i:ages){
                sum+=i;

            }

            System.out.println(sum);
            for (int i:ages){
                avg=sum/8;

            }
        System.out.println(avg);



        }




    }


