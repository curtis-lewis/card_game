package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Player player = new Player();
        CardCreator cardCreator = new CardCreator();

        Creature cardA = cardCreator.start();
        Creature cardB = cardCreator.start();

        cardA.display();
        cardB.display();

        player.attack(cardA, cardB);

    }
}
