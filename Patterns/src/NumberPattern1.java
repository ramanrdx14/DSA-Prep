import java.util.Scanner;

public class NumberPattern1 {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int currentLine = 1;
        int totalLine   = n;
        int numbers     = 1;
        while(currentLine<=totalLine){

            for(int i=1;i<=currentLine;i++){
                System.out.print(numbers+"\t");
                numbers++;
            }

            System.out.println();
            currentLine++;

        }
    }

}

/*

1
2 3
4 5 6
7 8 9 10

 */