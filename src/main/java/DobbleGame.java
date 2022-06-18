import java.util.ArrayList;
import java.util.Objects;
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
     * @descr: Método que realiza el modo de juego stackMode.
     * @param: No aplica.
     * @return: No aplica.
     */
    public void stackMode(ArrayList gameArea, ArrayList gameDeck){
        int sizeDeck = gameDeck.size();
        if (sizeDeck == 1){
            gameArea.add(gameDeck.get(0));
            gameDeck.remove(0);
        }
        else{
            gameArea.add(gameDeck.get(sizeDeck-1));
            gameArea.add(gameDeck.get(sizeDeck-2));
            gameDeck.remove(sizeDeck-1);
            gameDeck.remove(sizeDeck-2);
        }
    }

    /**
     * @descr: Método que realiza el modo de juego emptyHandsStackMode.
     * @param: No aplica.
     * @return: No aplica.
     */
    public void emptyHandsStackMode(ArrayList gameArea, ArrayList gameDeck){
        int sizeDeck = gameDeck.size();
        gameArea.add(gameDeck.get(sizeDeck));
        int randomValue = randomNumber();
        gameArea.add(gameDeck.get(randomValue));
        gameDeck.remove(sizeDeck);
        gameDeck.remove(randomValue);
    }

    /**
     * @descr: Método que busca de quién es el turno en el juego.
     * @param: ArrayList<Player> Lista de jugadores.
     * @return: Nombre del jugador (String).
     */
    public String whoTurnIsIt(ArrayList<Player> gamePlayers){
        for (int i = 0; i < gamePlayers.size()-1; i++) {
            if (gamePlayers.get(i).isTurnStatus()) {
                return gamePlayers.get(i).getName();
            }
        }
        return null;
    }

    /**
     * @descr: Método que realiza un modo de juego personalizado.
     * este modo obtiene las primeras dos cartas del mazo.
     * @param: No aplica.
     * @return: No aplica.
     */
    public void myMode(ArrayList gameArea, ArrayList gameDeck){
        int sizeDeck = gameDeck.size();
        gameArea.add(gameDeck.get(0));
        gameArea.add(gameDeck.get(1));
        gameDeck.remove(0);
        gameDeck.remove(0);
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
    public void demoMode(ArrayList gameArea, ArrayList gameDeck){
        int randomValue1 = randomNumber();
        int randomValue2 = randomNumber();
        gameArea.add(gameDeck.get(randomValue1));
        gameDeck.remove(randomValue1);
        gameArea.add(gameDeck.get(randomValue2));
        gameDeck.remove(randomValue2);
    }

    @Override
    /**
     * @descr: Método que genera un string de clase Dobble.
     * @param: No aplica.
     * @return: String.
     */
    public String toString() {
        return "Dobble Game\n" +
                "Area de Juego: " + gameArea +
                ", Mazo: " + gameDeck +
                ", Jugadores: " + gamePlayers +
                ", Número de Jugadores: " + gameNumPlayers +
                ", Modo de Juego: " + gameMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DobbleGame that = (DobbleGame) o;
        return gameNumPlayers == that.gameNumPlayers && Objects.equals(gameArea, that.gameArea) && Objects.equals(gameDeck, that.gameDeck) && Objects.equals(gamePlayers, that.gamePlayers) && Objects.equals(gameMode, that.gameMode);
    }

}
