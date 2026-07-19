package Functions;

public class SwapNumbers {
    public static void swap(int x,int y){
        int temp = x;
         x = y;
         y = temp;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        System.out.println(a+","+b);

        swap(a,b);

        System.out.println(a+","+b);

        //Note : this will not swap because each function will have its own space and memory
        // So swap will be happened in the swap method, but it will not reflect in the main method.

    }
}
