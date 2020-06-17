import java.math.BigInteger;
public class Solution16{
    public static void main(String[] args) {
        BigInteger num = BigInteger.valueOf(2).pow(1000);
		String str = num.toString();
		int sum = 0;
		for(Character c : str.toCharArray()){
		    sum += Integer.parseInt(c.toString());
		}
		System.out.println(sum);
    }
}