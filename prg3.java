public class prg3 {
    static int reddy(int a ,int b){
        System.out.println("the Value of multiplication");
        return a*b;
    }
    static float reddy(float a, float c){
        return a+c;
    }
    static void reddy(String full_name){
        System.out.println("NS Gurucharan "+"Reddy"+ full_name);

    }
    static double reddy(double m, double n){
        return m*n;
    }
}

static void main() {
    System.out.println("India is my country");
    int value= prg3.reddy(4,5);
    float sum = prg3.reddy(3.2f,6.4f);
    double mul= prg3.reddy(5.55d,3.99d);
    System.out.println(value);
    System.out.println(mul);
    System.out.println(sum);
//    System.out.println(prg3.reddy("volleyball"));
}
