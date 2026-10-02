package Arrays2D;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int m      = sc.nextInt();
        int[][] A  = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j] = sc.nextInt();
            }
        }
        new Transpose().transpose(A);
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void transpose(int[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=i;j<A[0].length;j++){
                int temp = A[i][j];
                A[i][j]  = A[j][i];
                A[j][i]  = temp;
            }
        }
    }
}
