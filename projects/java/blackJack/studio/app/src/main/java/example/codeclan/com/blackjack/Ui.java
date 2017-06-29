package example.codeclan.com.blackjack;

/**
 * Created by user on 29/06/2017.
 */

public class Ui {

    public Ui(){

    }

    public void dealCard(Participant participant, Card card){
        System.out.println("");
        System.out.println("=======");
        System.out.println(participant.getName() + " receives " + card.returnFormattedCard());
        System.out.println("=======");
    }

    public void showHands(Player player){
        System.out.println("");
        System.out.println("=======");
        System.out.println(player.getName() + " has ");
        System.out.println("=======");
    }

    public void preShowHand(Participant participant){
        System.out.println(participant.getName() + " has");
    }

    public void stickOrTwist(Participant participant){
        System.out.println("Total value is " + participant.getHandValue());
        System.out.println(participant.getName() + ", would you like to stick or twist?");
        System.out.println("=======");
        System.out.println("Press s to stick or t to twist");
    }

    public void separator(){
        System.out.println("=======");
    }

    public void checkBust(Participant participant){
        System.out.println(participant.getName() + " is bust!");
        System.out.println("=============");
    }

    public void checkBlackJack(Participant participant){
        System.out.println(participant.getName() + "has Blackjack!");
        System.out.println("=============");
    }
}
