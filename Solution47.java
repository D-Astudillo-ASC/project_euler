import java.util.HashSet;

public class Solution47{
    static int uniquePrimeFactors(int n){
        HashSet<Integer> factors = new HashSet<Integer>();
        while(n % 2 == 0){
            factors.add(2);
            n /= 2;
        }
        //After dividing out all 2's in previous steps, n must be odd.
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            while(n % i == 0){
                factors.add(i);
                n /= i;
            }
        }
        if(n > 2){
            factors.add(n);
        }
        return factors.size();
    } 
    public static void main(String[] args) {
        int result = 2 * 3 * 5 * 7;
        int consecutive = 1;
        int[] numbers = new int[4];
        int i = 0;
        while(consecutive < 4){
            numbers[i % 4] = result;
            result++;
            if(uniquePrimeFactors(result) >= 4){
                consecutive++;
                i++;
            }
            else{
                consecutive = 0;
            }
            
        }
        System.out.println(numbers[0]);
    }
}