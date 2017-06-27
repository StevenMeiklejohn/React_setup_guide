package example.codeclan.com.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 22/06/2017.
 */

public class Hand {

    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<Card>();
    }

    public void addCard(Card card){
        this.cards.add(card);
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }

    public int getTotalValue(){
        int count = 0;
        for(Card card : cards){
            count += card.getNumericalValue();
        }
        return count;
    }

    public void showHand(){
        for(Card card : cards){
            System.out.println(card.returnFormattedCard());
        }
    }

    public Card showFirst(){
        Card card = cards.get(0);
//        System.out.println(card.returnFormattedCard());
        return card;
    }
}
