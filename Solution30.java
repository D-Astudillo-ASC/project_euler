public class Solution30{
    public static void main(String[] args) {
        //Note: Maximum sum of fifth powers of digits of 5-digit number is 5 * 9^5 = 295245, a 6-digit number.
	    //Furthermore, max sum of fifth powers of digits of 6-digit number is 6 * 9^5 = 354294, also a 6-digit number and potential upper bound.
	    //However, max sum of fifth powers of digits of 7-digit number is 7 * 9^5 = 413343, which means that 354294 is indeed our upper bound.
	    int total = 0;
	    for(int i = 2; i <= 354294; i++){
	        int powerSum = 0;
	        int num = i;
	        while(num > 0){
	            int digit = num % 10;
	            num = num / 10;
	            
	            int power = digit;
	            for(int j = 0; j < 4; j++){
	                power = power * digit;
	            }
	            powerSum += power;
	        }
	        if(powerSum == i){
	            total += i;
	        }
	    }
	    System.out.println(total);
    }
}