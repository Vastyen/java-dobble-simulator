import java.util.List;

public class Dobble {

    private List cardsDeck;

    public Dobble (List cardsDeck){
        this.cardsDeck = cardsDeck;
    }

    public List getCardsDeck() {
        return cardsDeck;
    }

    public void setCardsDeck(List cardsDeck) {
        this.cardsDeck = cardsDeck;
    }

    @Override
    public String toString() {
        return "Dobble{" +
                "cardsDeck=" + cardsDeck +
                '}';
    }
}
