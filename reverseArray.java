import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        // approach 1
//        int brr[] = new int[arr.length];
//        for(int i =0;i<arr.length;i++){
//            brr[i] = arr[arr.length-1-i];
//        }
//        System.out.println("Array: "+Arrays.toString(arr));
//        System.out.println("reverse Array: "+Arrays.toString(brr));

        // it has TC:O(n) and SC:O(n);

        // approach 2

        System.out.println("Array: "+Arrays.toString(arr));
        int i =0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("reverse Array: "+Arrays.toString(arr));

        // by this method we can save the space complexity
    }
}
