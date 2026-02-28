package Day6;

 class prg5 extends Thread {
     public void run(){
         for (int i=1;i<=5;i++){
             System.out.println("Child:"+i);
         }
     }
}
class Dmo{
    static void main(String[] args)  throws Exception{
        prg5 t1=new prg5();
        t1.start();



        t1.join();
        System.out.println("Main Thread Finished");
    }
}