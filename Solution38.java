import java.util.Set;
import java.util.HashSet;

public class Solution38{

    static boolean isPanDigit(String num){
        if(num.length() != 9){
            return false;
        }
        Set<Character> digits = new HashSet<Character>();
        //1 through 9 pandigital....
        for(Character ch: num.toCharArray()){
            if(!digits.contains(ch) && Character.getNumericValue(ch) >= 1 && Character.getNumericValue(ch) <= 9){
                digits.add(ch);
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //This number must be greater than 918273645.
        //This implies that the number must start with a 9 and the second digit must be greater than 1.
        //So the second digit must be between 2 and 8.
        //However, none of the integers between 92 and 98 form a 9-digit pandigital number when multiplied by (2,3,4). 
        //Same applies to integers between 921 and 987, but integers between 9213 and 9876 will form a 9-digit pandigital number when mulitplied by 2.
        //If the second digit is greater than or equal to 5 for any of the integers between 9213 and 9876, then mulitplication by 2 will yield another 9, creating an invalid concatenation.
        //Thus, the second digit must be less than 5, at most 4 and at least 2.
        //Hence, the starting number must range between 9213 and 9487.
        
        String result = "";
        for(int i = 9213; i <= 9487; i++){
            if(isPanDigit(Integer.toString(i) + Integer.toString(2 * i))){
                result = Integer.toString(i) + Integer.toString(2 * i);
            }
        }
        System.out.println(result);
    }
}