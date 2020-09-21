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

    public String beingAttacked(String defenderName, String attackerName, int attackerWeaponDamage, String
            attackerWeaponName) {
        String message;
        if (userIsDead()) {
            message = "Character Already dead!".toUpperCase();
        } else {
            /* System.err.println("WILD " + attackerName + " APPEARS!"); */
            message =
                    attackerName + " STRIKES " + defenderName + " WITH A " + attackerWeaponName + ", IT DOES " + attackerWeaponDamage + " DAMAGE\n";
            hp = (hp - attackerWeaponDamage);
            if (userIsAlive()) {
                message += defenderName + " HAS " + hp + " REMAINING HEALTH!";
            } else {
                message += defenderName + " DIED!";
                hp = 0;
            }
        }
        return message;
    }

    private boolean userIsDead() {
        return hp <= 0;
    }

    private boolean userIsAlive() {
        return hp > 0;
    }

    public String drinkingHealingPotion() {
        int healingPotion = 20;
        hp = hp + healingPotion;
        if (hp >= 100) {
            hp = 100;
        }
        return characterName + " GAINED " + healingPotion + " HEALTH BY DRINKING A HEALING POTION\n"
                + characterName + " NOW HAS A HEALTH OF " + hp;
    }
}
