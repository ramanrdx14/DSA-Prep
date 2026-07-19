package Functions;

public class BinaryToDecimal {
    public static  int binaryToDecimal(int number){
        int pow2   = 1;
        int ans    = 0;
        while(number > 0){
            int digit = number % 10;
            ans       = ans + digit * pow2;
            number = number / 10;
            pow2 = pow2 * 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int number = 101;
        int ans    = binaryToDecimal(number);
        System.out.println(ans);
    }
}
