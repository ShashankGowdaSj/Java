package Day4;

public class paa {
    static void main() {
        String rahul ="           iam gamer \t hello ";
        String reddy= rahul.trim();
        System.out.println(reddy);
        String rai= rahul.replaceAll("\\s","");
        System.out.println(rai);
    }
}
