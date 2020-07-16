import java.math.BigInteger;
import java.lang.StringBuilder;
public class Solution55{
    //Need to adapt this for BigInteger...
    /*static int reverse(int n){
        int x = 0;
        System.out.println("n: " + n);
        while(n > 0){
            x = x * 10 + n % 10;
            n /= 10;
        }
        System.out.println("reverse: " + x);
        return x;
    }*/

    static String reverse(BigInteger num){
        String str = num.toString();
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    static boolean isPalindrome(String n){
        return n.equals(reverse(new BigInteger(n)));
    }

    static boolean isLychrel(int n){
        BigInteger test = BigInteger.valueOf(n);
        for(int i = 0; i < 50; i++){
            test = test.add(new BigInteger(reverse(test)));
            if(isPalindrome(test.toString())){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        while(i < 10000){
            if(isLychrel(i)){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}