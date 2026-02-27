package Day5;

public class prg13 {
    static void main() {
        String name="Reddy";
        String f_name="gc";
        int age=12;
        try {
            System.out.println(age/0);
        }
        catch (ArithmeticException e){
            System.out.println("i know you don't have brain ");

        }
        catch (Exception e){
            System.out.println("Toda toda");
        }
    }

}
