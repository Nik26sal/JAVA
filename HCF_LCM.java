import java.util.*;
public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int a = n1;
        int b = n2;
        while(a != 0){
            if(a<b){
                int temp = a;
                a = b;
                b = temp;
            }
            a = a%b;
        }
        System.out.println("HCF: "+b);

        int lcm = (n1*n2)/b;
        System.out.println("LCM: "+lcm);
    }
}
