public class Card <V,S>{
    private V value;
    private S suit;

    public Card(V value, S suit) {
        this.value = value;
        this.suit = suit;
    }

    public S getSuit() {
        return suit;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.value + " of " + this.suit;
    }
}
