package PlacementTraining.Day1;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = pattern(n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static int[] pattern(int n){
        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = -2;

        int oddItem = 1;
        int evenItem = 2;

        boolean negative = false;
        int i = 0;
        while(i < n){
            if(i % 2 == 0){
                if(negative){
                    arr[i] = oddItem * -1;
                    negative = false;
                }else{
                    arr[i] = oddItem;
                    negative = true;
                }
                oddItem += 3;                
            }else{
                if(negative){
                    arr[i] = evenItem * -1;
                    negative = false;
                }else{
                    arr[i] = evenItem;
                    negative = true;
                }
                evenItem += 4;
            }
            i++;
        }

        return arr;
    }
}
