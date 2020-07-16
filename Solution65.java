import java.math.BigInteger;
public class Solution65{
    public static void main(String[] args) {
        BigInteger numerator = BigInteger.valueOf(2);
        BigInteger denominator = BigInteger.valueOf(1);
        int result = 0;
        for(int i = 2; i <= 100; i++){
            BigInteger temp = denominator;
            int m = 0;
            if(i % 3 == 0){
                m = 2 * (i / 3);
            }
            else{
                m = 1;
            }

            denominator = numerator;
            numerator = denominator.multiply(BigInteger.valueOf(m)).add(temp);
        }
        String str = numerator.toString();
        for(Character ch: str.toCharArray()){
            result += Character.getNumericValue(ch);
        }
        System.out.println(result);
    }
}