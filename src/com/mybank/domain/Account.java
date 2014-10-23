package com.mybank.domain;

/*
 * Account.java
 *
 * Created on November 9, 2005, 12:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */


public  class Account {        
    protected double balance;
    
    /** Creates a new instance of Account
     * @param initBalance */
    public Account(double initBalance) {    // Constructor
        balance = initBalance;
    }
    
    //Methods.
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amt) {
        balance = balance + amt;
    }
    
    public void withdraw(double amt) throws OverdraftException {
        if (amt <= balance) {
            balance = balance - amt;
        }else{
            throw new OverdraftException("insufficient funds", amt - balance);
        }
       
    }    
}
