import java.util.ArrayList;

public class Game {

    private Deck deck;
    private Player dealer;
    private ArrayList<Player> players;

    public Game(Deck deck, Player dealer){
        this.deck = deck;
        this.dealer = dealer;
        this.players = new ArrayList<Player>();
    }

    public int getPlayerCount() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
}
