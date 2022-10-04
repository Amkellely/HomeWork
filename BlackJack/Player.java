package BlackJack;

import java.util.Scanner;

public class Player extends Hand {

    @Override
    public void play(Deck deck){
        Scanner in = new Scanner(System.in);
        char answer = 'y';
        //Взять 2 карты
        takeOneCard(deck);
        takeOneCard(deck);
        while (calcScore()<21 && answer == 'y'){
            System.out.println("Your hand: " + hand + "Your score: " + calcScore());
            System.out.println("Do you want another card? (type y for yes, n for no");
            answer = in.nextLine().charAt(0);
            if(answer == 'y'){
                takeOneCard(deck);
                }
             }
        System.out.println("Your hand: " + hand + "Your score: " + calcScore());
        }
    }

