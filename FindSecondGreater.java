public class FindSecondGreater {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,3,4,4};
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            }
            else if(arr[i] != max && arr[i] > second_max){
                second_max = arr[i];
            }
        }
        System.out.println(second_max);
    }
}
