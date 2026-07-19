import java.util.Scanner;

public class HollowGlass {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int currentLine = 1;
        int totalLines  = n;
        int spaces      = 1;
        int stars       = n;
        while(currentLine <= totalLines){

            //print spaces
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }

            //print stars
            for(int i=1;i<=stars;i++){
               if(currentLine != 1 && currentLine <= n/2 && i > 1 && i < stars){
                   System.out.print(" ");
               }else{
                   System.out.print("*");
               }
            }

            if(currentLine <= n/2){
                spaces++;
                stars-=2;
            }else{
                spaces--;
                stars+=2;
            }
            //prepare for next line
            System.out.println();
            currentLine++;

        }
    }
}
