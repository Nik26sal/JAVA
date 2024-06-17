package Assignment2;

import java.util.*;

public class ThirdMAx {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)arr[i] =sc.nextInt();
        System.out.println(maxThird(arr));
    }

    private static int maxThird(int[] arr) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        boolean aFound = false;
        boolean bFound = false;
        boolean cFound = false;

        for (int i = 0; i < arr.length; i++) {
            if ((aFound && arr[i] == a) || (bFound && arr[i] == b) || (cFound && arr[i] == c)) {
                continue;
            }

            if (!aFound || arr[i] > a) {
                c = b;
                cFound = bFound;
                b = a;
                bFound = aFound;
                a = arr[i];
                aFound = true;
            } else if (!bFound || arr[i] > b) {
                c = b;
                cFound = bFound;
                b = arr[i];
                bFound = true;
            } else if (!cFound || arr[i] > c) {
                c = arr[i];
                cFound = true;
            }
        }

        return cFound ? c : a;
    }
}
