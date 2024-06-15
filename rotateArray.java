import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int k =3;
        System.out.println("Array : "+ Arrays.toString(arr));
        //approach 1 Brute-Force
//        int b[] = new int[arr.length];
//        int d =0;
//        for(int i = arr.length-k;i<arr.length;i++){
//            b[d++] = arr[i];
//        }
//        for(int i=0;i<arr.length-k;i++){
//            b[d++] = arr[i] ;
//        }
//        System.out.println(" Rotate Array: "+Arrays.toString(b));

        // approach 2 optimal
        k = k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        System.out.println("Rotate Array: "+Arrays.toString(arr));
    }

    private static void reverse(int[] arr,int i,int j) {
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
}
