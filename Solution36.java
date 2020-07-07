import java.lang.StringBuilder;
public class Solution36{

    static boolean isPalindromeDec(int n){
        int div = 1;
        //divisor that is the power of 10 closest to the number itself. Dividing n by this power of 10 and storing this quantity in an integer variable will truncate decimals and return the whole number part.
        while(n / div >= 10){
            div *= 10;
        }

        while(n != 0){
            int leading = n / div;
            int trailing = n % 10;

            if(leading != trailing){
                return false;
            }


            //Remove leading and trailing digits -> taking n % div removes leading digit, dividing (n % div) by 10 removes trailing digit.
            n = (n % div) / 10;

            //Updates divisor to reflect the reduction by two places in n/
            div /= 100;

        }
        return true;
    }
    static boolean isPalindromeStr(String str){
        if(str.length() == 0 || str.length() == 1)
            return true;
        if(str.charAt(0) == str.charAt(str.length()-1))
            return isPalindromeStr(str.substring(1, str.length()-1));
        return false;
    }
    static String toBinary(int n){
        StringBuilder output = new StringBuilder();        
        while(n > 0){
            output.append(n % 2); 
            n /= 2;
        }
        return output.reverse().toString();
    }
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i < 1000000){
            if(isPalindromeDec(i) && isPalindromeStr(toBinary(i))){
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}