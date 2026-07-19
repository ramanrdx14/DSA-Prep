import java.util.Scanner;

public class NumberPattern3 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int currentLine = 1;
        int totalLines  = n;
        int stars       = 1;
        int spaces      = 2*n-3;
        while(currentLine <= totalLines){
            int number      = 1;
            for(int i=1;i<=stars;i++){
                System.out.print(number);
                number++;
            }

            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }

            if(currentLine == totalLines){
                stars--;
                number--;
            }
            for(int i=1;i<=stars;i++){
                System.out.print(--number);
            }

            System.out.println();
            stars++;
            spaces-=2;
            currentLine++;
        }
    }
}
