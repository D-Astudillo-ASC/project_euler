public class Solution12{
    //Trivial approach.
    static int numDivisors(int num){
        int numDivisors = 0;
        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                numDivisors+=2;
            }
        }
        if(Math.sqrt(num) * Math.sqrt(num) == num){
            numDivisors--;
        }
        return numDivisors;
    }
    public static void main(String[] args) {
	    
	    int given = 28;
	    //1,2,4,7,14,28, 1+2+3+4+5+6+7 = 28
	    int j = 8;
	    while(numDivisors(given) < 500){
            given = given + j;
            j++;
	    }
	    System.out.println("First triangle number with 500 divisors: " + given);
    }
}
