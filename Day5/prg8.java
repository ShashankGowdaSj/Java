package Day5;

public class prg8 {
    void work(){
        System.out.println("work on yourself more than job");
    }
}
class snpsu extends prg8{
    void work() {
        super.work();
        System.out.println("my life my rules");
    }
}
class driver{
    static void main() {
        System.out.println("india is a vast country");
        snpsu shetty=new snpsu();
        shetty.work();
    }
}
