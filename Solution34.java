public class Solution34{
    static int factorial(int n){
        if(n < 0){
            return 0;
        }
        if(n == 0 || n == 1){
            return 1;
        }
        int[] table = new int[n+1];
        table[0] = 1;
        for(int i = 1; i <= n; ++i){
            table[i] = i * table[i - 1];
        }
        return table[n];
    }
    public static void main(String[] args) {
        //Upper limit -> factorial(9) * 7, since factorial(9) * 8 yields 2903040, a 7-digit number, implying that a solution of 8 or more digits is impossible.
        
        //Pre-computing factorials from 1 to 9 for speed up.
        int[] factorials = new int[10];
        for(int i = 0; i < 10;i++){
            factorials[i] = factorial(i);
        }
        int result = 0;
        for(int j = 10; j < 2540161; j++){
            int factorialSum = 0;
            int num = j;
            while(num > 0){
                int digit = num % 10;
                num /= 10;
                factorialSum += factorials[digit];
            }
            if(factorialSum == j){
                result += j;
            }
        }
        System.out.println(result);
    }
}