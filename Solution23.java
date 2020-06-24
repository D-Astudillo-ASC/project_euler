import java.util.*;
public class Solution23{
    static int divisorSum(int num){
	    int sqrt = (int)Math.sqrt(num);
	    int sum = 1;
	    
	    //If number is perfect square, count square root only once.
	    if(sqrt * sqrt == num){
	        sum += sqrt;
	        sqrt--;
	    }
	    
	    for(int i = 2; i <= sqrt; i++){
	        if (num % i == 0){
                sum = sum + i + (num / i);
	        }
	    }
	    return sum;
    }
    static boolean isAbundant(int n){
        return divisorSum(n) > n;
    }
    public static void main(String[] args) {
        List<Integer> abundantNums = new ArrayList<Integer>();
        for(int i = 12; i <= 20161; i++){
            if(isAbundant(i)){
                abundantNums.add(i);
            }
        }
        int sum = 0;
        //Check sums of abundant numbers
        boolean[] abundantSums = new boolean[20162];
        for(int j = 0; j < abundantNums.size();j++){
            for(int k = j; k < abundantNums.size(); k++){
                if(abundantNums.get(j) + abundantNums.get(k) <= 20161){
                    abundantSums[abundantNums.get(j) + abundantNums.get(k)] = true;
                }
                else{
                    break;
                }
            }
        }


        //Take sum of all numbers that cannot be expressed as the sum of two abundant numbers.
        for(int i = 1; i <= 20161; i++){
            if(!abundantSums[i]){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}