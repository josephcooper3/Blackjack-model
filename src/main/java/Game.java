import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;

    public Game(){
        this.players = new ArrayList<Player>();
    }

    public int getPlayerCount() {
        return this.players.size();
    }
}
