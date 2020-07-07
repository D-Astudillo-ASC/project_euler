import java.math.*;
public class Solution80{

    //Finding square root of some number a is the same as finding some number x such that x^2 = a.
	//Furthermore, to find this number, we can find the zero of f(x) = x^2 - a with f'(x) = 2x, using Newton's method.
	static BigDecimal newtonRoot(BigDecimal a, BigDecimal xn, BigDecimal precision){
        BigDecimal f = xn.pow(2).add(a.negate());
        BigDecimal fp = xn.multiply(new BigDecimal(2));
        BigDecimal xn1 = f.divide(fp,200,RoundingMode.HALF_DOWN);
        xn1 = xn.add(xn1.negate());
        BigDecimal curSquare = xn1.pow(2);
        BigDecimal curPrecision = curSquare.subtract(a);
        curPrecision = curPrecision.abs();
        if (curPrecision.compareTo(precision) <= -1){
            return xn1;
        }
        return newtonRoot(a, xn1, precision);
    }


    public static void main(String[] args) {
        //Method 1: Using BigDecimal sqrt method.
        int result1 = 0;
        int j = 1;
        MathContext precision = new MathContext(102);
        for(int i = 1; i <= 100; i++){
            if(j * j == i){
                j++;
                continue;
            }
            BigDecimal a = new BigDecimal(i);
            BigDecimal root = a.sqrt(precision);
            String digits = root.toString().substring(0,101);
            //System.out.println(i + ": " + digits);
            for(Character ch : digits.toCharArray()){
                if(Character.isDigit(ch)){
                    result1 += Character.getNumericValue(ch);
                }
            }
        }
        System.out.println(result1);
        
        //Method 2: Using Newton's Method.
        int result2 = 0;
        j = 1;
        for(int i = 1; i <= 100;i++){
            //if the number is perfect square, there is no need to call Newton's method.
            if(j * j == i){
                j++;
                continue;
            }
            else{
                //Get root up to first 100 decimal digits.
                BigDecimal root = newtonRoot(new BigDecimal(i),new BigDecimal(1),new BigDecimal(1).divide(new BigDecimal(10).pow(100)));
                //System.out.println(root.toString().length());
                String digits = root.toString().substring(0,101);
                for(Character ch : digits.toCharArray()){
                    if(Character.isDigit(ch)){
                        result2 += Character.getNumericValue(ch);
                        
                    }
                }
            }
        }
        System.out.println(result2);
    }
}