package Day6;


class prg4 implements  Runnable {

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("My Thread :" + i);

        }
    }

}
class demo2 {
        static void main(String[] args) {
            prg4 obj = new prg4();
            Thread t1 = new Thread(obj);

            t1.start();
            for (int j=0;j<=5;j++){
                System.out.println("Main Thread:"+j);
            }
        }
    }

