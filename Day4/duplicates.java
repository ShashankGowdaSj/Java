package Day4;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicates {
    static void main() {
        System.out.println("hello ,today is beautiful");
        Integer[] arr={1,2,3,2,3,3,7,4,5,6,6,7};
        for (int i:arr){
        System.out.print(i);}
        System.out.println();
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]);
                }
        }}
        System.out.println();
        Set<Integer> pat= new HashSet<>(Arrays.asList(arr));

        System.out.print(pat);

    }
}
