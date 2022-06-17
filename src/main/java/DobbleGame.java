import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DobbleGame {

    private ArrayList gameArea;
    private ArrayList gameDeck;
    private ArrayList<Player> gamePlayers;
    private int gameNumPlayers;
    private String gameMode;

    /**
     * @descr: Método constructor.
     */
    public DobbleGame(ArrayList gameArea, ArrayList gameDeck, ArrayList<Player> gamePlayers, int gameNumPlayers, String gameMode) {
        this.gameArea = gameArea;
        this.gameDeck = gameDeck;
        this.gamePlayers = gamePlayers;
        this.gameNumPlayers = gameNumPlayers;
        this.gameMode = gameMode;
    }

    /**
     * @descr: Métodos selectores y modificadores.
     */

    public ArrayList getGameArea() {
        return gameArea;
    }



    public void setGameArea(ArrayList gameArea) {
        this.gameArea = gameArea;
    }

    public ArrayList getGameDeck() {
        return gameDeck;
    }

    public void setGameDeck(ArrayList gameDeck) {
        this.gameDeck = gameDeck;
    }

    public ArrayList<Player> getGamePlayers() {
        return gamePlayers;
    }

    public void setGamePlayers(ArrayList<Player> gamePlayers) {
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

    /**
     * @descr: Método que realiza el modo de juego stackMode
     * @param: No aplica.
     * @return: No aplica.
     */
    public void stackMode(){

        int sizeDeck = this.gameDeck.size();

        if (sizeDeck == 1){
            this.gameArea.add(this.gameDeck.get(0));
            this.gameDeck.remove(0);
        }

        else{
            this.gameArea.add(this.gameDeck.get(sizeDeck-1));
            this.gameArea.add(this.gameDeck.get(sizeDeck-2));
            this.gameDeck.remove(sizeDeck-1);
            this.gameDeck.remove(sizeDeck-2);
        }

    }

    /**
     * @descr: Método que realiza el modo de juego emptyHandsStackMode
     * @param: No aplica.
     * @return: No aplica.
     */
    public void emptyHandsStackMode(){
        int sizeDeck = this.gameDeck.size();
        this.gameArea.add(this.gameDeck.get(sizeDeck));
        int randomValue = randomNumber();
        this.gameArea.add(this.gameDeck.get(randomValue));
        this.gameDeck.remove(sizeDeck);
        this.gameDeck.remove(randomValue);
    }

    /**
     * @descr: Método que realiza un modo de juego personalizado.
     * este modo obtiene las primeras dos cartas del mazo.
     * @param: No aplica.
     * @return: No aplica.
     */
    public void myMode(){
        int sizeDeck = this.gameDeck.size();
        this.gameArea.add(this.gameDeck.get(0));
        this.gameArea.add(this.gameDeck.get(1));
        this.gameDeck.remove(0);
        this.gameDeck.remove(0);
    }

    /**
     * @descr: Método que obtiene un número aleatorio.
     * @param: No aplica.
     * @return: Número entero aleatorio (integer).
     */
    public int randomNumber(){
        int min = 0;
        int max = getGameDeck().size()-1;
        Random random = new Random();
        int value = random.nextInt(max + min) + min;
        return value;
    }

    /**
     * @descr: Método que realiza el modo de juego de demostración.
     * @param: No aplica.
     * @return: No aplica.
     */
    public void demoMode(){
        int randomValue1 = randomNumber();
        int randomValue2 = randomNumber();
        this.gameArea.add(this.gameDeck.get(randomValue1));
        this.gameDeck.remove(randomValue1);
        this.gameArea.add(this.gameDeck.get(randomValue2));
        this.gameDeck.remove(randomValue2);
    }

    @Override
    public String toString() {
        return "Dobble Game\n" +
                "Area de Juego: " + gameArea +
                ", Mazo: " + gameDeck +
                ", Jugadores: " + gamePlayers +
                ", Número de Jugadores: " + gameNumPlayers +
                ", Modo de Juego: " + gameMode;
    }
}
