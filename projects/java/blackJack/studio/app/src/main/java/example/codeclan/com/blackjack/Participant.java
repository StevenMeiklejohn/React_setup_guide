package example.codeclan.com.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 25/06/2017.
 */

public abstract class Participant {

    private String name;
    private Hand hand;

    public Participant(String name, Hand hand){
        this.name = name;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void addCardToHand(Card card){
        hand.addCard(card);
    }

    public int getHandValue(){
        return hand.getTotalValue();
    }

    public Hand getHand(){
        return this.hand;
    }

    public void showHand(){
        ArrayList<Card> cards = this.getHand().getCards();
        for(Card card : cards){
            System.out.println(card.returnFormattedCard());
        }
    }
}
