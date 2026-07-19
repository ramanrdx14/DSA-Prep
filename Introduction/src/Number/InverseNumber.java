package Number;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();

        int index  = 1;
        int inverse = 0;
        while(n > 0){
            int lastDigit = n % 10;
            inverse = inverse + index * (int)Math.pow(10,lastDigit-1);
            n/=10;
            index++;
        }
        System.out.println(inverse);
    }
}
// 4 3 2 1
// 3 1 4 2
// 2 4 1 3