import java.io.*;
import java.util.*;
public class Solution22{
    public static void main(String[] args) {
    
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader("Input22.txt"));
            //Utilizing log power rule for much faster computations, log_{b}(x^y) = y log_{b}(x).
            String line = reader.readLine();
            ArrayList<String> names = new ArrayList<String>();
            while(line != null){
                //System.out.println(line);
                String contents[] = line.split(",");
                for(String str : contents){
                    names.add(str);
                }
                line = reader.readLine();
            }
            Collections.sort(names);

            int total = 0;
            for(int i = 0; i < names.size(); i++){
                int alphVal = 0;
                for(Character ch: names.get(i).toCharArray()){
                    if(Character.isLetter(ch)){
                        //Get position of letter in alphabet.
                        int alphChar = ch - 'A' + 1;
                        alphVal += alphChar;
                    }
                }
                total += alphVal * (i + 1);
            }
            System.out.println(total);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}