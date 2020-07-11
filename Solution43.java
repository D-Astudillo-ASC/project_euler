
import java.math.BigInteger;
public class Solution43{
    public static void main(String[] args) {
        //d1 must be greater than zero.
        //d2d3d4 divisible by 2 => d4 must be even.
        //d3d4d5 divisible by 3 => d3 + d4 + d5 divisible by 3, d5 is 3 or 9.
        //d4d5d6 divisible by 5 => d6 must be 0 or 5.
        //d6d7d8 divislble by 11 => {011,022,...,099} impossible as they are not pandigital.
        //Hence, d6 = 5 and the possibilities for d6d7d8 are {506,517,528,539,561,572,583,594}, since they are all divisible by 11.
        //d7d8d9 divisible by 13 => any sequence of the form 06(1-9) is impossible as well as 17(1-9) and 94(1-9).
        //Thus, d7d8d9 = {286,390,728,832} and d6d7d8d9 = {5286,5390,5728,5832}.
        //d8d9d10 divisible by 17 => d6d7d8d9d10 = {52867, 53901, 57289}, since none of the integers of the form 5832(1-9) are divisible by 17.
        //d5d6d7 divisible by 7 => Since d6d7 = {52,53,57}, we must search for integers of the forms (3 or 9)52, (3 or 9)53, and (3 or 9)57 that are divisible by 7.
        //Thus, d5d6d7 = {357,952} and d5d6d7d8d9d10 = {357289,952869}.
        //Since d4 must be even, d3 + d4 + d5 must be divisible by 3, and d5 must be 3 or 9, we must take all combinations of d3d4d5 that satisfy these conditions and form a pandigital sequence when concatenated to d6d7d8d9d10.
        //Thus, d3d4d5d6d7d8d9d10 = {30952867,60357289,06357289}.
        //Only unused digits are 1 and 4, so d1d2 = {14,41};
        //Therefore, d1d2d3d4d5d6d7d8d9d10 = {1430952867,1460357289,1406357289,4130952867,4160357289,4106357289}. Taking the sum of these possibilities yields the answer to this exercise. 
        BigInteger result = BigInteger.valueOf(1430952867);
        result = result.add(BigInteger.valueOf(1460357289));
        result = result.add(BigInteger.valueOf(1406357289));
        result = result.add(BigInteger.valueOf(4130952867L));
        result = result.add(BigInteger.valueOf(4160357289L)); 
        result = result.add(BigInteger.valueOf(4106357289L));
        System.out.println(result.toString());
    }
}