import java.util.List;

public class Card {

    private List listElements;

    public Card (List listElements){
        this.listElements = listElements;
    }

    public List getListElements() {
        return listElements;
    }

    public void setListElements(List listElements) {
        this.listElements = listElements;
    }

    public void addElements(int element){
        listElements.add(element);
    }

    public void clearCard(){
        listElements.clear();
    }


    @Override
    public String toString() {
        return "Card{" +
                "listElements=" + listElements +
                '}';
    }
}
