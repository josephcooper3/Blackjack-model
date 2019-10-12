import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

    Game game;
    Player dealer;
    Player player1;

    @Before
    public void before(){
        dealer = new Player("Dealer");
        player1 = new Player("Player 1");
        game = new Game();
    }

    @Test
    public void startsWithNoPlayers(){
        assertEquals(0, game.getPlayerCount());
    }

    @Test
    public void startsWithNoDealer(){
        assertEquals(null, game.getDealer());
    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player1);
        assertEquals(1, game.getPlayerCount());
    }

    @Test
    public void canAddDealer(){
        game.addDealer(dealer);
        assertEquals(dealer, game.getDealer());
    }

}
