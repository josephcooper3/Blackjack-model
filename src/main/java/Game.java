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

    public int getScore(Player player) {
        ArrayList<Card> hand = player.getHand();
        Integer handScore = 0;
        for (Card card:
             hand) {
            RankType rank = card.getRank();
            Integer cardScore = this.getValue(rank);
            handScore += cardScore;
        }
        return handScore;
    }

    public Player getHighestScorer(Player firstPlayer, Player secondPlayer) {
        return this.getScore(firstPlayer) > this.getScore(secondPlayer) ? firstPlayer : secondPlayer;
    }

//    public String runGame() {
//        dealer.drawCard(this.deck);
//        dealer.drawCard(this.deck);
//        Player highestScoringPlayer = this.players.get(0);
//        for (Player player:
//             this.players) {
//            player.drawCard(this.deck);
//            player.drawCard(this.deck);
//            if (this.getScore(player) > this.getScore(highestScoringPlayer)){
//                highestScoringPlayer = player;
//            }
//        }
//        Player winner =
//    }
}
