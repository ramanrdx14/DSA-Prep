package Strings;

import java.util.Scanner;

public class CompressString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s   = sc.next();

        System.out.println(compress(s));
    }
    public static String compress(String str){
       String ans = "";
       ans +=str.charAt(0);
       int i = 1;
       int count = 1;
       while(i < str.length()) {
           if (str.charAt(i) == str.charAt(i - 1)) {
               count++;
           } else { //new character aagya
               if (count > 1) { //agar count > 1 to add count to the ans string
                   ans += count;
               }
               ans += str.charAt(i);  // add new character
               count = 1; // re-initialize count with 1 for new character
           }
           i++;
       }
        if (count > 1) { //agar count > 1 to add count to the ans string
            ans += count;
        }
       return  ans;
    }
}

// abbccdddaaba
// ab2c2d3a2ba