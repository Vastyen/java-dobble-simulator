import java.util.ArrayList;
import java.util.List;

public class Card {

    private ArrayList<Integer> listElements;

    public Card (ArrayList<Integer> listElements){
        this.listElements = (ArrayList)listElements.clone();
    }

    public void addElements(int element){
        listElements.add(element);
    }

    public void clearCard(){
        listElements.clear();
    }

    @Override
    public String toString() {
        return listElements + "\n";
    }
}
