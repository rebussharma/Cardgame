package cardgame;

public class misc {

    //Welcome screen here.
    //

    public static String suitUni(String a){
        String suit;
        switch (a){
            case "SPADES": suit = "\u2660";
                //spade
            break;

            case "HEART": suit = "\u2665";
                //heart
            break;
            case "DIAMONDS": suit = "\u2666";
                //diamond
            break;
            case "CLUBS": suit = "\u2663";
                //club
            break;
            default: suit = "invalid";
            break;

        }
        return suit;
    }
}
