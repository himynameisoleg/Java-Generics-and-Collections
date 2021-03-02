import java.util.*;

public class Deck implements Iterable<Card>{
    private List<Card> deck;
    private String[] suits = {"Hearts","Clubs","Diamonds","Spades"};

    public Deck() {
        deck = new ArrayList<>();

        for (int i = 0; i < suits.length; i++) {
            for (int j = 1; j <= 10; j++) {
                deck.add(new Card(j == 1 ? "Ace" : j, suits[i]));
            }
            this.deck.add(new Card("Jack", suits[i]));
            this.deck.add(new Card("Queen", suits[i]));
            this.deck.add(new Card("King", suits[i]));
        }
    }

    public Card dealCard(){
        int randIndex  = new Random().nextInt(this.deck.size());
        Card removed = deck.get(randIndex);
        this.deck.remove(randIndex);
        return removed;
    }

    public int size() {
        return this.deck.size();
    }
    @Override
    public Iterator<Card> iterator() {
        return new DeckIterator(this);
    }
}
