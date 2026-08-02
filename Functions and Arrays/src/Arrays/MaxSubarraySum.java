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

        int maxSubarraySum = Integer.MIN_VALUE;
        int currentSum     = 0;
        for(int i:arr){

            currentSum = currentSum + i;
            maxSubarraySum = Math.max(maxSubarraySum,currentSum);

            if(currentSum < 0){
                currentSum = 0; //new subarray sum creation from next index
            }
        }
        System.out.println(maxSubarraySum);
    }
    public static void maxSubarraySum3(int[] arr){
        //Kadane
        // print the max sum subarray
        int startingIndex = 0;
        int endingIndex   = 0;
        int maxSubarraySum = Integer.MIN_VALUE;
        int currentSum     = 0;
        for(int i=0;i<arr.length;i++){

            currentSum = currentSum + arr[i];
            if(currentSum > maxSubarraySum){
                endingIndex    = i;
                maxSubarraySum = currentSum;
            }

            if(currentSum < 0){
                startingIndex = i+1;
                currentSum = 0; //new subarray sum creation from next index
            }
        }

        System.out.println("Max Subarray starting and ending at ::: "+startingIndex+"-"+endingIndex);
    }

    public static void main(String[] args) {
        int[] arr = {-1,5,-8,11};
        maxSubarraySum1(arr);
        maxSubarraySum2(arr);
        maxSubarraySum3(arr);
    }
}
