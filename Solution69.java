public class Solution69{
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
        //Let a,b be positive integers. Then, if a and b are relatively prime, this implies that gcd(a,b) == 1.
        double maxRatio = Double.MIN_VALUE;
        int n = 10;
        int result = 0;
        while(n < 1000001){
            double curRatio = (double) n / totient(n);
            if(curRatio > maxRatio){
                maxRatio = curRatio; 
                result = n;
            }
            n++;
        }
        System.out.println(result);
    }
}