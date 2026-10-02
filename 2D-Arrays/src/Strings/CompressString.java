package Strings;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s   = sc.next();

        System.out.println(compress(s));
    }
    public static String compress(String str){
        int i = 1;
        String ans = ""+str.charAt(0);
        while(i < str.length()){
            if(str.charAt(i) == str.charAt(i-1)){
                i++;
                continue;
            }else{
                ans = ans.concat(str.charAt(i)+"");
            }
            i++;
        }

        return ans;
    }
}
