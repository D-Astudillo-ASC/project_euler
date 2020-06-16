public class Solution6{
    static int square(int n){
        if(n == 0||n == 1){
            return n;
        }
        if(n < 0){
            n -= n; 
        }
        if(n % 2 != 0){
            return ((square(n>>1)<<2) + ((n>>1)<<2)+1);
        }
        else{
            return square(n >> 1)<< 2;
        }
    }
    public static void main(String[] args) {
        int sumNaturalSums = 0;
        int squareSumNums = 0;
        for(int i = 1; i <= 100; i++){
            sumNaturalSums += i;
            squareSumNums += square(i);
        }
        System.out.println(square(sumNaturalSums) - squareSumNums);
    }
}