package Arrays;

import java.util.StringJoiner;

public class PrintSubsets {
    public static void main(String[] args) {
       int[] arr = {1,2,3};

       int totalSubset = (int)(Math.pow(2,arr.length));
        StringJoiner sj = new StringJoiner(",","{","}");
       for(int i=0;i<totalSubset;i++){

           //convert to binary
           int curr_num = i;

           for(int idx = arr.length-1;idx>=0;idx--){
               if(curr_num %2 == 0){
                   sj.add("");
               }else{
                   sj.add(arr[idx]+"");
               }
               curr_num/=2;
           }
           sj.add(";");
       }
        System.out.println(sj);
    }
}

