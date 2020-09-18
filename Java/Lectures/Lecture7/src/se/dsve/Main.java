package se.dsve;

import java.util.ArrayList;

public class Main {

    static String[] characters = {"Vader", "Yoda", "Luke Skywalker", "Palpatine"};
    static int[] randomNumbers = new int[4];
    static ArrayList<String> programmingLanguage = new ArrayList<>();

    public static void main(String[] args) {
//        morningLecture();
        afternoonLecture();
    }

    static void morningLecture() {
        System.out.println(characters[0]);

        randomNumbers[0] = 1;
        randomNumbers[1] = 2;
        randomNumbers[2] = 3;
        randomNumbers[3] = 4;

        System.out.println(randomNumbers[2]);

        programmingLanguage.add("JavaScript");
        programmingLanguage.add("Java");
        programmingLanguage.add("Python");
        programmingLanguage.add("Haskel");
        programmingLanguage.add("C");

        System.out.println(programmingLanguage);
        System.out.println(programmingLanguage.get(2));

        programmingLanguage.remove(programmingLanguage.size() - 1);
        System.out.println(programmingLanguage);

        programmingLanguage.set(0, "HTML");
        System.out.println(programmingLanguage);
    }

    private static void afternoonLecture() {

        String textToCompare = "monday";

        switch (textToCompare) {
            case "monday":
                System.out.println("Today is monday");
                break;
            case "tuesday":
                System.out.println("Today is tuesday");
                break;
            default:
                System.out.println("Not a valid day");
                break;
        }
    }

    private static void searchForSuperhero(String searchFor) {
        switch (searchFor) {
            case "Hercules":
            case "Vader":
                foundHero(searchFor);
                break;
            case "Yoda":
                System.out.println("Found Yoda you did, young padwan");
                break;
            default:
                System.out.println("Joker will haunt you");
                break;
        }
    }

    private static void foundHero(String searchFor) {
        String text = "You found ";
        System.out.println(text + searchFor);
    }
}
