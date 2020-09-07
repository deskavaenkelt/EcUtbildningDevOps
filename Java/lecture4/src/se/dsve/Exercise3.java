package se.dsve;

public class Exercise3 {
    private final String aRandomString;

    public Exercise3(String aRandomString) {
        this.aRandomString = aRandomString;
    }

    public void getMiddleCharacter() {
        System.out.println("3. Write a Java method to display the middle character of a string.");
        int indexOfMiddleCharacter = aRandomString.length() / 2;

        String message = "The middle character in the string: ";
        char result = aRandomString.charAt(indexOfMiddleCharacter);
        System.out.println(message + result);
    }
}
