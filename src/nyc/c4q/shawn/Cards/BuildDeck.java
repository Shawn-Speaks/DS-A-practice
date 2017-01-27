package nyc.c4q.shawn.Cards;

import java.util.ArrayList;

/**
 * Created by shawnspeaks on 1/24/17.
 */
public class BuildDeck implements Deck{

    public static void main(String[] args) {
        ArrayList<Card> bumbleBee = new ArrayList<>();

        String[] suits = new String[] {"DIAMOND", "CLUB", "HEART", "SPADE"};
        int[] cardNumber = new int[13];
        for(int i = 1; i <= cardNumber.length; i++){
            cardNumber[i-1] = i;
        }

        for(int cardValue: cardNumber) {
            for (String suitType : suits) {
                bumbleBee.add(new Card(new Suit(suitType), new Value(cardValue)));
            }
        }


        Card aceOfMoons = new Card(new Suit("MOON"), new Value(13));
        Card thirteenOfMoons = new Card(new Suit("MOON"), new Value(13));


        boolean checker = aceOfMoons.equals(thirteenOfMoons);

        System.out.println(checker);





    }


    @Override
    public void shuffle() {

    }

    @Override
    public Card deal() {
        return null;
    }

    @Override
    public Card peek() {
        return null;
    }

    @Override
    public Card find(Suit suit, Value value) {
        return null;
    }

    @Override
    public boolean findAndRemove(Suit suit, Value value) {
        return false;
    }


}
