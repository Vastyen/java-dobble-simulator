import java.util.ArrayList;

public class Card {

    private ArrayList<Integer> listElements;

    public Card (ArrayList<Integer> listElements){
        this.listElements = (ArrayList)listElements.clone();
    }

    /**
     * @descr: Métodos selectores y modificadores.
     */
    public ArrayList<Integer> getListElements() {
        return listElements;
    }

    public void setListElements(ArrayList<Integer> listElements) {
        this.listElements = listElements;
    }

    @Override
    public String toString() {
        return listElements + "\n";
    }
}
