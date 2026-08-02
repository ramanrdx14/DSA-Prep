package Arrays;

public class MakeBuildings {
    public static void main(String[] args) {
        int[] arr = {3,8,0,9,4,6,3,8,0,9,4,6};
        printBuilding(arr);
    }
    public static void printBuilding(int[] arr){
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if(i >= max)max=i;
        }

        for(int i=1;i<=max;i++){
            for(int j=0;j<n;j++){
                if(i >  max - arr[j]){
                    System.out.print("|_|");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
