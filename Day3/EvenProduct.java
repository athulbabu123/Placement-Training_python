package Day3;

public class EvenProduct {
    public static void main(String[] args) {
        int[] arr = {23,45,65,45,34,32,30};
        int product = evenProductValue(arr);
        System.out.println(product);
    }
    static int evenProductValue(int[] arr){
        int product = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                product *= arr[i];
            }
        }
        return product;
    }
}
