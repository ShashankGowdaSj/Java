package Day4;
interface Animal12 {
    public void animalSound();
    public void sleep();
}
class Pig implements Animal12 {
    public void animalSound() {

        System.out.println("The pig says: wee wee");
    }
    public void sleep() {

        System.out.println("Zzz");
    }
}

class Mum {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}