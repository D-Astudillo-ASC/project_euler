public class Solution9{
    //brute force. not efficient at all, but gets the job done.
    public static void main(String[] args) {
		int a = 0;
		int b = 0; 
		int c = 0;
		for(int j = 3; j < 1000;j++){
		    for(int k = 4; k < 1000; k++){
		        for(int l = 5; l < 1000; l++){
		            if(j * j + k * k == l * l){
		                if(j + k + l == 1000){
		                    a = j;
		                    b = k;
		                    c = l;
		                    break;
		                }
		            }
		        }
		    }
		}
		System.out.println(a * b * c);
	}
}