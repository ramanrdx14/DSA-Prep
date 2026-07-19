import java.util.Scanner;

public class ArrayPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i == j || (i + j == n - 1)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
//comment
// 00 01 02 03
// 10 11 12 13
// 20 21 22 23
// 30 31 32 33
