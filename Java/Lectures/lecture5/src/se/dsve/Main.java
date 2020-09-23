package se.dsve;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Account> customers = new ArrayList<>();

    public static void main(String[] args) {
        createCustomers();

        printWithToString();

        useOfGetMethods();
        useOfSetMethods();

        useOfWithdrawAndDepositMethods();

        printWithToString();

        transferBetweenCustomers(2, 0, 600);
        printWithToString();
    }

    private static void useOfWithdrawAndDepositMethods() {
        System.out.println("withdraw 1234.56 from Bengt (index = 1)");
        customers.get(1).withdrawal(1234.56);
        System.out.println("Deposit 1234.56 to Carl (index = 2)");
        customers.get(2).deposit(1234.56);
        System.out.println();
    }

    private static void useOfSetMethods() {
        System.out.println("Change name (first + last) on a Adam: .setFirstName(Erik) & setLastName(Eriksson)");
        customers.get(0).setFirstName("Erik");
        customers.get(0).setLastName("Eriksson");
    }

    private static void useOfGetMethods() {
        System.out.println("Use of get-methods");
        System.out.println(customers.get(0).getFirstName());
        System.out.println(customers.get(1).getLastName());
        System.out.println(customers.get(2).getBalance());
        System.out.println();
    }

    private static void printWithToString() {
        System.out.println("Print all customers with .toString");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
        System.out.println();
    }

    private static void createCustomers() {
        Account adam = new Account("Adam", "Adamsson");
        customers.add(adam);
        customers.add(new Account("Bengt", "Bengtsson"));
        customers.add(new Account("Carl", "Carlsson"));
    }

    private static void transferBetweenCustomers(int fromId, int toId, double amount) {
        System.out.println("Transaction from customer id " + fromId + " to id " + toId + " with amount " + amount);
        customers.get(fromId).withdrawal(amount);
        customers.get(toId).deposit(amount);
        System.out.println();
    }
}
