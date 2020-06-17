public class Solution17{
    static String ones[] = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	static String tens[] = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	static String hundred = " hundred";
	static String thousand = "thousand";
	static String toEnglish(int num){
	    String result = "";
	    if(num < 20){
	        result += ones[num - 1];
	    }
	    else if(num < 100){
	        result += tens[(num/10) - 2];
	        if(num % 10 > 0){
	            result += " " + toEnglish(num % 10);
	        }
	        
	    }
	    else if(num < 1000){
	        result += toEnglish(num/100) + hundred;
	        if(num % 100 > 0){
	            result += " and " + toEnglish(num % 100);
	        }
	    }
	    else {
	        if(num == 1000){
	            result += "one " + thousand;
	        }
	        if(num > 1000){
	            result += toEnglish(num/1000) + " " + thousand;
	            if(num % 1000 > 0){
	                result += " " + toEnglish(num % 1000);
	            }
	        }
	    }
	    return result;
	}
    public static void main(String[] args) {
        int sum = 0;
	    for(int i = 1; i <= 1000; i++){
	        String english = toEnglish(i);
	        for(Character ch : english.toCharArray()){
	            if(Character.isLowerCase(ch)){
	                sum++;
	            }
	        }
	    }
	    System.out.println(sum);
    }
}