package com.gla.exception_assignment.q10;

public class MainApp {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        try {
            acc.withdraw(6000);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}