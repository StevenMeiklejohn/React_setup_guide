package example.codeclan.com.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

import static android.R.id.input;
import static android.R.id.pasteAsPlainText;

/**
 * Created by user on 22/06/2017.
 */

public class Game {

    private Player[] players;
    private ArrayList<Participant> notOut;
    private Dealer dealer;
    private Deck deck;
    private Ui ui;
    private Card card;
    private Scanner sc;


    public Game(Player[] players, Deck deck, Dealer dealer, Ui ui) {
        this.players = players;
        this.deck = deck;
        this.dealer = dealer;
        this.ui = ui;
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
        ui.dealCard(participant, card);
        stickOrTwist(participant);
    }

    public void showHands() {
        for (Player player : players) {
            ui.showHands(player);
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
        ui.preShowHand(participant);
        participant.getHand().showHand();
        ui.stickOrTwist(participant);
        while (active) {
        String selection = sc.nextLine();
           switch(selection){
                case "t":
                    dealCard(participant);
               case "s":
                   return;
                default :
                    ui.separator();
            }
        }
    }



    public Boolean checkBust(Participant participant){
        if(participant.getHandValue() > 21) {
            ui.checkBust(participant);
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean checkBlackJack(Participant participant){
        if(participant.getHandValue() == 21) {
            ui.checkBlackJack(participant);
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
            }
        }
    }

}




