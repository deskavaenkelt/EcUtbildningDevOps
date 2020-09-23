package se.dsve;

public class Exercise1 {
    private final double[] numbers;

    public Exercise1(double[] numbers) {
        this.numbers = numbers;
    }

    public void returnLowestNumber() {
        System.out.println("1. Write a Java method to find the smallest number among three numbers.");
        double lowestNumberIs = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowestNumberIs) {
                lowestNumberIs = numbers[i];
            }
        }
        String message = "The smallest value is ";
        System.out.println(message + lowestNumberIs);
    }
}
