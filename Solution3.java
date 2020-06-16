public class Solution3{

    static long findMaxPrimeFact(long num)
    {
        long maxPrime = 0;
        //First divide out all 2's from the number.
        while(num % 2 == 0){
            maxPrime = 2;
            num = num/2;
        }
        //Since we divided out all 2's, largest possible factor is now sqrt(n), smallest factor is 3, and we can skip over even factors of n.
        for(int i = 3; i < Math.sqrt(num); i+=2){
            while(num % i == 0){
                maxPrime = i;
                num = num / i;
            }
        }
        
        //case where num itself is prime and greater than 2
        if (num > 2) 
            maxPrime = num;
            
        return maxPrime;
    }
    
    public static void main(String []args){
        long n = 600851475143L;
        System.out.println(findMaxPrimeFact(n));
    }
}