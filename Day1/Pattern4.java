package PlacementTraining.Day1;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = pattern(n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static int[] pattern(int n){
        int[] arr = new int[n];

        int i = 1;
        while(i <= n){
            arr[i-1] = (int)Math.pow(i,i);
            i++;
        }


        return arr;
    }
}
