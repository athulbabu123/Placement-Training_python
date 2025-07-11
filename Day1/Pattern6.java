package PlacementTraining.Day1;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr  = new int[n];
        arr = pattern(n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static int[] pattern(int n){
        int[] arr = new int[n];

        int num = 2;
        int i = 0;
        int count = 0;
        while(count < n){
            arr[i] = num * num;
            i += 1;
            num += 2;
            count++;
        }
        return arr;
    }
}
