public class Solution39{
    public static void main(String[] args) {
        //Given: a^2 + b^2 = c^2, a + b + c = perimeter, c = perimeter - a - b.
        //So, a^2 + b^2 = (perimeter - a - b)^2
        // Soliving for b yields b = ((perimeter)^2 - 2a(perimeter)) / (2(perimeter) - 2a).

        int result = 0;
        int maxSolutions = 0;
        for(int perimeter = 2; perimeter <= 1000; perimeter+=2){
            int numSolutions = 0;
            for(int a = 2; a < (perimeter / 3); a++){
                if(perimeter * (perimeter - 2 * a) % (2 * perimeter - 2 * a) == 0){
                    numSolutions++;
                }
            }
            if(numSolutions > maxSolutions){
                maxSolutions = numSolutions;
                result = perimeter;
            }
        }
        System.out.println(result);
    }
}