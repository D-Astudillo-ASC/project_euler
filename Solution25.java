import java.math.BigInteger;
public class Solution25{
    public static void main(String[] args) {

        //The first fibonacci number to have over 1000 digits must be greater than 10^999.
        BigInteger bound = BigInteger.valueOf(10).pow(999);
        
        //Store 3 BigIntegers to hold computations.
        BigInteger[] fibonacci = new BigInteger[]{BigInteger.valueOf(1),BigInteger.valueOf(1),BigInteger.valueOf(2)};
        int i = 0;
        int fibIndex = 2;
        while(fibonacci[i].compareTo(bound) <= -1){
            i = (i + 1) % 3;
            fibIndex++;
            fibonacci[i] = fibonacci[(i + 1) % 3].add(fibonacci[(i + 2) % 3]);
        }
        System.out.println(fibIndex);    
    }
    

}