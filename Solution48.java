import java.math.BigInteger;
public class Solution48{

    public static void main(String[] args) {

        BigInteger sum = BigInteger.valueOf(0);
        for(int i = 1; i <= 1000; i++){
            BigInteger power = BigInteger.valueOf(i).pow(i);
            sum = sum.add(power);
        }
        String sumStr = sum.toString();
        System.out.println(sumStr.substring(sumStr.length()-10,sumStr.length()));
    }
}