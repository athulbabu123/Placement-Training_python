package Day3;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int[] index = twoSum(arr, target);
        System.out.println(index[0]);
        System.out.println(index[1]);

    }
    static int[] twoSum(int[] arr,int target){
        int[] index = {-1,-1};
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int sum = arr[start] + arr[end];
            if(sum > target){
                end--;
            }else if(sum < target){
                start++;
            }else{
                index[0] = start;
                index[1] = end;
                return index;
            }
        }

       

        return index;
    }
}
