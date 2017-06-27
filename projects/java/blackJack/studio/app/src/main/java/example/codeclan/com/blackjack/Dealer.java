package example.codeclan.com.blackjack;

import static android.media.CamcorderProfile.get;

/**
 * Created by user on 25/06/2017.
 */

public class Dealer extends Participant{



        public Dealer(String name, Hand hand){
            super(name, hand);
        }


        public void ShowFirstCard(){
            Card card = getHand().showFirst();
            System.out.println("Dealer shows first card...");
            System.out.println(card.returnFormattedCard());
        }
}
