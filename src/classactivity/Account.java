/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classactivity;

/**
 *
 * @author David
 */
public class Account {
    private String accountNumber;
    private double balance;
    
    public Account(String accountNumber, double balance) 
    {
        if (accountNumber.isBlank() || accountNumber.isEmpty()) {
            System.out.println("Account number cannot be blank or empty");
            return;
        }
        
        if (balance < 0) {
            System.out.println("Account balance cannot be negative");
            return;
        }
        
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String GetAccountNumber() 
    {
        return this.accountNumber;
    }
    
    public double GetAccountBalance() 
    {
        return this.balance;
    }
}
