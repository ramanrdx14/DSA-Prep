package Number;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x      = sc.nextInt();
        int y      = sc.nextInt();
        int temp1  = x;
        int temp2  = y;
        while(x != 0){
            int rem = y%x;
            y = x;
            x = rem;
        }
        System.out.println("GCD is : "+y);
        System.out.println("LCM is : "+((temp1*temp2)/y));
    }
}
