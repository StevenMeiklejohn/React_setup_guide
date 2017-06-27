package example.codeclan.com.blackjack;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

//        System.out.println("Enter your player 1 name: ");
//        String name1 = System.console().readLine();
//        System.out.println();

//        System.out.println("Enter your player 2 name: ");
//        String name2 = System.console().readLine();
//        System.out.println();




        Player player1 = new Player("Steve", new Hand());
        Player player2 = new Player("Ally", new Hand());
        Dealer dealer = new Dealer("Dealer", new Hand());
        Player[] players = {player1, player2};
        Deck deck = new Deck(new ArrayList<Card>());
        deck.shuffle();
        Game game = new Game(players, deck, dealer);

        System.out.println("");
        System.out.println("=======");
        System.out.println("Shuffling Cards......");
        System.out.println("=======");

        System.out.println("");
        System.out.println("=======");
        System.out.println("Dealing.......");
        System.out.println("=======");

        game.dealCards();
        game.showHands();
        System.out.println("");
        System.out.println("=======");
        System.out.println("Dealing.......");
        System.out.println("=======");

        game.dealCards();
        game.showHands();
        System.out.println("");
        System.out.println("=======");


        dealer.ShowFirstCard();
        System.out.println("");
        System.out.println("=======");

        game.stickOrTwist(player1);
        game.stickOrTwist(player2);
        game.dealerPlay(dealer);



//        System.out.println("Dealing.......");
//        System.out.println("=======");


//        game.dealCards();
//
//        System.out.println("Player");




//
//        game.play();


    }
}


