import java.math.BigInteger;

public class Solution97{
    public static void main(String[] args) {
        BigInteger bigPrime = BigInteger.valueOf(28433).multiply(BigInteger.valueOf(2).pow(7830457));
        bigPrime = bigPrime.add(BigInteger.valueOf(1));
        String primeStr = bigPrime.toString();
        System.out.println(primeStr.substring(primeStr.length()-10,primeStr.length()));
    }
}