package Arrays2D;
import java.util.*;
public class PrintExitPoint {
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
        System.out.println(new PrintExitPoint().exitPoint(arr));
    }
    public List<Integer> exitPoint(int[][] mat) {

        List<Integer> list = new ArrayList<>();
        int row = 0;
        int col = 0;
        char direction = 'R';
        while(row >=0 && row <mat.length && col >=0 && col <mat[0].length){
            if(mat[row][col] == 0){
                if(direction == 'R'){
                    col++;
                }else if(direction == 'D'){
                    row++;
                }else if(direction == 'L'){
                    col--;
                }else if(direction == 'U'){
                    row--;
                }
            }else{
                mat[row][col] = 0;
                if(direction == 'R'){
                    direction = 'D';
                    row++;
                }else if(direction == 'D'){
                    direction = 'L';
                    col --;
                }else if(direction == 'L'){
                    direction = 'U';
                    row--;
                }else if(direction == 'U'){
                    direction = 'R';
                    col++;
                }
            }

        }

        if(row < 0)row++;
        if(col < 0)col++;
        if(row == mat.length)row--;
        if(col == mat[0].length)col--;
        list.add(row);
        list.add(col);
        return list;
    }
}
