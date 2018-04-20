package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CardCreator {
    CardCreator() {}

    private String name;
    private int cost;
    private String description;
    private String flavorText;
    private int power;
    private int hp;
    private CreatureType type;
    private boolean isCreature;
    private boolean isSpell;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public CreatureType getType() {
        return type;
    }

    public void setType(CreatureType type) {
        this.type = type;
    }

    public boolean isCreature() {
        return isCreature;
    }

    public void setCreature(boolean creature) {
        isCreature = creature;
    }

    public boolean isSpell() {
        return isSpell;
    }

    public void setSpell(boolean spell) {
        isSpell = spell;
    }

    public Creature start() throws IOException {
        Creature blank = new Creature();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--CARD CREATOR--");
        System.out.println("Spell or creature?: ");
        String cardType = reader.readLine();

      if (1==1) {
            isCreature = true;
            isSpell = false;
            System.out.println("Name: ");
            name = reader.readLine();
            System.out.println("Cost: ");
            cost = Integer.parseInt(reader.readLine());
            System.out.println("Power: ");
            power = Integer.parseInt(reader.readLine());
            System.out.println("HP: ");
            hp = Integer.parseInt(reader.readLine());
            System.out.println("Type: ");
            String tempType = reader.readLine();
            tempType = tempType.toUpperCase();
            switch (tempType) {
                case "ZOMBIE":
                    type = CreatureType.ZOMBIE;
                    break;
                case "HUMAN":
                    type = CreatureType.HUMAN;
                    break;
                case "BEAST":
                    type = CreatureType.BEAST;
                    break;
                case "DEMON":
                    type = CreatureType.DEMON;
                    break;
                case "ELEMENTAL":
                    type = CreatureType.ELEMENTAL;
                    break;
                case "DRAGON":
                    type = CreatureType.DRAGON;
                    break;
                case "ETHEREAL":
                    type = CreatureType.ETHEREAL;
                    break;
                case "HERO":
                    type = CreatureType.HERO;
                    break;
                case "FAIRY":
                    type = CreatureType.FAIRY;
                    break;
                case "MERFOLK":
                    type = CreatureType.MERFOLK;
                    break;
            }
            System.out.println("Description: ");
            description = reader.readLine();
            System.out.println("Flavor Text: ");
            flavorText = reader.readLine();

            Creature newCreature = new Creature(name, cost, description, flavorText, power, hp, type);
            return newCreature;

        }
        return blank;
    }
}
