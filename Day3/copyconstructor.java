public class copyconstructor {
    String name;
    int usn;
    copyconstructor(String name,int usn) {
        this.name = name;
        this.usn = usn;
    }

    copyconstructor(copyconstructor god){
        this.name = god.name;
        this.usn = god.usn;
    }
    void display(){
        System.out.println(name+","+usn);
    }
}
class Drive {
    static void main(String[] args) {
        copyconstructor shas1 = new copyconstructor("Shashu", 99);
        copyconstructor shas2 = new copyconstructor(shas1);
        shas1.display();
        shas2.display();
    }
}