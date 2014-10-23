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
public class Customer {
   private String firstName;
   private String lastName;
   private Account accounts[];  
   private int numberOfAccounts;
   
   //constructor
   public  Customer(String f, String l){
       firstName = f;
       lastName = l;
       accounts = new Account[10]; //At construction customer can have up to ten accounts.
       numberOfAccounts = 0;  //At construction customer has no account.
   }
   
   // Methods
   public String getFirstName(){
       return firstName;
   }
   
   public String getLastName(){
       return lastName;
   }
  
  
    public void addAccount(Account acct){//Account object as parameter.
        int i = numberOfAccounts++;   // Each time we addAccount..
        accounts[i] = acct;    //..we store it to the account array.
        
    }
    public int getNumOfAccounts(){
        return numberOfAccounts;
    }
    
    public Account getAccount(int accound_index){//returns the accound index that we pass.
        return accounts[accound_index];
    }
   
}
