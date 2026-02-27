package Day5;

public class prg6 {
    enum  step{
        Easy,
        medium,
        Hard
    }

    static void main() {
        step myvar=step.Easy;
        System.out.println(myvar);
        for (step i:step.values()){
            System.out.println(i);
        }

    }
}

