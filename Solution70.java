public class Solution70{
    static boolean isPermutation(int a, int b){
        int[] digits = new int[10];
        int temp = b;
        while(temp > 0){
            digits[temp % 10]++;
            temp /= 10;
        }
        temp = a;
        while(temp > 0){
            digits[temp % 10]--;
            temp /= 10;
        }
        for(int i = 0; i < 10; i++){
            if(digits[i] != 0){
                return false;
            }
        }
        return true;
    }
    static int totient(int n){
        int count = n;
        //Look at prime factors and subtract their multiples.
        for(int p = 2; p * p <= n; ++p){
            //is p a prime factor?
            if(n % p == 0){
                //Divide out all p's from n and subtract all multiples of p from the result.
                while(n % p == 0){
                    n /= p;
                }
                count -= count / p;
            }
        }
        //is there a prime factor greater than root(n)? if so, then subtract all multiples of n from the result.
        if(n > 1){
            count -= count / n;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 2;
        double minRatio = Double.MAX_VALUE;
        int result = 0;
        while(n < 10000000){
            double curRatio = (double) n / totient(n);
            if(isPermutation(totient(n), n) && curRatio < minRatio){
                minRatio = curRatio;
                result = n;
            }
            n++;
        }
        System.out.println(result);
    }
}