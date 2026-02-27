public class prg1 {
    static void main() {
        int age=19;
        String result= age>18? "voting_eligible ": "Not_eligible";
        System.out.println("RES:"+result);
        int b=0;
        while(b<=5){
            System.out.println(+b);
            b++;
        }
        for( int i=0; i<=10;i=i+2){
            System.out.println(i);
        }
        int[] nums={1,2,3,4,5,6,7,8};
        for( int n: nums){
            System.out.println(n);
        }
        String[] cars={"BMW","ford","audi"};
        cars[0]="Mahindra";
        System.out.println(cars[1]);
        System.out.println(cars[0]);
        int z= cars.length;
        System.out.println(z);
        for(String c:cars){
            System.out.println(c);
        }
        int [][] numbers ={{1,0,3},{0,9,8}};
        System.out.println(numbers[0][1]);
        System.out.println(numbers[0][0]);
    }
}
