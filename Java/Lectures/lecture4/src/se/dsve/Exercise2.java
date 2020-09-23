package se.dsve;

public class Exercise2 {
    private final double[] numbers;

    public Exercise2(double[] numbers) {
        this.numbers = numbers;
    }

    public void average() {
        System.out.println("2. Write a Java method to compute the average of three numbers.");
        double toatlSum = 0;
        for (double number : numbers) {
            toatlSum += number;
        }
        double average = toatlSum / numbers.length;
        String message = "The average value is ";
        System.out.println(message + average);
    }
}
