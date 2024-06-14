import java.util.*;
public class LengthOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int cnt = 0;
//        while(n>0){
//            cnt++;
//            n/=10;
//        }

        int cnt = (int)Math.log10(n)+1;
        System.out.println(cnt);
    }
}
