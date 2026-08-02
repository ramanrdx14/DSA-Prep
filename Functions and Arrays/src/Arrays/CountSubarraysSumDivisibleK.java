package Arrays;

public class CountSubarraysSumDivisibleK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 5;
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum =0;
                for(int idx=i;idx<=j;idx++){
                    sum = sum + arr[idx];
                }
                //If sum divisible by  k then count karo
                if(sum % k == 0)count++;
            }
        }
        System.out.println(count);
    }
}
