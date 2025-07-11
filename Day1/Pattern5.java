package PlacementTraining.Day1;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 9;
        int[] arr;
        arr = pattern(n);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static int[] pattern(int n){
        int size = n - (n / 4);
        int[] arr = new int[size];
        int num = 1;
        int index = 0;
        while(num <= n){
            if(num % 4 != 0){
                arr[index] = num * num;
                index++;
                num++;
            }else{
                num++;
            }
        }
        return arr;
    }
}
