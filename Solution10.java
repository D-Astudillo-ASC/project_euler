public class Solution10{
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
        long sumPrimes = 1709600813;
        for(int i = 200000; i < 2000000; i++){
            if(isPrime(i)){
                sumPrimes += i;
            }
        }
        System.out.println(sumPrimes);
    }
}