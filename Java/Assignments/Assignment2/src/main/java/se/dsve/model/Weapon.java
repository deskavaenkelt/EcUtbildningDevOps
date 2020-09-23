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

public class Weapon {
    String weaponName;
    int weaponDamage;
    int weaponWear;

    public Weapon(String weaponName, int weaponDamage, int weaponWear) {
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
        this.weaponWear = weaponWear;
    }

    @Override
    public String toString() {
        return "Weapon {" +
                "weaponName='" + weaponName + '\'' +
                ", weaponDamage='" + weaponDamage + '\'' +
                ", weaponWear=" + weaponWear +
                '}';
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public int getWeaponWear() {
        return weaponWear;
    }

    public void setWeaponWear(int weaponWear) {
        this.weaponWear -= weaponWear;
    }
}
