package Assignment2;

public class sortedAurNot {

    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};//true
        System.out.println(check(arr));
    }

    private static boolean check(int[] arr) {
        int n = arr.length;
        int k = -1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                k = i + 1;
                break;
            }
        }

        if (k == -1) return true;

        for (int i = k; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }

        return arr[n - 1] <= arr[0];

    }
}
