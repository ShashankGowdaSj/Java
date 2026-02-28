package Day6;

class Mytask implements  Runnable {

    public void run() {
        System.out.println("Thread is running");

    }
}
class  demo1{
    static void main(String[] args) {
        Mytask obj= new Mytask();
        Thread t1= new Thread(obj);
        Thread t2= new Thread(obj);
        t1.start();
        t2.start();
    }
}
