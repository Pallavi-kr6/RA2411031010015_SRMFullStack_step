package com.gdb.domain;

public class AccountRulesEngine {

    public static double getSavingsMinBalance(int tenure) {

        switch (tenure) {
            case 0:
                return 1000.0;

            case 2:
                return 2000.0;

            case 4:
                return 3000.0;

            case 6:
                return 5000.0;

            default:
                return 1000.0;
        }
    }

    public static double getSavingsInterestRate(int tenure) {

        switch (tenure) {
            case 0:
                return 3.0;

            case 2:
                return 3.5;

            case 4:
                return 4.0;

            case 6:
                return 4.5;

            default:
                return 3.0;
        }
    }
}