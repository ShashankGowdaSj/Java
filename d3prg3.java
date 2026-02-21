public class d3prg3 {
    int x;
    String name;
    float price;
    String modelname;
    static void mydemo(){
        System.out.println("Today is a good day");

    }
    public d3prg3(int x, String name, float price, String car_name){
      this.x=x;
      this.name=name;
      this.price=price;
      this.modelname=car_name;


    }



    public d3prg3(String car_name){
        this(5,"rohith",45.56f,car_name);


    }

    static void main() {
        System.out.println("hello Shashu");
        d3prg3 shas= new d3prg3(3,"Gowda", 34.77f,"Thar");
        d3prg3 sj=new d3prg3("wolkswagen");


        System.out.println(shas.name);
        System.out.println(shas.x);
        System.out.println(shas.price);
        System.out.println(shas.modelname);
        System.out.println("hi hello ");
        System.out.println(sj.modelname);
        System.out.println(sj.name);
        System.out.println(sj.price);
        System.out.println(sj.x);
        mydemo();
        Student jav= new Student();// abstract class inherited class

        System.out.println(jav.dob);
        System.out.println(jav.name);
        System.out.println(jav.y);
        jav.study();
    }
}
