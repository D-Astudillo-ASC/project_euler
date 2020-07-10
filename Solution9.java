public class Solution9{
    //brute force. not efficient, but gets the job done.
    public static void main(String[] args) {
		int a = 0;
		int b = 0; 
		int c = 0;
		int sum = 1000;
		boolean isFound = false;
		for(a = 3; a < sum / 3;a++){
		    for(b = a; b < sum / 2; b++){
				c = sum - a - b;
				if(a * a + b * b == c * c){
					isFound = true;
					break;
				}
			}
			if(isFound){
				break;
			}
		}
		System.out.println(a * b * c);
	}
}