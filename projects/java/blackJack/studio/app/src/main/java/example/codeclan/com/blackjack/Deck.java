package example.codeclan.com.blackjack;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 22/06/2017.
 */

public class Deck {

    private ArrayList<Card> cards;

    public Deck(ArrayList<Card> cards){
        this.cards = cards;
        populate();
    }

    public void populate(){
        for(Suit suit: Suit.values()){
            for(int i=1; i < 14; i++){
                Card card = new Card(i, suit);
                cards.add(card);
            }
        }
    }



    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card dealCard(Participant participant){
        Card card = cards.get(0);
        participant.addCardToHand(card);
        cards.remove(0);
        return card;
    }



}
