package cardgame;

import java.util.*;

public class Deck {

    private ArrayList<Card> cards;
    // private ArrayList<Card> cards2;

    //Build a deck out of the Card object and add in the arraylist.
    public Deck() {
        cards = new ArrayList<>();
        for (Suit s : Suit.values()) {
            for (Value v : Value.values()) {
                cards.add(new Card(v, s));
            }
        }
    }

    //Shuffle the card deck.
    public void shuffle() {

        Collections.shuffle(cards);
    }

    //print the whole deck. USed for testing purposes.
    public void printDeck(){
        for (Card a: cards){
            System.out.print(a);

        }

    }

    //retrieve the size of the deck to keep track of remaining cards on the deck.
    public void size(){

        System.out.print(cards.size());
    }

    //Display the first card of the deck. This is the card that is received by the player.
    public Card topCard(){

        for (Card c: cards) {
            return c;
        }

        return null;
    }

    //remove the dealt card so that the cards dont repeat,
    public void removeTop(){
        for (Card c: cards){
            cards.remove(c);
         break;
        }

    }
}