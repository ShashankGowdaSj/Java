package Day5;
import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.Collections;



public class prg12 {
    static void main() {
        System.out.println("have beautiful thursday");
        String[] fruits={ "withseed","seedless","papaya","guava","Helo"};
        List<String> list=Arrays.asList(fruits);
        for(String i:fruits){
            System.out.println(i);
        }
        Collections.sort(list);
        for(String j:list){
            System.out.println(j);
        }

    }
}
