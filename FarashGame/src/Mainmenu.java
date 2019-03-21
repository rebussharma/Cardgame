package cardgame;
import java.util.ArrayList;
import java.util.Scanner;

public class Mainmenu {
    public void menu(){
        ArrayList<String> player = new ArrayList<>();
        System.out.println("Hello and welcome to Farash game.");
        Scanner reader = new Scanner(System.in);
        System.out.println("How many players are playing today?");
        int n = reader.nextInt();
        for (int i = 0; i<=n-1; i++){
            System.out.println("What is player "+ (i+1) +" 's name?");
            player.add(reader.next());
        }

        for (String a : player){
            System.out.print(a + "'s hands :\n");
                farash f = new farash();
                f.gameLoop();
        }

        reader.close();
    }
}
