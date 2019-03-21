package cardgame;


public class farash {
    static Deck deck1 = new Deck();
    public static void gameLoop() {

        deck1.shuffle();
        for (int i = 0; i<= 2; i++){
            System.out.print(deck1.topCard()+ " ");
            deck1.removeTop();
        }

        System.out.println("\n");
        deck1.size();
        System.out.println(" cards remaining in the Deck!");
    }

}
