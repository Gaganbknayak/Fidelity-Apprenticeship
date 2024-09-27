package Question10;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g1 = new Game();

        System.out.println("Enter the game: ");
        g1.setName(sc.next());
        System.out.println("Enter Maximum number of players: ");
        g1.setMaxNoPlayers(sc.nextInt());

        GameWithTL g2 = new GameWithTL();
        System.out.println("Enter the game: ");
        g2.setName(sc.next());
        System.out.println("Enter Maximum number of players: ");
        g2.setMaxNoPlayers(sc.nextInt());
        System.out.println("Enter the timelimit of the game: ");
        g2.setTimelimit(sc.nextInt());

        System.out.println(g1.toString());
        System.out.println(g2.toString());




    }
}
