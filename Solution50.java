/*
Problem 50: Which prime, below one-million, can be written as the sum of the most consecutive primes?
*/
public class Solution50{
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
        int curSum = 0;

        //1+2+3 = 6.
        int curNum = 6;
        while((curSum + curNum)<1000000){
            if(isPrime(curNum)){
                curSum += curNum;
            }
            curNum++;
        }
        System.out.println(curSum);
    }
}