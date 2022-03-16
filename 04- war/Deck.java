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
  public void shuffle() {
    // making new array list for shuffled deck
    ArrayList<Card> shuffledDeck = new ArrayList<Card>();

    for(int i = 0; i < 52; i++) {
    // generate random number from 0 to 51 (.size() - 1)
    // taking card away every time so the size will decrease
    int random = (int)(Math.random() * (this.deck.size() - 1));

    // add random value to shuffled deck
    shuffledDeck.add(this.deck.get(random));
    // remove random value from original deck
    this.deck.remove(random);
    }
  }

} // end class
