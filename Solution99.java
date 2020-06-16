import java.io.*;
public class Solution99{
    public static void main(String[] args) {
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader("Input99.txt"));
            //Utilizing log power rule for much faster computations, log_{b}(x^y) = y log_{b}(x).
            String line = reader.readLine();
            double max = Double.MIN_VALUE;
            String pair = "";
            int lineNum = 1;
            int maxLineNum = 0;
            while(line != null){
                //System.out.println(line);
                String contents[] = line.split(",");
                double cur = Double.parseDouble(contents[1]) * Math.log(Double.parseDouble(contents[0]));
                if(cur > max){
                    max = cur;
                    pair = contents[0] + "," + contents[1];
                    maxLineNum = lineNum;
                }
                line = reader.readLine();
                lineNum++;
            }
            System.out.println(maxLineNum + ": " + pair);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}