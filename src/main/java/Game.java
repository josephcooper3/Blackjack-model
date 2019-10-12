import java.util.ArrayList;

public class Game {

    private Player dealer;
    private ArrayList<Player> players;

    public Game(){
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
}
