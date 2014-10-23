package com.mybank.test;


import com.mybank.domain.Account;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tassos
 */
public class TestAccount {
    public static void main(String []args){
    Account acct = new Account(100.0);      //Instanciate Account object from classe's constructor.
    
    acct.deposit(47);                    //Use class method deposit
    acct.withdraw(150);                   //Use class method withdraw
    
    double showBalance = acct.getBalance();   //Use class method getBalance
        System.out.println(showBalance);    //Display the variable.
    }
    
}
