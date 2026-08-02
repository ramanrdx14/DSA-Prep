package Arrays;
//Brute - Force
public class CountSubarraysSumK {

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
                //If sum == k then count karo
                if(sum == k)count++;
            }
        }
        System.out.println(count);
    }
}
