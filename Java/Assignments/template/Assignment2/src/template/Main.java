package template;

public class Main {

    // Global variabels
    static int hammerMaximumDamage = 50;
    static int hammerMinimumDamage = 10;
    static int randomHammerDamage = (int)  (Math.random() * ((hammerMaximumDamage - hammerMinimumDamage) + 1));
    static int hammer = randomHammerDamage + hammerMinimumDamage;

    static int magicWandMaximumDamage = 100;
    static int magicWandMinimumDamage = 0;
    static int randomWandDamage =(int) (Math.random() * (magicWandMaximumDamage - magicWandMinimumDamage));
    static int magicWand = randomWandDamage;

    // Make characters global
    private static Game goodGuy;
    private static Game evilGuy;

    public static void main(String[] args) {
        goodGuy = new Game("The Beast", hammer, 100, "Hammer");
        evilGuy = new Game("Ja'far", magicWand, 80, "Magic Wand");

        goodGuy.beingAttacked(goodGuy.characterName, evilGuy.characterName, evilGuy.weaponDamage, evilGuy.weaponName);
        evilGuy.beingAttacked(evilGuy.characterName, goodGuy.characterName, goodGuy.weaponDamage, goodGuy.weaponName);
        goodGuy.drinkingHealingPotion();
        evilGuy.drinkingHealingPotion();

        goodGuySearchForWeapon();
        goodGuyEquipWeapon();

    }

    private static void goodGuySearchForWeapon() {
        // TODO: Search för weapon name
        goodGuy.searchWeapon("");
    }

    private static void goodGuyEquipWeapon() {
        // TODO: call equipWeapon() function in Game class
    }
}
