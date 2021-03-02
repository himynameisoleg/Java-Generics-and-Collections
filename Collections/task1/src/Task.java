import java.util.ArrayList;

public class Task {
    public static void main(String[] args){
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:"+hand);
        System.out.println("Cards add:"+addCards(hand));


        for(Card c : d) {
            System.out.println(c.toString());
        }

    }

    public static int addCards(ArrayList<Card> hand){
        int sum = 0;

        for (Card c : hand) {
            if (c.getValue() == "King") sum += 13;
            else if (c.getValue() == "Queen") sum += 12;
            else if (c.getValue() == "Jack") sum += 11;
            else if (c.getValue() == "Ace") sum += 1;
            else sum += (int) c.getValue();
        }

        return sum;
    }
}