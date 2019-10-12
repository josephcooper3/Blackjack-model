import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public Object getName() {
        return this.name;
    }

    public int countHand() {
        return this.hand.size();
    }

    public void drawCard(Deck deck) {
        Card drawnCard = deck.dealCard();
        this.hand.add(drawnCard);
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }
}
