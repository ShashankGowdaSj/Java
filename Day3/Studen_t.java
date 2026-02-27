class Studen_t {
    char section;
    int year ;
    String fname;
    String lname;
     Studen_t(char sec, int year, String fname ,String lname){
        this.section=sec;
        this.year=year;
        this.fname=fname;
        this.lname=lname;

    }
}
class Cse   extends Studen_t{
    int usn;
    Cse(char sec, int year, String fname ,String lname,int n){
        super( sec ,year, fname, lname);
        this.usn=n;

    }}

class main {
    static void main(String[] args) {
        Studen_t s1 = new Studen_t('B', 2023, "shashu", "gowda");
        Cse s2= new Cse('B',2024,"rai","rohith",93);
        System.out.println(s2);

    }
}
