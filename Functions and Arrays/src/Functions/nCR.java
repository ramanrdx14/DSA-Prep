package Functions;

public class nCR {

    public static int factorial(int x){
        int factorial = 1;
        for(int i=1;i<=x;i++){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        int nFact = factorial(n);
        int rFact = factorial(r);
        int nmrFact = factorial(n-r);

        int ans     = nFact/(rFact*nmrFact);
        System.out.println(ans);
    }
}
