import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Dobble {

    private ArrayList<Card> cardsDeck;


    /**
     * @descr: Método constructor.
     */
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

    public ArrayList missingCards(ArrayList cardsDeck){


        ArrayList newCardsDeck = new ArrayList();

        Card firstCard = this.cardsDeck.get(1);
        int sizeFirstCard = firstCard.getListElements().size();

        int sizeDeck = cardsDeck.size();

        int order = sizeFirstCard-1;
        int totalElements = order*order+order+1;

        if (esPrimo(order)){
            return cardsDeck;
        }

        else {
            return newCardsDeck;
        }
    }


    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {

            if (numero % x == 0)
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return cardsDeck.toString();

    }
}
