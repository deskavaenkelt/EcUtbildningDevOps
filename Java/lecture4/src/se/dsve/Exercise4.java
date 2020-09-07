package se.dsve;

public class Exercise4 {
    private final String aRandomString;

    public Exercise4(String aRandomString) {
        this.aRandomString = aRandomString;
    }

    public void getVowels() {
        System.out.println("4. Write a Java method to count all vowels in a string.");
        int countedVowels = 0;

        for (int i = 0; i < aRandomString.length(); i++) {
            if (
                    'a' == aRandomString.charAt(i) ||
                    'o' == aRandomString.charAt(i) ||
                    'u' == aRandomString.charAt(i) ||
                    'å' == aRandomString.charAt(i) ||
                    'e' == aRandomString.charAt(i) ||
                    'i' == aRandomString.charAt(i) ||
                    'y' == aRandomString.charAt(i) ||
                    'ä' == aRandomString.charAt(i) ||
                    'ö' == aRandomString.charAt(i)) {
                countedVowels++;
            }
        }

        String message = "Number of  Vowels in the string: ";
        System.out.println(message + countedVowels);
    }
}
