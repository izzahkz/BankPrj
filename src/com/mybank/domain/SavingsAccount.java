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
public class SavingsAccount extends Account {
    private double interestRate;
    
    //Constructor
    public SavingsAccount(double initBalance, double interestRate){
        super(initBalance);
        this.interestRate = interestRate;
    }
}
