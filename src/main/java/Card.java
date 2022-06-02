import java.util.List;

public class Card {

    private int numCard;
    private int numElements;
    private List listElements;

    public Card (int numCard, int numElements, List listElements){
        this.numCard = numCard;
        this.numElements = numElements;
        this.listElements = listElements;
    }

    public int getNumCard() {
        return numCard;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }

    public int getNumElements() {
        return numElements;
    }

    public void setNumElements(int numElements) {
        this.numElements = numElements;
    }

    public List getListElements() {
        return listElements;
    }

    public void setListElements(List listElements) {
        this.listElements = listElements;
    }

    @Override
    public String toString() {
        return "Card{" +
                "numCard=" + numCard +
                ", numElements=" + numElements +
                ", listElements=" + listElements +
                '}';
    }
}
