package PlacementTraining.Day1;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 13;
        int[] arr = pattern(n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static int[] pattern(int n){
        int size = n - (n / 4);
        int[] arr = new int[size];

        boolean negative = false;

        int count = 1;
        int index = 0;
        while(count <= n){
            if(count % 4 != 0){
                if(!negative){
                    arr[index] = count;
                    negative = true;
                }else{
                    arr[index] = count * -1;
                    negative = false;
                }
                index++;
                count++;
            }else{
                count++;
            }
        }
            


        return arr;
    }
}
