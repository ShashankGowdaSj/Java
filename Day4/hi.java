package Day4;

public class hi {
    static void main() {


    String text = "Malayalam";
    String reversed = new StringBuilder(text).reverse().toString();

if (text.equalsIgnoreCase(reversed)) {
        System.out.println(text + " is a palindrome");
    }
else {
        System.out.println(text + " is not a palindrome");
    }
}}
