package Day6;

 class prg3  extends Thread{
 public   void run(){
     for (int i=0;i<=5;i++){
     System.out.println("my thread:"+i);
 }}


}
class dem{
    static void main(String[] args) {
        prg3 t2=new prg3();
        t2.start();
        for (int j=0;j<=5;j++){
            System.out.println("main thread:"+j);
        }
    }
}
