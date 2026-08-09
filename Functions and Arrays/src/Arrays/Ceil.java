package Arrays;

public class Ceil {
    public int findCeil(int[] arr, int x) {
        int start = 0;
        int end   = arr.length-1;
        int floor = Integer.MIN_VALUE;
        int ceil  = -1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]  >= x){
                ceil = mid;
                end   = mid -1;

            }else{
                floor = mid;
                start = mid +1;
            }
        }
        return ceil;

    }
}
