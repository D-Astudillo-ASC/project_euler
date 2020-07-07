import java.math.BigInteger;
public class Solution56
{
	public static void main(String[] args) {
        int result = 0;
        int maxA = 0;
        int maxB = 0;
		for(int a = 99; a > 0; a--){
            if(a % 10 == 0){
                continue;
            }
		    for(int b = 99; b > 0; b--){
                BigInteger power = BigInteger.valueOf(a).pow(b);
                System.out.println(power.toString());
		        int sum = 0;
		        for(Character ch : power.toString().toCharArray()){
		            sum += Character.getNumericValue(ch);
		        }
		        if(sum > result){
                    result = sum;
                    maxA = a;
                    maxB = b;
		        }
		    }
		}
		System.out.println(maxA + "^" + maxB + ": " + result);
	}
}