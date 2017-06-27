package example.codeclan.com.blackjack;

/**
 * Created by user on 22/06/2017.
 */

public class Card {

    final int number;
    final Suit suit;

    public Card(int number, Suit suit){
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public int getNumericalValue(){
        if(this.number >= 10){
            return 10;
        }
        else{
            return this.number;
        }
    }

    public String getValue(){
        if(this.number == 1){
            return String.valueOf("Ace");
        }
        if(this.number == 10){
            return String.valueOf("Jack");
        }
        if(this.number == 11){
            return String.valueOf("Queen");
        }
        if(this.number == 12){
            return String.valueOf("King");
        }
        if(this.number == 13){
            return String.valueOf("Ace");
        }
        else{
            return String.valueOf(this.number);
        }
    }

    public Suit getSuit() {
        return this.suit;
    }

    public String returnFormattedCard(){
        return getValue() + " of " + getSuit();
    }


}
