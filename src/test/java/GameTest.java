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

}
