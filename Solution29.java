import java.util.Set;
import java.util.HashSet;
import java.math.BigInteger;

public class Solution29{
    public static void main(String[] args) {
        Set<BigInteger> pows = new HashSet<BigInteger>();
	    for(int a = 2; a <= 100; a++){
	        for(int b = 2; b <= 100; b++){
	            if(!pows.contains(BigInteger.valueOf(a).pow(b))){
	                pows.add(BigInteger.valueOf(a).pow(b));
	            }
	        }
	    }
	    System.out.println(pows.size());
    }
}