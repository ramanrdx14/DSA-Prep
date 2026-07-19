import java.util.Scanner;

public class BridgePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int currentLine = 1;
        int totalLine   = n;
        int spaces      = 2*n - 3;
        int stars       = 1;
        while (currentLine <= totalLine){
            //stars
            for (int i=1;i<=stars;i++){
                System.out.print("*");
            }

            //spaces
            for (int i=1;i<=spaces;i++){
                System.out.print(" ");
            }

            if(currentLine == totalLine){
                stars--;
            }
            //stars
            for (int i=1;i<=stars;i++){
                System.out.print("*");
            }

            System.out.println();
            stars++;
            spaces-=2;
            currentLine++;
        }
    }
}
