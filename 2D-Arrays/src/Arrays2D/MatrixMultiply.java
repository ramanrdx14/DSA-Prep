package Arrays2D;

import java.util.Scanner;

public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int m      = sc.nextInt();
        int x      = sc.nextInt();
        int y      = sc.nextInt();

        int[][] A  = new int[n][m];
        int[][] B  = new int[x][y];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                B[i][j] = sc.nextInt();
            }
        }

        int[][] ans = new MatrixMultiply().multiplyMatrix(A,B);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
    public int[][] multiplyMatrix(int[][] A,int[][] B){
        int[][] result = new int[A.length][B[0].length];
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                int ans = 0;
                for(int k=0;k<A[0].length;k++){
                    ans = ans + A[i][k] * B[k][j];
                }
                result[i][j] = ans;
            }
        }
        return result;
    }

}
