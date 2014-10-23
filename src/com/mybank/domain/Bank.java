/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.domain;

/**
 *
 * @author tassos
 */
public class Bank {
    private static Customer[] customers = new Customer[5];;  //instance variables.
    private static int numberOfCustomers = 0;
    
    private Bank(){  //Constructor 
    
    }
    
    public static void addCustomer(String firstName, String lastName){    //Method to add customers.
        int i =  numberOfCustomers++;
        customers[i] = new Customer(firstName,lastName);   
       
    }
    
    public static int getNumOfCustomers(){   //Method to return the number of customers
        return numberOfCustomers;
    }
    
    public static Customer getCustomer(int customer_index){ //Method to return the customer by the index of the array that we pass as an argument.
        return customers[customer_index];
    }
}
