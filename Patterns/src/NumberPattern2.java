import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int currentLine = 1;
        int totalLine   = 2 * n + 1;
        int spaces      = n;
        int stars       = 1;
        int startnumber = 1;
        while (currentLine<=totalLine){

            for(int i=1;i<=spaces;i++){
                System.out.print("\t");
            }
            int number      = startnumber;
            for(int i=1;i<=stars;i++){
                System.out.print(number+"\t");
                if(i <=  stars/2){
                    number++;
                }else{
                    number--;
                }
            }

            if(currentLine <= n){
                spaces--;
                stars+=2;
                startnumber++;
            }else{
                spaces++;
                stars-=2;
                startnumber--;
            }
            System.out.println();
            currentLine++;

        }
    }
}
