package Day5;




import java.sql.SQLOutput;

public class bufferd {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("placement");
        for(int i = 0; i < 100000; i++) {
            sb.append("Training");
        }
        System.out.println("time: " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        StringBuffer sb2 = new StringBuffer("placement");
        for(int i = 0; i < 100000; i++) {
            sb2.append("Training");
        }
        System.out.println("time: " + (System.currentTimeMillis() - startTime));
    }
}