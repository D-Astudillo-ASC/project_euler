public class Solution49{
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
    public static void main(String[] args) {
        String output = "";
        for(int a = 1489; a < 3340; a++){
            int b = a + 3330;
            int c = b + 3330;
            if(isPrime(a) && isPrime(b) && isPrime(c) && isPermutation(a, b) && isPermutation(b, c)){
                output = output + a + b + c;
            }
        }
        System.out.println(output);
    }
}