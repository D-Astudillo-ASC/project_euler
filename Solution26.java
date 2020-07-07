import java.util.Map;
import java.util.HashMap;

public class Solution26{
    
    static int checkCycle(int d){
        Map<Integer,Integer> digitPos = new HashMap<Integer,Integer>();
        int mod = 1;
        int index = 1;
        while(true){
            if(digitPos.containsKey(mod)){
                return index - digitPos.get(mod);
            }
            else{
                digitPos.put(mod,index);
                mod = mod * 10 % d;
                index++;
            }
        }
    }
    public static void main(String[] args) {
        int maxCycle = 0;
        int denom = 0;
        for(int i = 2; i < 1000; i++){
            if(checkCycle(i) > maxCycle){
                maxCycle = checkCycle(i);
                denom = i;
            }
        }
        System.out.println(denom);
    }
}