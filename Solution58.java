public class Solution58{
    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        else if(num <= 3){
            return true;
        }
        else if(num % 2 == 0 || num % 3 ==0){
            return false;
        }
        else{
            //Note that any primes greater than 2 or 3 can be expressed in the form 6k+1 or 6k - 1.
            for(int i = 5; i <= Math.sqrt(num);i+=6){
                //Check if num is divisible by 6k + 1 or 6k - 1.
                if(num % i == 0 || num % (i + 2) == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        //Spiral is the same one that was used on Problem 28

        int[] spiralSequence = {1,3,5,7,9};
        //This step variable keeps track of the current factor of 2 for the differences in corner values of successive spiral layers.
        int step = 2;

        int primeNumsDiag = 3;
        int diagCount = 5;
        int sideLength = 3;
        while((double)primeNumsDiag / diagCount > 0.1){
            //i = 0 -> initially it is the center of the entire spiral, but at each step this value is the start of a new spiral layer.
            //i = 1 -> upper right corner.
            //i = 2 -> upper left corner.
            //i = 3 -> lower left corner. 
            //i = 4 -> lower right corner (end of a single spiral.)  
            //Set start of new spiral layer to be the end of the previous spiral layer.  
            spiralSequence[0] = spiralSequence[4];

            for(int j = 0; j < spiralSequence.length;j++){
                //Computing new corner values.
                spiralSequence[j] = spiralSequence[0] + ((2 * step) * j);
                if(j > 0){
                    diagCount++;
                    if(isPrime(spiralSequence[j])){
                        primeNumsDiag++;
                    }
                }
            }
            //At next iteration, differences between corner values will have increased by factor of 2.
            step++;
            //side length increases by 2 each time. 
            sideLength += 2;
            
        }
        System.out.println(sideLength);
    }
}