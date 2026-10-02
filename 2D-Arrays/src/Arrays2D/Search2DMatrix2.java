package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class Search2DMatrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int m      = sc.nextInt();
        int target = sc.nextInt();
        int[][] A  = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println(new Search2DMatrix2().searchMatrix(A,target));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;


        int row = 0;
        int col = m -1;

        while(row < n && col >=0){

            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target){
                col --;
            }else{
                row ++;
            }
        }
        return false;
    }
}
