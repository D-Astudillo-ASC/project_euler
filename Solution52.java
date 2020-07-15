public class Solution52{
    static boolean isPermutation(int a, int b){
        int[] digits = new int[10];
        int temp = b;
        while(temp > 0){
            digits[temp % 10]++;
            temp /= 10;
        }
        temp = a;
        while(temp > 0){
            digits[temp % 10]--;
            temp /= 10;
        }
        for(int i = 0; i < 10; i++){
            if(digits[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //Note that it is impossible for numbers 1 - 9 to satisfy the required condition. So, we must start at 10.
        //Also, we can increase this starting number i by factor of 10 for each iteration, checking numbers up to the (floor of (10 * i) / 6) - 1, since 6 * (((10 * i) / 6) + 1 ) = 10i + 6 and this number is guaranteed to have more digits than i => 10i + 6 cannot be a permutation of i because all permutations of i must range between i and 10i - 1. 
        int i = 10;
        int result = 0;
        boolean foundNum = false;
        while(!foundNum){
            for(int j = i ; j < (10 * i) / 6; j++){
                foundNum = true;
                for(int k = 2; k <= 6; k++){
                    if(!isPermutation(j, j * k)){
                        foundNum = false;
                        break;
                    }
                }
                if(foundNum){
                    result = j;
                    break;
                }
            }
            i *= 10;
        }
        System.out.println(result);
    }
}