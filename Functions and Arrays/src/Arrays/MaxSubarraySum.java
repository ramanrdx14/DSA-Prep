package Arrays;

public class MaxSubarraySum {
    public static void maxSubarraySum1(int[] arr){
        int maxSubarraySum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int ms = 0;
            for(int j=i;j<arr.length;j++){
                ms += arr[j];
                maxSubarraySum = Math.max(ms,maxSubarraySum);
            }
        }
        System.out.println(maxSubarraySum);
    }
    public static void maxSubarraySum2(int[] arr){
        //Kadane
    }

    public static void main(String[] args) {
        int[] arr = {-1,5,-8,11};
        maxSubarraySum1(arr);
        //maxSubarraySum2(arr);
    }
}
