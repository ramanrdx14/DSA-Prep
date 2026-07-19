import java.util.Scanner;

public class ArrowPattern {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int currentLine = 1;
        int totalLine   = n;
        int stars       = 1;
        while (currentLine <= totalLine){
            //spaces

            if(currentLine == (n/2)+1){
                System.out.print("**");
            }else{
                System.out.print("  ");
            }

            //stars

            for (int i=1;i<=stars;i++){
                System.out.print("*");
            }

            if(currentLine <= n/2){
                stars++;
            }else{
                stars--;
            }


            //prepare  next line
            System.out.println();
            currentLine++;
        }
    }
}
