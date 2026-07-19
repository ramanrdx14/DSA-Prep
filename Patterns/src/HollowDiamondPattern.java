import java.util.Scanner;

public class HollowDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int currentLine = 1;
        int totalLines  = 2*n+1;
        int stars       = n+1;
        int spaces      = 1;
        while (currentLine <= totalLines){
            //starts
            for(int i=1;i<=stars;i++){
                System.out.print("*");
            }

            //spaces
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }

            //starts
            for(int i=1;i<=stars;i++){
                System.out.print("*");
            }

            if(currentLine <= n){
                spaces+=2;
                stars--;
            }else{
                spaces-=2;
                stars++;
            }
            currentLine++;
            System.out.println();
        }
    }
}

/*

3
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****

 */