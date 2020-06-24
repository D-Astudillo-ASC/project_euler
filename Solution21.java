public class Solution21{
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
	public static void main(String[] args) {
        int result = 0;
        int newDivSum;
        for(int i = 2; i <= 10000;i++){
            if(divisorSum(i) > i && divisorSum(i) <= 10000){
                newDivSum = divisorSum(divisorSum(i));
                if(newDivSum == i){
                    result = result + i + divisorSum(i);
                }
            }
        }
        System.out.println(result);
	}
}