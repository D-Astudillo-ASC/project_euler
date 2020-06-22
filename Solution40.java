public class Solution40{
    public static void main(String[] args) {
		
		int digitPos = 0;
	    String curNum = "1";
	    int product = 1;
		while(digitPos <= 1000000){
		    for(Character ch : curNum.toCharArray()){
		        digitPos++;
		        if(digitPos == 10 || digitPos == 100 || digitPos == 1000 || digitPos == 10000 || digitPos == 100000 || digitPos == 1000000){
		            product *= Character.getNumericValue(ch);
		        }
		    }
		    int updateNum = Integer.parseInt(curNum) + 1;
		    curNum = Integer.toString(updateNum);
		}
		System.out.println(product);
		
	}
}