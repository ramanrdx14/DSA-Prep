public class TimeComplexity {
    public static void main(String[] args) {


        /*
            1. Find the time and space complexity : O(N) Space : O(1)

            int a = 0;
            for (i = 0; i < N; i++) {
                a = a + Math.random();
            }


            2. Find the time and space complexity : O(M) Space : O(1)
            int b = 0;
            for (j = 0; j < M; j++) {
                b = b + Math.random();
            }

            3. Find the time and space complexity : O(N + M) Space : O(1)

            int a = 0, b = 0;
            for (i = 0; i < N; i++) {
            a = a + Math.random();
            }
            for (j = 0; j < M; j++) {
            b = b + Math.random();
            }


            4.Find the time and space complexity : O(n^2) space O(1)

            int a = 0;
            for (i = 0; i < N; i++) {  <-- N

                for (j = N; j > i; j--) {
                    a = a + i + j;
                }

            }
            i = 0 j --> 5
            i = 1 j --> 4
            i = 2 j --> 3
            i = 3 j --> 2
            i = 4 j --> 1

            5 + 4 + 3 + 2 + 1 => sum of natural numbers = n * (n+1)/2 ==> n^2 complexity


            5. Find the time and space complexity : n * log(n) space O(n)

            int i, j, k = 0;
            for (i = n / 2; i <= n; i++) {   --> n/2
                for (j = 2; j <= n; j = j * 2) { --> log(n)
                    k = k + n / 2;
                 }
            }

            let N = 8

            i = 8/2 = 4  j --> 3
            i = 5        j --> 3
            i = 6        j --> 3
            i = 7        j --> 3
            i = 8        j --> 3


            6. Find the time and Space complexity : O(n^2)

               NOTE ***  :: (WHEN-EVER THE INNER LOOP IS DEPENDENT ON OUTER LOOP) ***
               since the inner loop is dependent on the outer loop so we will
               calculate the number of operations.

            for(int i=1;i<=n;i++){  --> n times
                for(int j=1j<=i;j++){ --> 1 + 2 + 3 + 4 + 5 +.... sum of natual numbers n * (n + 1)/2 = n^2
                    int a = i * j;
                }
            }

            i = 1 j --> 1
            i = 2 j --> 2
            i = 3 j --> 3
            i = 4 j --> 4
            i = 5 j --> 5


            7.  Find the time and space complexity: log(N) space O(1)

            int a = 0,i = N
            while(i > 0){
                i/=2;
            }

            let N = 64
             i = 64
             i = 32
             i = 16
             i = 8
             i = 4
             i = 2
             i = 1

             N/2 + N/4 + N/8 + N/16 ... 1
             N/2^0 + N/2^2 + N/2^4 ... N/2^x
             N/2^x = 1


            8. Find the time and space complexity : O(N)

            int k =0;
            for(int i=n;i>=0;i=i/2){

                for(int j=0;j<i;j++){
                    k++;
                }
            }

            i = 5 j --> 5
            i = 2 j --> 2
            i = 1 j --> 1

            N + N/2 + N/4...1 => N(1/2 + 1/4 + 1/8 ... 1)

            N*(1+ 0.5 + 0.25 + 0.125 ... )
            N*2 = 2N = N

         */

    }
}
