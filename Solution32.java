import java.util.Set;
import java.util.HashSet;

public class Solution32{

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
        Set<Integer> products = new HashSet<Integer>();

        //1 digit by 4 digit products.
        for(int i = 1; i <= 9; i++)
        {
            for(int j = 1234; j <= 9876; j++)
            {
                int product = i * j;
                if(isPanDigit("" + i + j + product)){
                    products.add(product);
                }
            }
        }

        //2 digit by 3 digit products.
        for(int i = 12; i <= 98; i++)
        {
            for(int j = 123; j <= 987; j++)
            {
                int product = i * j;
                
                if(isPanDigit("" + i + j + product)){
                    products.add(product);
                }
            }
        }
        int result = 0;
        for(int p : products){
            result += p;
        }
        System.out.println(result);
    }

}