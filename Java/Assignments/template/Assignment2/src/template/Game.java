package template;

public class Game {
    String characterName;
    String weaponName;
    int weaponDamage;
    int hp;

    public Game(String charName, int wDamage, int health, String wName) {
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

    // TODO: input weapon name to search for
    public void searchWeapon(String weaponName) {
        switch(weaponName) {
            // TODO: enter som case's to compare with, one must be "Excalibur" print out what weapon is found
        }
    }

    // TODO: input new weapon name and new damage
    public void equipWeapon() {
        // TODO: assign new weapon name

        // TODO: assign new weapon damage

    }

    public void drinkingHealingPotion() {
        int healingPotion = 20;
        hp = hp + healingPotion;
        System.out.println(characterName + " GAINED " + healingPotion + " HEALTH BY DRINKING A HEALING POTION");
        System.out.println(characterName + " NOW HAS A HEALTH OF " + hp);
    }
}
