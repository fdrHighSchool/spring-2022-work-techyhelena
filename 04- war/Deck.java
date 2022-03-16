// REFER TO THIS SITE: https://books.trinket.io/thinkjava/chapter12.html
import java.util.*;

public class Deck {
  private ArrayList<Card> deck;

  public Deck() {
    this.deck = new ArrayList<Card>();

    for(int suit = 0; suit <= 3; suit++) {
      for(int value = 2; value <= 14; value++) {
        this.deck.add(new Card(value, suit));
      } // end inner for loop
    } // end outer for loop

  } // end constructor method

  public int getLength() {
    return deck.size();
  }

  public void displayDeck() {
    for(Card c : this.deck) {
      System.out.println(c);
    }
  }

  public Card getIndex() { // fix 
    for(Card c: this.deck) {
      return c;
    }
  }

  // loop all the indexes and then store new index in temp
  // after use temp as the new index 
  public int shuffle() {
    int temp; 
    return this.deck;
  }

} // end class
