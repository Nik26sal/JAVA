package Assignment2;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,4};
        arr = move(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] move(int[] nums) {
        int idx   =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                idx++;
            }
        }
        return nums;
    }
}
