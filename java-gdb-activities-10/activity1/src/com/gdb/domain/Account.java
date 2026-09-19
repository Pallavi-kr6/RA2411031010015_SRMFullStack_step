// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.gdb.domain;

public class Account {
   private String accountNumber;
   private String name;
   private int age;
   private double balance;
   private String accountType;
   private String status;

   public Account(String var1, String var2, int var3, double var4, String var6, String var7) {
      this.accountNumber = var1;
      this.name = var2;
      this.age = var3;
      this.balance = var4;
      this.accountType = var6;
      this.status = var7;
   }

   public boolean deposit(double var1) {
      if (var1 > (double)0.0F) {
         this.balance += var1;
         return true;
      } else {
         return false;
      }
   }

   public boolean withdraw(double var1) {
      if (var1 > (double)0.0F && var1 <= this.balance) {
         this.balance -= var1;
         return true;
      } else {
         return false;
      }
   }

   public void displayAccountInfo() {
      System.out.println("Account Number: " + this.accountNumber);
      System.out.println("Name: " + this.name);
      System.out.println("Age: " + this.age);
      System.out.println("Balance: Rs " + this.balance);
      System.out.println("Account Type: " + this.accountType);
      System.out.println("Status: " + this.status);
   }

   public String getAccountNumber() {
      return this.accountNumber;
   }

   public void setAccountNumber(String var1) {
      this.accountNumber = var1;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public int getAge() {
      return this.age;
   }

   public void setAge(int var1) {
      this.age = var1;
   }

   public double getBalance() {
      return this.balance;
   }

   public void setBalance(double var1) {
      this.balance = var1;
   }

   public String getAccountType() {
      return this.accountType;
   }

   public void setAccountType(String var1) {
      this.accountType = var1;
   }

   public String getStatus() {
      return this.status;
   }

   public void setStatus(String var1) {
      this.status = var1;
   }
}
