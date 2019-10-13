import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

    Game game;
    Player dealer;
    Player player1;
    Deck deck;

    @Before
    public void before(){
        dealer = new Player("Dealer");
        player1 = new Player("Player 1");
        deck = new Deck();
        game = new Game(deck, dealer);
    }

    @Test
    public void startsWithNoPlayers(){
        assertEquals(0, game.getPlayerCount());
    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player1);
        assertEquals(1, game.getPlayerCount());
    }

    @Test
    public void canGetValue(){
        game.addValue(RankType.TEN, 10);
        int value = game.getValue(RankType.TEN);
        assertEquals(10, value);
    }

    @Test
    public void gameCanGetScore(){
        Card tenOfClubs = new Card(SuitType.CLUBS, RankType.TEN);
        deck.addCard(tenOfClubs);
        player1.drawCard(deck);
        game.addPlayer(player1);
        game.addBlackjackValues();
        int score = game.getScore(player1);
        assertEquals(10, score);
    }

    @Test
    public void canGetHighestScorer(){
        game.addPlayer(player1);
        game.addBlackjackValues();
        deck.addAllCards();
        dealer.drawCard(deck);
        // Only dealer has drawn a card so will always have highest score
        assertEquals(dealer, game.getHighestScorer(dealer, player1));
    }

//    @Test
//    public void canRunGame(){
//        game.addPlayer(player1);
//        game.addBlackjackValues();
//        String result = game.runGame();
////      Have not run deck.shuffle(), so dealer will draw the ace and win
//        assertEquals(result, "Dealer has won the game!");
//    }

}
