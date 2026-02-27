package Day5;

public class prg3 {
    static void main() {
        System.out.println("hello");
        try {


            String name = "Aravind";
            int year = 1980;
//            int bobby= year/0;
//            System.out.println(bobby);

            int[] nums={1,2,3,4};
            System.out.println(nums[8]);
            System.out.println("try and catch blocks");


        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("dekhele bhai size kitna bahr kyu jaa rahe hoo");
        }
        catch (ArithmeticException e){
            System.out.println("mind your business");
        }
        catch (Exception e){
            System.out.println("you made wrong in the code");
        }

    }
}
