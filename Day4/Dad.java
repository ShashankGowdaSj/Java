
package Day4;

interface Dad{
    default void cook(){
        System.out.println("chinees");
    }


}
interface mom{
    default void cook(){
        System.out.println("indian");
    }
}
class child implements Dad,mom {
    @Override
    public void cook () {
        Dad.super.cook();
    }
}

class drive{
    static void main(String[] args) {
        child C =new child();
        C.cook();
    }
}

