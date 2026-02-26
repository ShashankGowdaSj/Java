package Day4;

 class lowest {
    static void main() {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 2,70};
        int lowest=ages[0];
        for(int i:ages){
            if(i<lowest){
                lowest=i;
            }

        }
        System.out.println(lowest);
        int largest = ages[0];
        for (int n : ages) {
            if (n > largest) {
                largest = n;
            }

        }
        System.out.println(largest);
    }
    }



