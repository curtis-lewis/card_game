package com.company;

public class Creature extends Card {

    Creature() {}

    Creature(String name, int cost, String description,
             String flavorText, int power, int hp, CreatureType type) {
        setName(name);
        setCost(cost);
        setDescription(description);
        setFlavorText(flavorText);
        this.power = power;
        this.hp = hp;
        this.type = type;
    }

    private int power;
    private int hp;
    private CreatureType type;

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

    public void display() {
        System.out.println("****************");
        System.out.println(" _____________");
        System.out.println("|C:" + getCost());
        System.out.println("|" + getName());
        System.out.println("|");
        System.out.println("|--------------");
        System.out.println("|P:" + power + "  HP:" + hp);
        System.out.println("|" + type);
        System.out.println("|-" + getDescription() + "-");
        System.out.println("|");
        System.out.println("|~~" + getFlavorText() + "~~");
        System.out.println("|______________");
        System.out.println("");
        System.out.println("****************");
    }
}
