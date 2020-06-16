public class Solution7{
    static int primeNum(int n){
        int num = 1;
        int count = 0;
        int i;
        while(count < n){
            num++;
            for(i = 2; i <= num; i++){
                if(num % i == 0){
                    break;
                }
            }
            if(i == num){
                count++;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        //Obtain 10001st prime.
        System.out.println(primeNum(10001));
    }
}