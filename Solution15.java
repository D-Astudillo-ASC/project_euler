public class Solution15{

    static long binomCoefficient(int n, int k){
        if(k > n - k){
            k = n-k;
        }

        long result = 1;
        for(int i = 0; i < k; i++){
            result *= (n-i);
            result /= (i+1);
        }
        return result;
    }
    public static void main(String[] args) {
        /* This problem and its variations are studied quite often in Combinatorics. 
           Essentially, for some n * n grid, we are permuting n right arrows and n down arrows to
           find all possible paths of length 2n. This quantity corresponds to the 
           multinomial coefficient: (2n Choose n,n), which is equal to (2n Choose n) by expansion of the
           multinomial coefficient. Hence, we only have to compute (2n Choose n) for n = 20 to obtain
           the number of valid routes through a 20 by 20 grid.         
        */
        System.out.println(binomCoefficient(40, 20));
    }
}