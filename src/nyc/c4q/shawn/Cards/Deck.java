package nyc.c4q.shawn.Cards;

/**
 * Created by shawnspeaks on 1/24/17.
 */
public interface Deck {

    void shuffle();

    Card deal();

    Card peek();

    Card find(Suit suit, Value value);

    boolean findAndRemove(Suit suit, Value value);

}
