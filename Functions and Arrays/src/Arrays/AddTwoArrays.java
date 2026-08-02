package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int m      = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=0;i<n;i++)arr1[i]= sc.nextInt();
        for(int i=0;i<m;i++)arr2[i]= sc.nextInt();
        int[] add = add(arr1, arr2);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<add.length && add[i] != Integer.MIN_VALUE;i++) sb.append(add[i]);
        System.out.println(sb);
    }
    public static int[] add(int[] arr1,int[] arr2){
        int maxSize = Math.max(arr1.length,arr2.length);
        int[] ans   = new int[maxSize + 1];
        int carry   = 0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = ans.length-1;
        Arrays.fill(ans,Integer.MIN_VALUE);

        while(k >= 0){
            int currSum =0;
            if(i >= 0){
                currSum +=arr1[i];
            }

            if(j >=0){
                currSum +=arr2[j];
            }

            if(currSum + carry > 9){
                ans[k] = (currSum + carry) % 10;
                carry  = (currSum + carry) / 10;
            }else{
                ans[k] = (currSum + carry);
                carry  = 0;
            }
            i--;
            j--;
            k--;
        }
        if(ans[0] == 0)ans[0] = Integer.MIN_VALUE;
        return ans;
    }
}
