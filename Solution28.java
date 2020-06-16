public class Solution28{
   
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
        int diagSum = 1;
        int[] spiralSequence = {1,3,5,7,9};
        int step = 2;
        while(spiralSequence[4] <= square(1001)){
            for(int i = 1;i < spiralSequence.length;i++){
                diagSum += spiralSequence[i];
            }
            spiralSequence[0] = spiralSequence[4];
            for(int j = 0; j < spiralSequence.length;j++){
                spiralSequence[j] = spiralSequence[0] + ((2 * step) * j);
            }
            step++;
        }
        System.out.println(diagSum);
    }
}