import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
//        for(int i =0;i<n;i++){
//            for(int j =0;j<=i;j++){
//                int t = fac(i)/(fac(i-j)*fac(j));
//                System.out.print(t+" ");
//            }
//            System.out.println();
//        }

        for(int i =0;i<n;i++){
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    private static int fac(int i) {
        int mul = 1;
        while(i>0){
            mul*=i;
            i--;
        }
        return mul;
    }
}
