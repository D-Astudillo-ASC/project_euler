import java.math.BigInteger;
public class Solution20{
    public static void main(String[] args) {
        BigInteger correct = BigInteger.ONE;
		for(int j = 2; j <= 100; j++){
		    correct = correct.multiply(BigInteger.valueOf(j));    
		}
		int sum = 0;
		String str = correct.toString();
		for(Character c : str.toCharArray()){
		    sum += Integer.parseInt(c.toString());
		}
		System.out.println(sum);
    }
}