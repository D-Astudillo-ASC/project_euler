public class Solution100{
    public static void main(String[] args) {
        // For the given arrangements, we can observe that P(2 blue discs) = b(b - 1) / n(n - 1)= 1/2, with n = total # of discs in box and b = # of blue discs in box.
        // This yields the quadratic diophantine equation:
        // 2b^2 - 2b = n^2 - n
        // 2b^2 - 2b - n^2 + n = 0.
        // Used this two integer variable equation solver: https://www.alpertron.com.ar/QUAD.HTM
        // So, we have that b_{k+1} = 3b_{k} - 2n_{k} - 2 and n_{k+1} = 4b_{k} + 3n_{k} - 3.
        
        // Starting values.
        long b = 15;
        long n = 21;
        long limit = 1000000000000L;
        while(n < limit){
            long curB = 3 * b + 2 * n - 2;
            long curN = 4 * b + 3 * n - 3;
            b = curB;
            n = curN;
        }
        System.out.println(b);

    }
}