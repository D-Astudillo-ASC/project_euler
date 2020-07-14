public class Solution46{

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
            //Note that any primes greater than 2 or 3 can be expressed in the form 6k+1 or 6k - 1.
            for(int i = 5; i <= Math.sqrt(num);i+=6){
                //Check if num is divisible by 6k + 1 or 6k - 1.
                if(num % i == 0 || num % (i + 2) == 0){
                    return false;
                }
            }
            return true;
        }
    }

    static boolean satGoldbach(int n){
        for(int i = 1; 2 * (i * i) < n; i++){
            for(int j = 3; j <= n - 2; j+=2){
                if(isPrime(j) && j + (2 * i * i) == n){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //smallest odd composite.
        int i = 9;
        while(satGoldbach(i)){
            i+=2;
            while(isPrime(i)){
                i+=2;
            }
        }
        System.out.println(i);
    }
}