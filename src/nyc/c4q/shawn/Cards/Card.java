package nyc.c4q.shawn.Cards;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by shawnspeaks on 1/24/17.
 */
public class Card {

    Suit suit;
    Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
// TODO:  CORRECT THE IMPLEMENTATION OF HASHCODE

        int totalPoints = 0;
        for(int i = 0; i < suit.suitType.length(); i++){

            totalPoints += suit.suitType.charAt(i) * value.cardVal;

        }

        return totalPoints;


    }

    @Override
    public boolean equals(Object obj) {

        // TODO: CORRECT THE IMPLEMENTATION OF .equals()
//        return super.equals(obj);
        return this.equals(obj);
    }
}
