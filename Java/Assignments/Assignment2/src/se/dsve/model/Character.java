package se.dsve.model;

/**
 * __
 * /\ \
 * \_\ \    ____  __  __     __
 * /'_` \  /',__\/\ \/\ \  /'__`\
 * /\ \L\ \/\__, `\ \ \_/ |/\  __/
 * \ \___,_\/\____/\ \___/ \ \____\
 * \/__,_ /\/___/  \/__/   \/____/
 * Assignment2
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since {2020-09-16}.
 * https://github.com/deskavaenkelt/
 */

public class Character {
    String characterName;
    int equippedWeapon;
    int hp;

    public Character(String characterName, int equippedWeapon, int hp) {
        this.characterName = characterName;
        this.equippedWeapon = equippedWeapon;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Character {" +
                "characterName='" + characterName + '\'' +
                ", equippedWeapon='" + equippedWeapon + '\'' +
                ", hp=" + hp +
                '}';
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(int equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public int getHp() {
        return hp;
    }

    public void beingAttacked (String defenderName, String attackerName,int attackerWeaponDamage, String
            attackerWeaponName){
        if (userIsDead()) {
            System.out.println("YOU CANNOT ATTACK");
        } else {
            /* System.err.println("WILD " + attackerName + " APPEARS!"); */
            System.out.println(attackerName + " STRIKES " + defenderName + " WITH A " + attackerWeaponName + " IT DOES " + attackerWeaponDamage + " DAMAGE");
            hp = (hp - attackerWeaponDamage);
            checkIfCharacterIsDeadOrAlive(defenderName);
        }
        System.out.println("-------------------------------------------");
    }

    private boolean userIsDead() {
        return hp <= 0;
    }

    private void checkIfCharacterIsDeadOrAlive(String defenderName) {
        if (userIsAlive()) {
            System.out.println(defenderName + " HAS " + hp + " REMAINING HEALTH! ");
        } else {
            System.out.println(defenderName + " DIED!");
        }
    }

    private boolean userIsAlive() {
        return hp > 0;
    }

    public void drinkingHealingPotion () {
        int healingPotion = 20;
        hp = hp + healingPotion;
        if (hp >= 100) {
            hp = 100;
        }
        System.out.println(characterName + " GAINED " + healingPotion + " HEALTH BY DRINKING A HEALING POTION");
        System.out.println(characterName + " NOW HAS A HEALTH OF " + hp);
        System.out.println("-------------------------------------------");
    }
}
