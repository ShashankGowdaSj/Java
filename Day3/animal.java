class animal {
    void  sound(){
        System.out.println("most of the animals are non-veg");

    }
}
class cat extends animal{
    void sound(){
        System.out.println("Meow-Meow");
    }
}
class dog extends animal{
    void sound(){
        System.out.println(" bow -bow");
    }
}
class lion extends animal{
    void  sound(){
        System.out.println("meow....");

    }

}

void main() {
    System.out.println("me and me");
    animal me=new animal();
    animal me1= new dog();
    animal me2= new lion();
    animal me3= new cat();


    me.sound();
    me3.sound();
    me2.sound();
    me1.sound();
    System.out.println("hello hello");


}
