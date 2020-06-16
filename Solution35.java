import java.util.*;
public class Solution35{
    
    static List<Integer> circPrimes = new ArrayList<Integer>();
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
    static int digitCount(int N) 
    { 
        int count = 0; 
        while (N>0) { 
            count++; 
            N = N / 10; 
        } 
        return count; 
    } 
  
    // Function to generate all cyclic 
    // permutations of a number 
    static void circPrimeCombs(int x) 
    { 
        int num = x; 
        int n = digitCount(x); 
        int numCombs = 0;
        List<Integer> thePrimes = new ArrayList<Integer>();
        while (true) { 
  
            // Following three lines generates a 
            // circular pirmutation of a number. 
            int rem = num % 10; 
            int dev = num / 10; 
            num = (int)((Math.pow(10, n - 1)) * 
                                rem + dev); 
            //if(isPrime(num) && !circPrimes.contains(num)){
              //  circPrimes.add(num);
            //}
            if(isPrime(num)){
                thePrimes.add(num);
            }
            numCombs++;
            // If all the permutations are  
            // checked and we obtain original 
            // number exit from loop. 
            if (num == x)  
                break;  
        }
        if(thePrimes.size() != numCombs){
            return;
        }
        else{
            for(int i = 0; i < thePrimes.size();i++){
                if(!circPrimes.contains(thePrimes.get(i))){
                    circPrimes.add(thePrimes.get(i));
                }
            }
        }
    } 
	public static void main(String[] args) {
        //There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97
        circPrimes.add(2);
        circPrimes.add(3);
        circPrimes.add(5);
        circPrimes.add(7);
        circPrimes.add(11);
        circPrimes.add(13);
        circPrimes.add(17);
        circPrimes.add(31);
        circPrimes.add(37);
        circPrimes.add(71);
        circPrimes.add(73);
        circPrimes.add(79);
        circPrimes.add(97);
        for(int j = 100; j < 1000000; j++){
            circPrimeCombs(j);
        }
        System.out.println(circPrimes.size());
	}
}