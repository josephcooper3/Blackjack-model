import java.util.ArrayList;

public class Game {

    private Deck deck;
    private Player dealer;
    private ArrayList<Player> players;

    public Game(Deck deck){
        this.deck = deck;
        this.players = new ArrayList<Player>();
    }

    public int getPlayerCount() {
        return this.players.size();
    }

    public void addDealer(Player dealer) {
        this.dealer = dealer;
    }

    public Player getDealer() {
        return this.dealer;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
}
