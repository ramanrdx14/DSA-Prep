package Arrays;

public class Example {
    //swap integer solution

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int[] arr = new int[]{x,y};
        System.out.println("Before Swap ::: "+x+" -- "+y);

        swap(arr);

        System.out.println("After Swap ::: "+arr[0]+" -- "+arr[1]);
    }

    public static void swap(int[] arr){
        int temp = arr[0];
        arr[0]   = arr[1];
        arr[1]   = temp;
    }
}
