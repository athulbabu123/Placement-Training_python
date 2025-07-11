package Day3;

public class MaximumWaterContainer {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int capacity = maximumCapacity(arr);
        System.out.println(capacity);
    }

    static int maximumCapacity(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int capacity = 0;

        while(start < end){
            int height = Math.min(arr[start],arr[end]);
            int width = end - start;
            int newCapacity = height * width;
            if(newCapacity > capacity){
                capacity = newCapacity;
            }
            if(arr[start] < arr[end]){
                start++;
            }else{
                end--;
            }
            
        }

        return capacity;
    }
}
