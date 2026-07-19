import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int totalLines = 2 * n + 1;
        int currentLine= 1;
        int spaces     = n;
        int stars      = 1;
        while(currentLine <= totalLines){

            //spaces
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }

            for(int i=1;i<=stars;i++){
                System.out.print("*");
            }

            if(currentLine <= n){
                spaces--;
                stars+=2;
            }else{
                spaces++;
                stars-=2;
            }

            System.out.println();
            currentLine++;
        }
    }
}
