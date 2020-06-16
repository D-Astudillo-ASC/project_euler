public class Solution2{
    static int fib(){
        int a = 0;
        int b = 1;
        int evenSum = 0;
        while(a < 4000000){
            int c = a + b; 
            a = b;
            b = c ;
            if(a % 2 == 0){
                evenSum += a;
            }
        }
        return evenSum;   
    }
    public static void main(String []args){
    
        System.out.println(fib());
    }
}
