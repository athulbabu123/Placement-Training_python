package PlacementTraining.Day1;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        arr = pattern(n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static int[] pattern(int n){
        int[] arr = new int[n];

        arr[0] = 1;
        int first = 1;
        int next = 3;
        int i = 1;
        while(i < n){
            arr[i] = first + next;
            next += 2;
            i++;
        }

        return arr;
    }
}
