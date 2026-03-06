package Day8;

import java.util.Scanner;
import java.util.Arrays;

public class linearsearch {

    static int linearsearch(int key, int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("Enter key to be searched:");
        int key = sc.nextInt();

        int result = linearsearch(key, arr);

        if(result != -1) {
            System.out.println("Element found at index: " + result);
        }
        else {
            System.out.println("Element not found");
        }
    }
}