import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Deck deck;

    @Before
    public void before(){
        player1 = new Player("Gert");
        deck = new Deck();
    }

    @Test
    public void canGetName(){
        assertEquals("Gert", player1.getName());
    }

    @Test
    public void handStartsAtZero(){
        assertEquals(0, player1.countHand());
    }

    @Test
    public void canDrawCard(){
        deck.addAllCards();
        player1.drawCard(deck);
        assertEquals(1, player1.countHand());
    }

    @Test
    public void canGetHand(){
        Card tenOfClubs = new Card(SuitType.CLUBS, RankType.TEN);
        deck.addCard(tenOfClubs);
        player1.drawCard(deck);
        assertEquals(true, player1.getHand().contains(tenOfClubs));
    }

}
