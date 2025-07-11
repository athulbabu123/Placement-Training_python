package Day3;

import java.util.Scanner;

public class Adjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {3,4,5,6,2,7};
        int target = sc.nextInt();
        int index = findIndex(nums, target);
        int leftAdj = leftAdjacent(nums, index);
        int rightAdj = rightAdjacent(nums, index);
        if(leftAdj != -1){
            System.out.println(leftAdj);
        }
        if(rightAdj != -1){
            System.out.println(rightAdj);
        }
    }

    static int findIndex(int[] arr,int target){
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                index = i;
            }
        }
        return index;
    }

    static int leftAdjacent(int[] arr,int index){
        int adjacent = -1;
        if(index != 0){
            adjacent = arr[index - 1];
        }
        return adjacent;
    }

    static int rightAdjacent(int[] arr,int index){
        int adjacent = -1;
        if(index != arr.length-1){
            adjacent = arr[index + 1];
        }
        return adjacent;
    }
}
