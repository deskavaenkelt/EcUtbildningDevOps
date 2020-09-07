package se.dsve;

public class Main {

    public static void main(String[] args) {
//        aChair();
//        anAccount();
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
        exercise8();
    }

    private static void aChair() {
        Chair officeChair = new Chair(false, "leather");
        System.out.println(officeChair.getMaterial());
        System.out.println(officeChair.getMaterial());

        officeChair.setHaveWheels(true);
        officeChair.setMaterial("cotton");

        System.out.println(officeChair.getMaterial());
        System.out.println(officeChair.getMaterial());
    }

    private static void anAccount() {
        BankAccount markusBankAccount = new BankAccount(12345.67);
        System.out.println(markusBankAccount.getBalance());
        markusBankAccount.setBalance(-500);
        System.out.println(markusBankAccount.getBalance());

    }

    private static void exercise1() {
        double[] numbers = new double[]{5, 4, 8};
        Exercise1 exercise1 = new Exercise1(numbers);
        exercise1.returnLowestNumber();
    }

    private static void exercise2() {
        double[] numbers = new double[]{5, 4, 8};
        Exercise2 exercise2 = new Exercise2(numbers);
        exercise2.average();
    }

    private static void exercise3() {
        String myString = "numbers";
        Exercise3 exercise3 = new Exercise3(myString);
        exercise3.getMiddleCharacter();
    }

    private static void exercise4() {
        String myString = "w3resource";
        Exercise4 exercise4 = new Exercise4(myString);
        exercise4.getVowels();
    }

    private static void exercise8() {
        double investment = 1000;
        double interestRate = 10;
        int investmentYears= 5;
        Exercise8 exercise8 = new Exercise8(investment, interestRate, investmentYears);
        exercise8.printInterest();
    }
}
