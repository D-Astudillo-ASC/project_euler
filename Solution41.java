import java.util.Set;
import java.util.HashSet;
public class Solution41{
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
    static boolean isPanDigit(int num){
        Set<Character> digits = new HashSet<Character>();
        //System.out.println("len of num: " + Integer.toString(num).length());
        for(Character ch: Integer.toString(num).toCharArray()){
            if(!digits.contains(ch) && Character.getNumericValue(ch) <= Integer.toString(num).length()){
                digits.add(ch);
            }
            else{
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
	    //Note: A digit sum of some integer n is divisible by 3 or 9 iff n is divisible by 3 or 9. (Divisibility Rule for 3 or 9)
		//Note: Any 9-digit pandigital number must have a digit sum of 9+8+7+6+5+4+3+2+1 = 45, which is divisible by 3 or 9. Thus, all 9-digit pandigital numbers must be composite.
		//Note: Any 8-digit pandigital number must have a digit sum of 8+7+6+5+4+3+2+1 = 36, which is also divisible by 3 or 9. Thus, all 8-digit pandigital numbers must be composite.
	    //Now, any 7-digit pandigital must have a digit sum of 7+6+5+4+3+2+1 = 28, which is not divisible by 3 or 9. This implies that no 7-digit pandigital number is divisible by 3 or 9 and 
	    // the largest odd 7-digit pandigital number, 7654321, is our upper limit for this problem.
	    // for our lower bound, we will use the 4-digit pandigital number 4321.
	    int max = Integer.MIN_VALUE;
	    for(int i = 7654321; i >= 4321; i--){
	        if(isPrime(i) && isPanDigit(i) && i > max){
	            max = i;
	        }
	    }
	    System.out.println(max);
	    
	}
}