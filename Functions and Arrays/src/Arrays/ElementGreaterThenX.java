package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ElementGreaterThenX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size ::");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements ::");
        for(int i=0;i<size;i++)arr[i] = sc.nextInt();

        System.out.println("Enter number ::");
        int x = sc.nextInt();

        System.out.println(findNumberGreaterThenX(x,arr));

    }
    public static int findNumberGreaterThenX(int x,int[] arr){
        return (int)Arrays.stream(arr).filter(i -> i > x).count();
    }
}
