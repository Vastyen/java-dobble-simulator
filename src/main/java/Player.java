public class Player {

    private String name;
    private int score;
    private boolean turnStatus;

    public Player (String name, int score, boolean turnStatus){
        this.name = name;
        this.score = score;
        this.turnStatus = false; // Por defecto el jugador no está en su turno.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isTurnStatus() {
        return turnStatus;
    }

    public void setTurnStatus(boolean turnStatus) {
        this.turnStatus = turnStatus;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", turnStatus=" + turnStatus +
                '}';
    }
}
