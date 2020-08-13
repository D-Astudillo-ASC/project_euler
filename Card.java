/*
    Card class for Problem 54.
    Implements the Comparable interface to enable sorting of arrays of objects of type Card.
*/
public class Card implements Comparable{
    String suit;
    int value;
    public Card(String cardSuit, int cardVal){
        this.suit = cardSuit;
        this.value = cardVal;
    }

    public String toString(){
        return Integer.toString(this.value) + " " + this.suit;
    }
    public int compareTo(Object o) {
        try{
            if (o instanceof Card) {
                Card c = (Card)o;
                if (this.value < c.value)
                    return -1;
                else if (this.value > c.value)
                    return 1;
                else
                    return 0;
            }
            return 0;
        }    
        catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }
}