package Day8;
import java.util.Scanner;
import java.util.Arrays;
public class binarysearch {
    static int binarySearch(int key, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[mid] == key) {
                return mid;
            }

            else if(arr[mid] < key) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
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

        Arrays.sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        System.out.println("Enter key to search:");
        int key = sc.nextInt();

        int result = binarySearch(key, arr);

        if(result != -1) {
            System.out.println("Element found at index: " + result);
        }
        else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}