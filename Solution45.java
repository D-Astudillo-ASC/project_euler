
public class Solution45{
    
    static boolean isPentagonal(long num){
        double penValue = (1.0 + Math.sqrt((24 * num) + 1))/6.0;
        return penValue == ((int)penValue);
    }
    public static void main(String[] args) {
        long result = 0;
        int i = 143;
        while(true){
            i++;
            result = i * ((2 * i) - 1);
            if(isPentagonal(result)){
                break;
            }
        }
        System.out.println(result);
    }
}