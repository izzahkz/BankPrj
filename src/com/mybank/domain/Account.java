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


public class Account {        
    protected double balance;
    
    /** Creates a new instance of Account
     * @param initBalance */
    protected Account(double initBalance) {    // Constructor
        balance = initBalance;
    }
    
    //Methods.
    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amt) {
        balance = balance + amt;
        return true;
    }
    
    public boolean withdraw(double amt) {
        boolean result = false;
        if (amt <= balance) {
            balance = balance - amt;
            result = true;
        }
        return result;
    }    
}
