package Number;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int revNumber = 0;
        while(n > 0){
            int lastDigit = n%10;
            revNumber = revNumber * 10 + lastDigit;
            n/=10;
        }
        System.out.println(revNumber);
    }
}
// 1234 ==> if we want to attach a number to its back then (multiply the number with 10 + add number)
// Ex : 1234 attach 9 ==> 1234 * 10 + 9 = 12349