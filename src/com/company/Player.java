package com.company;

import java.util.List;

public class Player {
    Player() {}

    Player(String name, int hp, List<Card> hand, List<Card> deck) {
        this.name = name;
        this.hp = hp;
        this.hand = hand;
        this.deck = deck;
    }

    private String name;
    private int hp;
    private List<Card> hand;
    private List<Card> deck;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    public void attack(Creature a, Creature b) {
        System.out.println("#############################");
        System.out.println(a.getName() + " attacks " + b.getName() + ".");
        System.out.println("#############################");
        a.setHp(a.getHp() - b.getPower());
        b.setHp(b.getHp() - a.getPower());
        if (a.getHp() <= 0) {
            a.setHp(0);
            System.out.println(a.getName() + " has been slain.");
            System.out.println("#############################");
            b.display();
        }
        else if (b.getHp() <= 0) {
            b.setHp(0);
            System.out.println(b.getName() + " has been slain.");
            System.out.println("#############################");
            a.display();
        }
        else {
            System.out.println("No creatures have been slain.");
            System.out.println("#############################");
            a.display();
            b.display();
        }
    }
}
