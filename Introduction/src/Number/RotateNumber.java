package Number;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number      = sc.nextInt();
        int k           = sc.nextInt();

        int digitCount = 0;

        int temp = number;
        while (temp > 0){
            digitCount++;
            temp/=10;
        }

        if(k%digitCount < 0){
            k+=digitCount;
        }else{
            k = k % digitCount;
        }
        int divisor = (int)Math.pow(10,k);
        int multiplier = (int) Math.pow(10,digitCount - k);

        int ans = (number%divisor)*multiplier + (number/divisor);
        System.out.println(ans);
    }
}

// 12345 k = 2 --> 45123

