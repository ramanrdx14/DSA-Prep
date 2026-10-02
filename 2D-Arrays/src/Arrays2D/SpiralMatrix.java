package Arrays2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(new SpiralMatrix().spiralOrder(arr));
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n              = matrix.length;
        int m              = matrix[0].length;
        int total          = n * m;
        int count          = 0;

        int sr =0;
        int sc =0;
        int er=n-1;
        int ec=m-1;


        while(count < total){

            for(int i=sc;i<=ec && count < total;i++){
                list.add(matrix[sr][i]);
                count++;
            }
            sr++;

            for(int i=sr;i<=er && count < total;i++){
                list.add(matrix[i][ec]);
                count++;
            }
            ec--;

            for(int i=ec;i>=sc && count < total;i--){
                list.add(matrix[er][i]);
                count++;
            }
            er--;

            for(int i=er;i>=sr && count < total;i--){
                list.add(matrix[i][sc]);
                count++;
            }
            sc++;
        }
        return list;
    }
}
