public class Solution92{
    static int squareDigSum(int n){
        if(n >= 0 && n < 10){
            return n * n;
        }
        int sqDigSum = 0;
        while(n > 0){
            sqDigSum += (n % 10) * (n % 10);
            n /= 10; 
        }
        return sqDigSum;
    }
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while(i < 10000000){

            int sqDigSum = squareDigSum(i);
            while(sqDigSum != 89){
                sqDigSum = squareDigSum(sqDigSum);
                if(sqDigSum == 89){
                    count++;
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
        System.out.println(count);
    }
}