import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Dobble {

    private ArrayList<Card> cardsDeck;

    public Dobble (){
        this.cardsDeck = new ArrayList<>();
    }

    public ArrayList getCardsDeck() {
        return cardsDeck;
    }

    public void setCardsDeck(ArrayList cardsDeck) {
        this.cardsDeck = cardsDeck;
    }

    public void addCard(ArrayList<Integer> card){
        Card carta = new Card(card);
        this.cardsDeck.add(carta);
    }

    public Card nthCard(ArrayList cardsDeck, int n){
        return this.cardsDeck.get(n);
    }

    public int findTotalCards(Card carta){
        int order = carta.getListElements().size()-1;
        int totalCards = order*order+order+1;
        return totalCards;
    }

    public int requiredElements(Card carta){
        int order = carta.getListElements().size()-1;
        int totalElements = order*order+order+1;
        return totalElements;
    }
    

    @Override
    public String toString() {
        return cardsDeck.toString();

    }
}
