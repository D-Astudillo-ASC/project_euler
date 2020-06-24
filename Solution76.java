public class Solution76{
    public static void main(String[] args) {
        int targetSum = 100;
		//Dynamic Programming approach from Problem 31.
		int table[] = new int[101];
		table[0] = 1;
		for(int i = 1; i < 100; i++){
		    for(int j = i; j <= targetSum; j++){
		        table[j] += table[j - i];
		    }
		}
		System.out.println(table[100]);
    }
}