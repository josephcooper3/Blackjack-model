import java.util.ArrayList;
import java.util.HashMap;

public class Game {

    private Deck deck;
    private Player dealer;
    private ArrayList<Player> players;
    private HashMap<RankType, Integer> values;

    public Game(Deck deck, Player dealer){
        this.deck = deck;
        this.dealer = dealer;
        this.players = new ArrayList<Player>();
        this.values = new HashMap<RankType, Integer>();
    }

    public int getPlayerCount() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void addValue(RankType rank, int value){
        this.values.put(rank, value);
    }

    public void addBlackjackValues(){
        this.addValue(RankType.TWO, 2);
        this.addValue(RankType.THREE, 3);
        this.addValue(RankType.FOUR, 4);
        this.addValue(RankType.FIVE, 5);
        this.addValue(RankType.SIX, 6);
        this.addValue(RankType.SEVEN, 7);
        this.addValue(RankType.EIGHT, 8);
        this.addValue(RankType.NINE, 9);
        this.addValue(RankType.TEN, 10);
        this.addValue(RankType.JACK, 10);
        this.addValue(RankType.QUEEN, 10);
        this.addValue(RankType.KING, 10);
        this.addValue(RankType.ACE, 10);
    }

    public Integer getValue(RankType rank) {
        return this.values.get(rank);
    }
}
