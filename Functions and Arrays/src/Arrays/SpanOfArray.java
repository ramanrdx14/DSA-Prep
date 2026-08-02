package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

//Max - Min is the span of array
public class SpanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size ::");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements ::");
        for(int i=0;i<size;i++)arr[i] = sc.nextInt();
        System.out.println(span(arr));

    }
    public static int span(int[] arr){
        if(arr.length == 0)return 0;
        if(arr.length == 1)return arr[0];
        int span = Math.subtractExact(Arrays.stream(arr).max().getAsInt(),Arrays.stream(arr).min().getAsInt());
        return span;
    }
}
