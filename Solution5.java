/*
Problem 5: 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class Solution5{

    public static void main(String[] args) {
        boolean found = false;
        int num = 20;
        while(found != true){
            if(num % 11 == 0 && num % 12 == 0 && num % 13 == 0 && num % 14 ==0 && num % 15 ==0 && num % 16 == 0 && num % 17 == 0 && num % 18 == 0 && num % 19 ==0){
                found = true;
                System.out.println(num);
            }
            else{
                num++;
            }
        }
    }
}