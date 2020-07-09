import java.lang.StringBuilder;

public class Solution33{
    static double gcd(double a, double b){
        if(a == 0){
            return b;
        }
        else{
            return gcd(b % a, a);
        }
    }

    static double removeCommon(double a, double b){
        StringBuilder str1 = new StringBuilder(Double.toString(a));
        StringBuilder str2 = new StringBuilder(Double.toString(b));
        if(str1.charAt(0) == str2.charAt(1)){
            str1.deleteCharAt(0);
            str2.deleteCharAt(1);
            return Double.parseDouble(str1.toString()) / Double.parseDouble(str2.toString());
        }
        if(str1.charAt(1) == str2.charAt(0)){
            str1.deleteCharAt(1);
            str2.deleteCharAt(0);
            return Double.parseDouble(str1.toString()) / Double.parseDouble(str2.toString());
        }
        return 1;
    }

    static boolean shareDigit(double a, double b){
        //works for two-digit numbers.
        StringBuilder str1 = new StringBuilder(Double.toString(a));
        StringBuilder str2 = new StringBuilder(Double.toString(b));
        return  str1.charAt(0) == str2.charAt(0) || str1.charAt(1) == str1.charAt(1);
    }

    public static void main(String[] args) {
        double numerator = 1;
        double denominator = 1;
        for(double i = 10; i <= 98; i++){
            for(double j = i + 1; j <= 99; j++){
                if(i % 10 == 0|| j % 10 == 0){
                    continue;
                }
                else{
                    //if i and j share common digit
                    if(shareDigit(i, j)){
                        double expected = i / j;
                        double fact = gcd(i,j);
                        double reduced = removeCommon(i, j);
                        if(reduced == expected){
                            numerator *= (i / fact);
                            denominator *= (j / fact);
                        }
                    }
                }
                
            }
        }
        System.out.println(denominator / gcd(numerator,denominator));
    }
}