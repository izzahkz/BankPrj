/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.domain;

/**
 *
 * @author Tassos
 */
public class CheckingAccount extends Account {
    private double overdraftAmount; //The amount we withdraw more than the balance.
    
    //constructor
    public CheckingAccount(double initBalance,double overdraftAmount){
        super(initBalance); //we call the suprclasse's Account initial balance constructor.
        this.overdraftAmount = overdraftAmount;
    }
    //one argument constructor
    public CheckingAccount(double initBalance){
        this(initBalance, 0.0);// Call the above constructor and set overdraftAmount to 0.
    }
    
    //override withdraw method
    //Same as savings account but we can withdraw more money than we have.
    public void withdraw(double amount) throws OverdraftException{
        if(balance < amount){
            double overdraftNeeded = amount - balance;
            if(overdraftAmount < overdraftNeeded){
                throw new OverdraftException("Insufficient funds for overdraft\n" +
"protection", overdraftNeeded);
            }else{
                balance = 0.0;
                overdraftAmount-= overdraftNeeded;
            }
    }else{
            balance-= amount;
        }
    
    }
}
