package se.dsve;

/**
 * __
 * /\ \
 * \_\ \    ____  __  __     __
 * /'_` \  /',__\/\ \/\ \  /'__`\
 * /\ \L\ \/\__, `\ \ \_/ |/\  __/
 * \ \___,_\/\____/\ \___/ \ \____\
 * \/__,_ /\/___/  \/__/   \/____/
 * lecture6
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since {2020-09-14}.
 * https://github.com/deskavaenkelt/
 */

public class Game {

    private final String characterName;
    private final String weaponName;
    private final int weaponDamage;
    private int hp;

    public Game(String characterName, String weaponName, int weaponDamage, int hp) {
        this.characterName = characterName;
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
        this.hp = hp;
    }

    public void beingAttacked(String attackerName, String defenderName, int attackDamage, String weaponName) {
        if (this.hp <= 0) {
            System.err.println(defenderName + " HAS BEEN EXECUTED");
        } else {
            System.err.println("Wild " + attackerName + " APPEARS!");
            System.out.println(attackerName + " is attacking " + defenderName + " with " + weaponName);
            System.out.println("But " + attackerName + " is drunk, so he only inflict 10% damage");
            System.out.println("Damage taken is: " + (attackDamage * 0.1));
            this.hp -= attackDamage * 0.1;
            System.out.println(defenderName + " has " + this.hp + " remaining health!");
        }

    }

    public String getCharacterName() {
        return characterName;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public int getHp() {
        return hp;
    }

}
