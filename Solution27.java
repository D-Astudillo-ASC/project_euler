//import java.util.List;
//import java.util.ArrayList;
public class Solution27{
    /*
    static List<Integer> primeSieve(int n){
        boolean[] primeCheck = new boolean[n+1];
        List<Integer> primes = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            primeCheck[i] = true;
        }
        for(int i = 2; i * i <= n; i++){
            if(primeCheck[i]){
                //Mark all multiples of i as non-primes.
                for(int j = i * i; j <= n ; j += i){
                    primeCheck[j] = false;
                }
            }
        }
        for(int i = 2; i <= n; i++){
            if(primeCheck[i]){
                primes.add(i);
            }
        }
        return primes;
    }
    */
    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        else if(num <= 3){
            return true;
        }
        else if(num % 2 == 0 || num % 3 ==0){
            return false;
        }
        else{
            //Note that any primes greater than 2 or 3 can be expressed in the form 6k+1 of 6k - 1.
            for(int i = 5; i <= Math.sqrt(num);i+=6){
                //Check if num is divisible by 6k + 1 or 6k - 1.
                if(num % i == 0 || num % (i + 2) == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        /*List<Integer> bVals = primeSieve(1000);
        for(int a = -999; a < 1001; a += 2){
    
        }
        */
        //Need to work on efficient solution...
        int nMax = 0;
        int aMax = 0;
        int bMax = 0;
        for(int a = -999; a < 1000; a++){
            for(int b = -1000; b <= 1000; b++){
                int n = 0;
                while (isPrime(Math.abs(n * n + a * n + b))) {
                    n++;
                }
                if (n > nMax) {
                    aMax = a;
                    bMax = b;
                    nMax = n;
                }
            }
        }
        System.out.println(aMax * bMax);
    }
}