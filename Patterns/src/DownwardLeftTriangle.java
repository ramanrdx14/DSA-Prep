import java.util.Scanner;

public class DownwardLeftTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int spaces = 1;
        for(int i=1;i<=n;i++){

            //spaces
            for(int j=1;j<spaces;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            spaces++;
            System.out.println();
        }
    }
}
