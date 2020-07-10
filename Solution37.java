public class Solution37{
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
    public static void main(String[] args) {
        int count = 0;
        int i = 23;
        int result = 0;
        while(count < 11){
            if(isPrime(i)){
                boolean isTruncatable = true; 
                for(int d = 10; d < i; d *= 10){
                    int leftToRight = i % d; 
                    int rightToLeft = i / d | 0;
                    if(!isPrime(leftToRight) || !isPrime(rightToLeft)){
                        isTruncatable = false;
                    }
                }
                if(isTruncatable){
                    count++;
                    result += i;
                }
            }
            //iterate over all odd numbers greater than 23, since 23 is the first left and right-truncatable prime.
            i+=2;
        }
        System.out.println(result);
    }

}