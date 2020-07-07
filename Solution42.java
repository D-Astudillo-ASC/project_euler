import java.io.*;

public class Solution42{
    public static void main(String[] args) {
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader("Input42.txt"));
            //Utilizing log power rule for much faster computations, log_{b}(x^y) = y log_{b}(x).
            String line = reader.readLine();
            int triangleCount = 0;
            while(line != null){
                //System.out.println(line);
                String contents[] = line.split(",");
                for(String str : contents){
                    int value = 0;
                    for(Character ch: str.toCharArray()){
                        if(Character.isLetter(ch)){
                            //Get position of letter in alphabet.
                            int alphChar = ch - 'A' + 1;
                            value += alphChar;
                        }
                    }
                    double triangleVal = (Math.sqrt(1 + (8 * value)) - 1)/2.0;
                    if(triangleVal == (int)triangleVal){
                        triangleCount++;
                    }
                }
                line = reader.readLine();
            }
            System.out.println(triangleCount);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}