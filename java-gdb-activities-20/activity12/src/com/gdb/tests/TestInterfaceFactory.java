package com.gdb.tests;

import com.gdb.domain.*;
import com.gdb.exceptions.*;

public class TestInterfaceFactory {
    public static void main(String[] args) {
        System.out.println("=== Activity 12: Factory-Driven System Suite ===");

        // Step 1: Create accounts ONLY through AccountFactory
        IAccount savings = AccountFactory.createAccount(
                "SAVINGS", "SAV1001", "Rajesh Sharma",
                28, 5000.0, "ACTIVE", "1234"
        );

        IAccount current = AccountFactory.createAccount(
                "CURRENT", "CUR1001", "Priya Patel",
                34, 10000.0, "ACTIVE", "5678"
        );

        IAccount fixedDeposit = AccountFactory.createAccount(
                "FIXED_DEPOSIT", "FD1001", "Amit Kumar",
                45, 50000.0, "ACTIVE", "1111"
        );

        System.out.println("Accounts created successfully through Factory.");

        // Step 2: Deposits and withdrawals through IAccount
        savings.deposit(2000.0);
        System.out.println("Savings balance after deposit: "
                + savings.getBalance());

        current.deposit(5000.0);
        System.out.println("Current balance after deposit: "
                + current.getBalance());

        // Step 3: Savings minimum balance rule
        try {
            savings.withdraw(6500.0);
            System.out.println("Savings withdrawal successful.");
        } catch (Exception e) {
            System.out.println("Savings minimum balance rule enforced: "
                    + e.getMessage());
        }

        // Step 4: Current overdraft limit
        try {
            current.withdraw(20000.0);
            System.out.println("Current overdraft withdrawal successful.");
        } catch (Exception e) {
            System.out.println("Current overdraft limit enforced: "
                    + e.getMessage());
        }

        // Step 5: Fixed Deposit premature withdrawal
        try {
            fixedDeposit.withdraw(10000.0);
            System.out.println("Fixed Deposit withdrawal successful.");
        } catch (Exception e) {
            System.out.println("Fixed Deposit premature withdrawal rejected: "
                    + e.getMessage());
        }

        // Step 6: Invalid account type
        try {
            IAccount invalid = AccountFactory.createAccount(
                    "INVALID",
                    "INV1001",
                    "Test User",
                    30,
                    1000.0,
                    "ACTIVE",
                    "9999"
            );

            System.out.println("Invalid account created: "
                    + invalid.getAccountType());

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid account type rejected: "
                    + e.getMessage());
        }

        System.out.println("=== Complete Activity 12 test suite and run ===");
    }
}