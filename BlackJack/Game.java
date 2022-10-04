package BlackJack;

import java.util.Scanner;

public class Game {
    public Game(){
        deck = new Deck();
        player = new Player();
        dealer = new Dialer();
        playerWin = 0;
        dealerWin = 0;
        draws = 0;
    }
    public void play()throws InterruptedException{
        Scanner in = new Scanner(System.in);
        char answer = 'y';
        while (answer == 'y') {
            player.play(deck);
            //проверка как сыграл player
            //if (player.endGame()) continue;
            if (player.calcScore() == 21) {
                System.out.println("Player wins!");
                playerWin++;
                continue;
            } else if (player.calcScore() > 21) {
                System.out.println("Player loses!! ");
                dealerWin++;
                continue;
            }
            dealer.play(deck);
            //проверка как сыграет Дилер
            //dealer.endGame(player);
            if (dealer.calcScore() == 21) {
                System.out.println("Dialer wins!");
            } else if (dealer.calcScore() > 21) {
                System.out.println("Dialer loses!! ");
                playerWin++;
            } else if (player.calcScore() > dealer.calcScore()) {
                System.out.println("Player wins!");
                playerWin++;
            } else if (player.calcScore() < dealer.calcScore()) {
                System.out.println("Dialer wins!");
                dealerWin++;
            } else if (player.calcScore() == dealer.calcScore()) {
                System.out.println("Draw!");
                draws++;
            }
            System.out.println("Player won: " + playerWin);
            System.out.println("Dialer won: " + dealerWin);
            System.out.println("Draw: " + draws);
            System.out.println("Do you want another card? (type y for yes, n for no");
            answer = in.nextLine().charAt(0);
        }
    }
    private Deck deck;
    private Player player;
    private Dialer dealer;
    private int playerWin;
    private int dealerWin;
    private int draws;
}
