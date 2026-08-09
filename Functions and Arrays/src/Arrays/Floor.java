package Arrays;

public class Floor {
    static int findFloor(int[] arr, int x) {
        int start = 0;
        int end   = arr.length-1;
        int floor = -1;
        int ceil  = Integer.MAX_VALUE;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>x){
                ceil  = mid;
                end   = mid -1;
            }else{
                floor = mid;
                start = mid +1;
            }
        }
        return floor;
    }
}
