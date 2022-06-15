import java.sql.SQLOutput;
import java.util.List;

public class DobbleGame {

    private List gameArea;
    private Dobble gameDeck;
    private List gamePlayers;
    private int gameNumPlayers;
    private String gameMode;

    public DobbleGame(List gameArea, Dobble gameDeck, List gamePlayers, int gameNumPlayers, String gameMode) {
        this.gameArea = gameArea;
        this.gameDeck = gameDeck;
        this.gamePlayers = gamePlayers;
        this.gameNumPlayers = gameNumPlayers;
        this.gameMode = gameMode;
    }
    public List getGameArea() {
        return gameArea;
    }

    public void setGameArea(List gameArea) {
        this.gameArea = gameArea;
    }

    public Dobble getGameDeck() {
        return gameDeck;
    }

    public void setGameDeck(Dobble gameDeck) {
        this.gameDeck = gameDeck;
    }

    public List getGamePlayers() {
        return gamePlayers;
    }

    public void setGamePlayers(List gamePlayers) {
        this.gamePlayers = gamePlayers;
    }

    public int getGameNumPlayers() {
        return gameNumPlayers;
    }

    public void setGameNumPlayers(int gameNumPlayers) {
        this.gameNumPlayers = gameNumPlayers;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    @Override
    public String toString() {
        return "DobbleGame{" +
                "gameArea=" + gameArea +
                ", gameDeck=" + gameDeck +
                ", gamePlayers=" + gamePlayers +
                ", gameNumPlayers=" + gameNumPlayers +
                ", gameMode='" + gameMode + '\'' +
                '}';
    }
}
