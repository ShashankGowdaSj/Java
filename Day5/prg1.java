package Day5;

public class prg1 {
    static void main() {
        String name="pramod shetty";
        String ot="PRAMOD shetty";
        int age= 5;
        boolean isit=true;
        String bob="";
        String Sur_name="Shettru";
        System.out.println(name.length());
        System.out.println(name.charAt(4));

        System.out.println(name.toLowerCase());

        System.out.println(Sur_name.toUpperCase());

        System.out.println(name.concat(Sur_name));
        System.out.println(name.endsWith("shetty"));
        System.out.println(name.compareToIgnoreCase(ot));
        System.out.println(bob.isEmpty());
        System.out.println(ot.toLowerCase());
        System.out.println("today is a good day");

    }
}
