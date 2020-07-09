import java.math.BigInteger;
public class Solution53{
    static BigInteger[] factorials(int n){
        if(n < 0){
            return null;
        }
        BigInteger[] table = new BigInteger[n+1];
        table[0] = BigInteger.valueOf(1);
        for(int i = 1; i <= n; ++i){
            table[i] = table[i - 1].multiply(BigInteger.valueOf(i));
        }
        return table;
    }
    public static void main(String[] args) {
        BigInteger[] factorialArr = factorials(100);
        int result = 0;
        for(int n = 1; n <= 100; n++){
            for(int r = 1; r < n; r++){
                if(factorialArr[n].divide(factorialArr[r].multiply(factorialArr[n-r])).compareTo(BigInteger.valueOf(1000000)) == 1) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}