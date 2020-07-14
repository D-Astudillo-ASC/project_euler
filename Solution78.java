import java.util.ArrayList;
public class Solution78{

    public static void main(String[] args) {
        //This solution makes use of the connection between the generating function for the number of integer partitions of n, p(n), and the pentagonal number theorem.
        // I followed these Wikipedia articles: https://en.wikipedia.org/wiki/Partition_%28number_theory%29 and https://en.wikipedia.org/wiki/Pentagonal_number_theorem 

        ArrayList<Integer> partitionNums = new ArrayList<Integer>();
        partitionNums.add(1);
        int n = 0;
        while(true){
            int i = 0;
            int pentagonal = 1;
            partitionNums.add(0);
            while(pentagonal <= n){
                int sign = i % 4 > 1? -1 : 1;
                
                partitionNums.set(n, partitionNums.get(n) + sign * partitionNums.get(n - pentagonal));
                partitionNums.set(n, partitionNums.get(n) % 1000000);
                i++;
                int j = i % 2 == 0? i / 2 + 1: -((i / 2) + 1);
                pentagonal = j *((3 * j) - 1) / 2;
            }
            if(partitionNums.get(n) == 0){
                break;
            }
            n++;
        }
        System.out.println(n);
    }
}