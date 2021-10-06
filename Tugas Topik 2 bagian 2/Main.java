package com.company;

public class Main {

    public static void main(String[] args) {
        GameCharacter raiden = new GameCharacter("Raiden", 10, 20);
        GameCharacter subzero = new GameCharacter("Sub-zero", 5, 25);
        raiden.setLifePoint(100);
        subzero.setLifePoint(100);

        System.out.println("name" + raiden.getName());
        System.out.println("name" + raiden.getLifePoint());
        System.out.println("name" + subzero.getName());
        System.out.println("name" + subzero.getLifePoint());

        raiden.kick(subzero);
        subzero.kick(raiden);

        for (int i = 0; i < 3; i++) {
            subzero.hit(raiden);
        }
        for (int i = 0; i < 4; i++) {
            raiden.kick(subzero);
        }
        System.out.println("name" + raiden.getLifePoint());
        System.out.println("name" + subzero.getLifePoint());

        if (raiden.getLifePoint() > subzero.getLifePoint()) {
            System.out.println(raiden.getName() + "winner");
        } else {
            System.out.println(subzero.getName() + "winner");


        }
    }
}
