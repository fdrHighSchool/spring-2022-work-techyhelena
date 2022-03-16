import java.util.*;
public class Pile {
    // assign p1 and p2 their own arraylist 
    private ArrayList<Card> player1;
    private ArrayList<Card> player2;

    // constructor 
    public Pile() {
        this.player1 = new ArrayList<Card>(26);
        this.player2 = new ArrayList<Card>(26);
    }
}
