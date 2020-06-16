/*
Problem 4: A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class Solution4{
    static boolean isPalindrome(int n){
        int denom = 1;
        //find denominator to take leading digit at that place
        while(n / denom >= 10){
            denom = denom * 10;
        }
        while(n != 0){
            int lead = n / denom;
            int trail = n % 10;
            if(lead != trail){
                return false;
            }
            //remove leading and trailing digits from n.
            n = (n % denom)/10;
            
            //since numbers at two places have been removed, reduce by factor of two.
            denom = denom/100;
        }
        return true;
    }
    
    public static void main(String []args){
        int max = 0;
        int factor1 = 0;
        int factor2 = 0;
        //smallest product palindrome of 3-digit numbers is 10201 = 101*101
        //largest possible product is 999*999.
        for(int i = 101; i <= 999; i++){
            for(int j = 101; j <= 999; j++){
                if(isPalindrome(i*j) && i*j > max){
                    max = i*j;
                    factor1 = i;
                    factor2 = j;
                }
            }
        }
        System.out.println(factor1 + "*" + factor2 + "=" + max);
    }
}