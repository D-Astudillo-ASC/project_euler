import java.io.*;
import java.util.Arrays;
public class Solution54{

    static int isFlush(Card[] hand){

        for(int i = 0; i < 4; i++){
            if(!(hand[i].suit.equals(hand[i+1].suit))){
                return -1;
            }
        }
        return hand[4].value;
    }

    static int isStraight(Card[] hand){
        for(int i = 0; i < 4; i++){
            if(hand[i].value != hand[i+1].value - 1){
                return -1;
            }
        }
        return hand[4].value;
    }


    static int isStraightFlush(Card[] hand){
        if(isStraight(hand) > 0 && isFlush(hand) > 0){
            return hand[4].value;
        }
        return -1;
    }

    static int isRoyalFlush(Card[] hand){
        if(isFlush(hand) == 14){
            return 14;
        }
        return -1;
    }

    static int isFullHouse(Card[] hand, int getFromTriple){
        if(getFromTriple == 1 && hand[0].value == hand[1].value && hand[1].value == hand[2].value && hand[3].value == hand[4].value){
            return hand[0].value;
        }
        else if(getFromTriple == 0 && hand[0].value == hand[1].value && hand[1].value == hand[2].value && hand[3].value == hand[4].value){
            return hand[4].value;
        }
        else if(getFromTriple == 1 && hand[0].value == hand[1].value && hand[2].value == hand[3].value && hand[3].value == hand[4].value){
            return hand[4].value;
        }
        else if(getFromTriple == 0 && hand[0].value == hand[1].value && hand[2].value == hand[3].value && hand[3].value == hand[4].value){
            return hand[0].value;
        }
        else{
            return -1;
        }
    }

    static int isThreeKind(Card[] hand){
        if(hand[0].value == hand[1].value && hand[1].value == hand[2].value){
            return hand[0].value;
        }
        else if(hand[1].value == hand[2].value && hand[2].value == hand[3].value){
            return hand[1].value;
        }
        else if(hand[2].value == hand[3].value && hand[3].value == hand[4].value){
            return hand[2].value;
        }
        else{
            return -1;
        }
    }

    static int isFourKind(Card[] hand){
        if(hand[0].value == hand[1].value && hand[1].value == hand[2].value && hand[2].value == hand[3].value){
            return hand[0].value;
        }
        else if(hand[1].value == hand[2].value && hand[2].value == hand[3].value && hand[3].value == hand[4].value){
            return hand[1].value;
        }
        else{
            return -1;
        }
    }

    static int isTwoPair(Card[] hand, int pairNum){
        if (pairNum == 1 && hand[0].value == hand[1].value && hand[2].value == hand[3].value){
            return hand[0].value;
        }
        else if(pairNum == 2 && hand[0].value == hand[1].value && hand[2].value == hand[3].value){
            return hand[2].value;    
        }

        else if(pairNum == 1 && hand[0].value == hand[1].value && hand[3].value == hand[4].value){
            return hand[0].value;    
        }
        else if(pairNum == 2 && hand[0].value == hand[1].value && hand[3].value == hand[4].value){
            return hand[3].value;    
        }
        else if(pairNum == 1 && hand[1].value == hand[2].value && hand[3].value == hand[4].value){
            return hand[1].value;    
        }
        else if(pairNum == 2 && hand[0].value == hand[1].value && hand[3].value == hand[4].value){
            return hand[3].value;    
        }
        else{
            return -1;
        }
    }
    static int isOnePair(Card[] hand){
        if(hand[0].value == hand[1].value){
            return hand[0].value;
        }
        else if (hand[1].value == hand[2].value){
            return hand[1].value;
        }
        else if(hand[2].value == hand[3].value){
            return hand[2].value;
        }
        else if(hand[3].value == hand[4].value){
            return hand[3].value;
        }
        else{
            return -1;
        }
    }

    static int isHighCard(Card[] hand, int cardPos){
        return hand[4 - cardPos].value;
    }

    static String computeSuit(String suitStr){
        if(suitStr.equals("S")){
            return "Spades";
        }
        else if(suitStr.equals("D")){
            return "Diamonds";
        }
        else if(suitStr.equals("C")){
            return "Clubs";
        }
        else if(suitStr.equals("H")){
            return "Hearts";
        }
        else{
            return "Undefined";
        }
    }
    static int computeVal(char ch){
        if(Character.isDigit(ch)){
            return Character.getNumericValue(ch);
        }
        else{
            if(ch == 'T'){
                return 10;
            }
            else if (ch == 'J'){
                return 11;
            }
            else if (ch == 'Q'){
                return 12;
            }
            else if (ch == 'K'){
                return 13;
            }
            else if(ch == 'A'){
                return 14;
            }
            else{
                return 0;
            }
        }
    }

    static boolean playerOneWins(Card[] playerOne, Card[] playerTwo){
        if(isRoyalFlush(playerOne) != isRoyalFlush(playerTwo)){
            return isRoyalFlush(playerOne) > isRoyalFlush(playerTwo);
        }

        if(isStraightFlush(playerOne) != isStraightFlush(playerTwo)){
            return isStraightFlush(playerOne) > isStraightFlush(playerTwo);
        }

        if(isFourKind(playerOne) != isFourKind(playerTwo)){
            return isFourKind(playerOne) > isFourKind(playerTwo);
        }
        if(isFullHouse(playerOne, 1) != isFullHouse(playerTwo, 1)){
            return isFullHouse(playerOne, 1) > isFullHouse(playerTwo, 1);
        }
        if(isFullHouse(playerOne, 0) != isFullHouse(playerTwo, 0)){
            return isFullHouse(playerOne, 0) > isFullHouse(playerTwo, 0);
        }
        if(isFlush(playerOne) != isFlush(playerTwo)){
            return isFlush(playerOne) > isFlush(playerTwo);
        }
        
        if (isStraight(playerOne) != isStraight(playerTwo)){
            return isStraight(playerOne) > isStraight(playerTwo);
        }

        if(isThreeKind(playerOne) != isThreeKind(playerTwo)){
            return isThreeKind(playerOne) > isThreeKind(playerTwo);
        }

        if(isTwoPair(playerOne, 1) != isTwoPair(playerTwo, 1)){
            return isTwoPair(playerOne, 1) > isTwoPair(playerTwo, 1);
        }

        if(isTwoPair(playerOne, 2) != isTwoPair(playerTwo, 2)){
            return isTwoPair(playerOne, 2) > isTwoPair(playerTwo, 2);
        }

        if(isOnePair(playerOne) != isOnePair(playerTwo)){
            return isOnePair(playerOne) > isOnePair(playerTwo);
        }

        if(isHighCard(playerOne,0) != isHighCard(playerTwo, 0)){
            return isHighCard(playerOne,0) > isHighCard(playerTwo,0);
        }
        if(isHighCard(playerOne,1) != isHighCard(playerTwo, 1)){
            return isHighCard(playerOne,1) > isHighCard(playerTwo,1);
        }
        if(isHighCard(playerOne,2) != isHighCard(playerTwo, 2)){
            return isHighCard(playerOne,2) > isHighCard(playerTwo,2);
        }
        if(isHighCard(playerOne,3) != isHighCard(playerTwo, 3)){
            return isHighCard(playerOne,3) > isHighCard(playerTwo,3);
        }
        return false;
    }

    public static void main(String[] args) {
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader("Input54.txt"));
            String line = reader.readLine();
            int count = 0;
            while(line != null){
                //System.out.println(line);
                String contents[] = line.split(" ");
                Card playerOne[] = new Card[5];
                Card playerTwo[] = new Card[5];
                for(int i = 0; i < contents.length; i++){
                    Card c = new Card(computeSuit(Character.toString(contents[i].charAt(1))), computeVal(contents[i].charAt(0))); 
                    if(i >= 0 && i <= 4){
                        //c = new Card(computeSuit(Character.toString(contents[i].charAt(1))), computeVal(contents[i].charAt(0)));
                        playerOne[i] = c;
                    }
                    else{
                        //c = new Card(computeSuit(Character.toString(contents[i].charAt(1))), computeVal(contents[i].charAt(0)));
                        playerTwo[i % 5] = c;
                    }
                }

                Arrays.sort(playerOne);
                Arrays.sort(playerTwo);

                /*
                printing hands 

                System.out.print("Hand 1: ");
                for(Card c : playerOne){
                    System.out.print(c.toString() + " ");
                }

                System.out.print(", Hand 2: ");
                for(Card c : playerTwo){
                    System.out.print(c.toString() + " ");
                }
                System.out.println();
                */
                if(playerOneWins(playerOne, playerTwo)){
                    count++;
                }
                line = reader.readLine();
            }
            System.out.println(count);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}