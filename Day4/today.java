package Day4;

abstract  class today{
   abstract  void run();
    abstract void wakeup();
    void breakfast(){
        System.out.println("i had what about you");
    }

}
 class yesterday extends today{
    public void run(){
        System.out.println("yesterday is history");

    }
    public void wakeup(){
        System.out.println("5am");
    }


    }


 class tommorow extends today{
    public void run(){
        System.out.println("tommorow is mystery");
    }
    public void wakeup(){
        System.out.println("first wake up tommorrow");
    }
 }
 class Pain {
     static void main(String[] args) {

         {
             tommorow b = new tommorow();
             b.run();
             b.wakeup();
             b.breakfast();
             yesterday y = new yesterday();
             y.run();
             y.wakeup();
             y.breakfast();
             System.out.println("but today is beautiful");

         }
     }
 }

