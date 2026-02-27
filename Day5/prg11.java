package Day5;

public class prg11 {
    static void main() {
        System.out.println("india india");
        System.out.println("today is a good day");
        try {
            int num = (int) (Math.random() * 101);
            System.out.println(num);
            Integer[] nums = new Integer[50];

            int idx = 0;
            for (int i = 0; i <= 15; i++) {
                nums[idx++] = i;
            }
            for (int n : nums) {
                if (n <= 15) {
                    System.out.println(n);
                } else {
                    break;
                }
            }
        }
        catch (Exception e){
            System.out.println("Something went wrong please check the program correctly");
        }
    }
}
