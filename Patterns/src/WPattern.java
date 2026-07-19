import java.util.Scanner;

public class WPattern {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int totalLines  = n;

        for(int i=0;i<totalLines;i++){
            for(int j=0;j<totalLines;j++){
                if(j == 0 || j == n-1 || ((i+j == n -1) && i >= n/2) || (i == j && i >= n/2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
