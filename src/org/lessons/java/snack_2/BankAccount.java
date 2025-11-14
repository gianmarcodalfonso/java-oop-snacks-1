package org.lessons.java.snack_2;

public class BankAccount {
  private int accountId;
  private float balance;

  public BankAccount(int accountId){
    this.accountId = accountId;
    this.balance = 0;
  }

  public void deposit(float depositedAmount){
    this.balance = this.balance + depositedAmount;
  }
  
  public void withdraw(float withdrawededAmount){
    this.balance = this.balance - withdrawededAmount;
  }

  public String getBalance(){
    return "Saldo attuale: " + this.balance;
  }


}
