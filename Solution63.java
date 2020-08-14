public class Solution63{
    public static void main(String[] args) {
        //Observation: 10^k, where k is a positive integer, equals 1 followed by k zeroes -> this number is of length k+1.
        //So, this means that it is impossible for any b^k, where b > 10, to be of length k. 
        //We have found an upper bound for our base.
        
        //Observation: 9^1, 9^2, ... , 9^21 are all numbers of lengths 1,2,...,21 respectively. 
        //However, 9^22 is not of length 21 and it is easy to see that 9^k for any k > 21 will not yield a number of length k, which implies that 21 must be the upper bound for our exponent.   
        //We have both required upper bounds for solving this problem.

        //Note: The length of a number of the form n^k is equal to floor(1 + k * log_10(n)), based on the observation that 10^(d-1) <= n < 10^d for some number n where d = number of digits.
        //From that observation, we find that d = floor(1 + log_10(n)). By the properties of logarithms, then for some number of the form n^k, d = floor(1 + log_10(n^k)) = floor(1 + k * log_10(n)). 
        //Thus, we can produce the following fast brute-force approach.

        int result = 0;
        for(int n = 1; n < 10; n++){
            for(int k = 1; k < 22; k++){
                if(Math.floor(1 + k * Math.log10(n)) == k){
                    result++;
                } 
            }
        }
        System.out.println(result);



    }
}