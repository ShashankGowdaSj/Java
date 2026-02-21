public class d3prg2 {
    int x;
    String name,level;
    double sal;
    float price;
    int y;


    public d3prg2(String post, int age){
         x=4;
        name="sahil";
        price=33.8f;
        sal=445.90d;
        y=age;
        level=post;

    }

    static void main() {
        System.out.println("today is Saturday");
        d3prg2 go=new d3prg2( "Money",19);
        System.out.println(go.x);
        System.out.println(go.name);
        System.out.println(go.sal);
        System.out.println(go.price);
        System.out.println(go.y);
        System.out.println(go.level);
        System.out.println("successfully constructor is used");

    }
}
