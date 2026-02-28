package Day6;

class MyThread extends Thread {
    public void run(){
        System.out.println("thread is running");
    }

}
class demo{
    static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
    }
}