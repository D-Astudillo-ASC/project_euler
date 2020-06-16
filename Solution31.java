public class Solution31{
    //Dynamic Programming approach with caching.
    public static void main(String[] args) {
        //Coins in pence.
        int[] coins = {1,2,5,10,20,50,100,200};
        int[] table = new int[201];
        table[0] = 1;
        for(int i = 0; i < coins.length;i++){
            for(int j = coins[i]; j <= 200; j++){
                table[j] += table[j - coins[i]];
            }
        }
        System.out.println(table[200]);
    }
}