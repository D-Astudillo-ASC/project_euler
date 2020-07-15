import java.math.BigInteger;
public class Solution57{
    
    public static void main(String[] args) {
        BigInteger numerator = BigInteger.valueOf(3);
        BigInteger denominator = BigInteger.valueOf(2);
        int result = 0;
        for(int i = 1; i < 1000; i++){
            numerator = numerator.add(BigInteger.valueOf(2).multiply(denominator));
            denominator = numerator.subtract(denominator);
            if(numerator.toString().length() > denominator.toString().length()){
                result++;
            }
        }
        System.out.println(result);
    }
}