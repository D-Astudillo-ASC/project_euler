public class Solution44{

    static boolean isPentagonal(int num){
        double penValue = (1.0 + Math.sqrt((24 * num) + 1))/6.0;
        return penValue == ((int)penValue);
    }
    public static void main(String[] args) {
        
        int result = 0;
        boolean found = false;
        int i = 1;

        while(!found){
            i++;
            int k = (i * (3 * i - 1)) / 2;
            for(int m = i - 1; m > 0; m--){
                int j = (m * (3 * m - 1)) / 2;
                if(isPentagonal(Math.abs(k - j)) && isPentagonal(k + j)){
                    result = k - j;
                    found = true;
                    break;
                }
            }
        }
        System.out.println(result);

    }
}