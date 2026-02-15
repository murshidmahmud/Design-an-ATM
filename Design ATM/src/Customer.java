/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

//---------------------------Customer---------------------------------
public class Customer {
    private String name,email,phone;
    private Enumeration.Address address;
    private Enumeration.customerStatus Customerstatus;
    
    public Customer(String name, String email, String phone, Enumeration.Address address,Enumeration.customerStatus Customerstatus){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.Customerstatus = Customerstatus;
    }
    
    public void makeTransaction(Transaction transaction){
        transaction.makeTransaction();
    }
    
    public void display_customer(){
        System.out.println("Name : "+name);
        System.out.println("Phone: "+phone);
        System.out.println();
    }
}

//-------------------------------------card------------------------------
class Card{
    private String cardNumber;
    private String customerName;
    private String date;
    private int pin;
    
    public Card(String cardNumber, String customerName, String date, int pin){
        this.cardNumber = cardNumber;
        this.customerName= customerName;
        this.date = date;
        this.pin = pin;
    }
}

//------------------------------------Account-------------------------------
class Account{
    private int accountNumber;
    private double totalBalance;
    private double availableBalance;
    
    public Account(int accountNumber, double totalBalance, double availableBalance){
        this.accountNumber = accountNumber;   
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
    }

    Account(int account) {
        
    }
    
    public void deposit(double amount){
        totalBalance +=amount;
    }
    
    public void withdraw(double amountwithdraw){
        totalBalance -=amountwithdraw;
    }
    
    public double getBalance(){
        return totalBalance;
    }
}

//---------------------------------------Account Extends------------------------
class SavingAccount extends Account{
    private double withdraw;
    
    public SavingAccount(int accountNumber, double totalBalance, double availableBalance, double withdraw) {
        super(accountNumber, totalBalance, availableBalance);
        this.withdraw = withdraw;
    }
    
}

class CheckingAccount extends Account{
    private String debitcard;
    
    public CheckingAccount(int accountNumber, double totlaBalance, double availableBalance, String debitcard) {
        super(accountNumber, totlaBalance, availableBalance);
        this.debitcard = debitcard;
    }
    
}