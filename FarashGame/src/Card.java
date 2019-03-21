package cardgame;


//enum to keep track of card values and the suit
enum Suit {HEART, DIAMONDS, SPADES, CLUBS}
enum Value {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

public class Card {
    Value value;
    Suit suit;
    misc sui = new misc();


    public Card (Value v, Suit s) {
        value = v; suit = s;}

    public String toString() {
        return value.toString() + " " + sui.suitUni(suit.toString());
    }
}





