import java.util.ArrayList;
import java.util.List;

public class Dobble {

    private List<Card> cardsDeck;

    public Dobble (){
        this.cardsDeck = new ArrayList<>();
    }

    public List getCardsDeck() {
        return cardsDeck;
    }

    public void setCardsDeck(List cardsDeck) {
        this.cardsDeck = cardsDeck;
    }

    public void addCard(ArrayList<Integer> card){
        Card carta = new Card(card);
        this.cardsDeck.add(carta);
    }

    @Override
    public String toString() {
        return cardsDeck.toString();

    }
}
