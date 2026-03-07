package Day9;


class Generics<T>{
    T obj;
    Generics(T obj){
        this.obj=obj;
    }
    void print(){
        System.out.println("excuse me:"+obj);
    }

    }

class drive{
    static void main(String[] args) {
        Generics<Integer> ob1=new Generics<>(15);
        Generics<String>ob2=new Generics<>("hello babe");
        ob2.print();
        ob1.print();
        System.out.println("today is saturday");

    }
}
