package Day8;

public class BoyerMooreVoting {
    static void main(String[] args) {
        int[] arr={2,2,3,4,1,2,3,3,3,3,3,3,1,2,2,3};
        int candidate=arr[0];
        int count=1;
        for (int i=1;i<arr.length;i++){
            if(arr[i]==candidate){
                count++;

            }
            else {
                count--;
            }
            if (count==0){
                candidate=arr[i];
                count=1;

            }
        }
        System.out.println("majority element:"+candidate);
    }

}
