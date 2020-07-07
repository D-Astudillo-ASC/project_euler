
import java.util.ArrayList;
import java.util.List;
public class Solution24{

    static int factorial(int i){
        if(i == 0){
            return 1;
        }
        else{
            int result = 1;
            for(int j = 1; j <= i; j++){
                result *= j;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        String permutation = "";
        int remaining = 999999;
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            numbers.add(i);
        }
        for(int i = 1; i < 10;i++){
            int j = remaining / factorial(10 - i);
            remaining = remaining % factorial(10 - i);
            permutation += numbers.get(j);
            numbers.remove(j);
            if(remaining == 0){
                break;
            }
        }
        System.out.println(numbers.toString());
        for(int i = 0; i < numbers.size();i++){
            permutation = permutation + numbers.get(i);
        }

        System.out.println(permutation);
    }
}