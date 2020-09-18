# Assignment 2

Med hjälp av koden nedanför skall du skriva en metod som heter searchWeapo, denna metod ska ta in ett parameter argument som motsvarar vapnet man vill söka på.
I metoden skall du med hjälp av en Switch sats ta reda på vem som bär vilket vapen.

Om inget vapen hittas så skall ett default meddelande skrivas ut.

För betyget VG:
Skriv en metod som utrustar valfri karaktär med vapnet "Excalibur". Se till att anropa denna metod på karaktären.


# Template from teacher

`package com.company;

public class Main {

    String characterName;
    String weaponName;
    int weaponDamage;
    int hp;
    static int hammerMaximumDamage = 50;
    static int hammerMinimumDamage = 10;

    static int hammer = (int) (Math.random() * ((hammerMaximumDamage - hammerMinimumDamage) + 1)) + hammerMinimumDamage;
    static int magicWandMaximumDamage = 100;
    static int magicWandMinimumDamage = 0;
    static int magicWand = (int) (Math.random() * (magicWandMaximumDamage - magicWandMinimumDamage));

    public Main(String charName, int wDamage, int health, String wName) {
        characterName = charName;
        weaponName = wName;
        weaponDamage = wDamage;
        hp = health;
    }

    public void beingAttacked(String defenderName, String attackerName, int attackerWeaponDamage, String attackerWeaponName) {
        if (hp <= 0 || attackerWeaponName == "Excalibur") {
            System.err.println("YOU CANNOT ATTACK");
        } else {
            /* System.err.println("WILD " + attackerName + " APPEARS!"); */
            System.out.println(attackerName + " STRIKES " + defenderName + " WITH A " + attackerWeaponName + " IT DOES " + attackerWeaponDamage + " DAMAGE");
            hp = (hp - attackerWeaponDamage);
            System.out.println(defenderName + " HAS " + hp + " REMAINING HEALTH! ");
        }
    }

    public static void searchWeapon(String weaponName) {
        switch(weaponName) {
          //TODO
        }
    }

    public void drinkingHealingPotion() {
        int healingPotion = 20;
        hp = hp + healingPotion;
        System.out.println(characterName + " GAINED " + healingPotion + " HEALTH BY DRINKING A HEALING POTION");
        System.out.println(characterName + " NOW HAS A HEALTH OF " + hp);
    }



    public static void main(String[] args) {
        Main goodGuy = new Main("The Beast", hammer, 100, "Hammer");
        Main evilGuy = new Main("Ja'far", magicWand, 80, "Magic Wand");

        goodGuy.beingAttacked(goodGuy.characterName, evilGuy.characterName, evilGuy.weaponDamage, evilGuy.weaponName);
        evilGuy.beingAttacked(evilGuy.characterName, goodGuy.characterName, goodGuy.weaponDamage, goodGuy.weaponName );
        goodGuy.drinkingHealingPotion();
        evilGuy.drinkingHealingPotion();
    }
}`