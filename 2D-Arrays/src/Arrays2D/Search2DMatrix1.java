package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class Search2DMatrix1 {
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
        System.out.println(new Search2DMatrix1().searchMatrix(A,target));
    }

    private boolean searchMatrix(int[][] matrix, int target) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            int start = 0;
            int end   = rows-1;
            while(start<=end){
                int mid = (start+end)/2;
                if(matrix[mid][cols-1] > target){
                    end = mid -1;
                }else if(matrix[mid][cols-1] < target){
                    start = mid + 1;
                }else{
                    return true;
                }
            }
            //That means my ans can lie between start and rows
            if(start < rows){
                if(Arrays.binarySearch(matrix[start],target) >= 0)return true;
            }
            return false;

    }
}
