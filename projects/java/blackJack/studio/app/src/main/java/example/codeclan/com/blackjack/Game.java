package example.codeclan.com.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

import static android.R.id.input;

/**
 * Created by user on 22/06/2017.
 */

public class Game {

    private Player[] players;
    private ArrayList<Participant> notOut;
    private Dealer dealer;
    private Deck deck;
    private Card card;
    private Scanner sc;


    public Game(Player[] players, Deck deck, Dealer dealer) {
        this.players = players;
        this.deck = deck;
        this.dealer = dealer;
        sc = new Scanner(System.in);
    }

    public void dealCards() {
        for (Player player : players) {
            deck.dealCard(player);
        }
        deck.dealCard(this.dealer);
    }

    public void dealCard(Participant participant) {
        Card card = deck.dealCard(participant);
        System.out.println("");
        System.out.println("=======");
        System.out.println(participant.getName() + " receives " + card.returnFormattedCard());
        System.out.println("=======");
        stickOrTwist(participant);
    }

    public void showHands() {
        for (Player player : players) {
            System.out.println("");
            System.out.println("=======");
            System.out.println(player.getName() + " has ");
            System.out.println("=======");
            player.getHand().showHand();
         }
    }

    public void dealerPlay(Participant participant){
        Boolean active = true;
        if(checkBust(participant)){
            return;
        }
        if(checkBlackJack(participant)){
            notOut.add(participant);
            return;
        }
        while(active) {
            if(participant.getHandValue() < 16) {
                dealCard(participant);
            }
            else{
                notOut.add(participant);
            }
        }
    }

    public void stickOrTwist(Participant participant) {
        Boolean active = true;
        if(checkBust(participant)){
            return;
        }
        if(checkBlackJack(participant)){
            notOut.add(participant);
            return;
        }
        System.out.println(participant.getName() + " has");
        participant.getHand().showHand();
        System.out.println("Total value is " + participant.getHandValue());
        System.out.println(participant.getName() + ", would you like to stick or twist?");
        System.out.println("=======");
        System.out.println("Press s to stick or t to twist");
        while (active) {
        String selection = sc.nextLine();
           switch(selection){
                case "t":
                    dealCard(participant);
               case "s":
                   return;
                default :
                    System.out.println("=============");
            }
        }
    }



    public Boolean checkBust(Participant participant){
        if(participant.getHandValue() > 21) {
            System.out.println(participant.getName() + " is bust!");
            System.out.println("=============");
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean checkBlackJack(Participant participant){
        if(participant.getHandValue() == 21) {
            System.out.println(participant.getName() + "has Blackjack!");
            System.out.println("=============");
            return true;
        }
        else{
            return false;
        }
    }

    public void checkWin(){
        int winning_score = 0;
        for(Participant participant: players){
            if(checkBust(participant) == false){
                w
            }
        }
    }

}




