import java.util.*;
public class Solution14{
    //Trivial approach.
    public static void main(String[] args) {
		int limit = 1000000;
		long max = 0;
		long start = 0;
		long seq;
		for(int i = 2; i < limit; i++){
		    int curLen = 1;
		    seq = i;
		    while(seq != 1){
		        if(seq % 2 ==0){
		            seq >>= 1;
		        }
		        else{
		            seq = seq * 3 + 1;
		        }
		        curLen++;
		    }
		    if (curLen > max){
		        max = curLen;
		        start = i;
		    }
		}
		System.out.println("Max length: " + max);
        System.out.println("Starting number: " + start);
        System.out.println("Now starting memoization approach");
    
	    max = 0;
	    start = 0;
        long seq2;
        int[] table = new int [limit + 1];
        Arrays.fill(table,0);
        table[1] = 1;
        for(int i = 2; i < limit; i++){
            seq2 = i;
            int j = 0;
		    while(seq2 != 1 && seq2 >= i){
                j++;
                if(seq2 % 2 ==0){
		            seq2 >>= 1;
		        }
		        else{
		            seq2 = seq2 * 3 + 1;
		        }
            }
            table[i] = j + table[(int)seq2];
		    if (table[i] > max){
		        max = table[i];
		        start = i;
		    }
        }
        System.out.println("Max length (with table): " + max);
        System.out.println("Starting number (with table): " + start);
	}
} 