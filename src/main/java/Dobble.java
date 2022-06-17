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
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % x == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }



    @Override
    public String toString() {
        return cardsDeck.toString();

    }
}
