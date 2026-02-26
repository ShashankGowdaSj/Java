package Day4;
import java.util.Arrays;

public class strArr {

    static void main() {
        String name= " for you";
        char[] arr = name.toCharArray();
        Arrays.sort(arr);

        System.out.println("Tadan tadan ");

        for(char c: arr){
            System.out.println(c);
        }
    }
}
