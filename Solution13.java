import java.io.*;
import java.math.BigInteger;
public class Solution13{
    public static void main(String[] args) {
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader("Input13.txt"));
            BigInteger sum = new BigInteger("0");
            //Utilizing log power rule for much faster computations, log_{b}(x^y) = y log_{b}(x).
            String line = reader.readLine();
            while(line != null){
                //System.out.println(line);
                BigInteger number = new BigInteger(line);

                sum = sum.add(number);
                //System.out.println(sum.toString());
                line = reader.readLine();
            }
            System.out.println(sum.toString().substring(0, 10));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}