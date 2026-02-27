package Day5;

interface prg5 {

    void  run();
    void eat();
    void fun();


}


class car implements prg5{
    @Override
    public void run() {
        System.out.println("bhaago");

    }

   public void eat(){
       System.out.println("Eat 3 times a day");
   }


    public void fun() {
        System.out.println("Sleep in class during java training ");

    }
}
class Tiger{
    static void main() {
        car bmw=new car();
        bmw.eat();
        bmw.run();
        bmw.fun();
    }
}