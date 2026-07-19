import java.util.Scanner;

public class LeftRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int spaces = n - 1;
        for(int i=1;i<=n;i++){

            //spaces
            for(int j=spaces;j>=1;j--){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
            spaces--;
        }
    }
}
