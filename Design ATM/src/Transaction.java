/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

//-------------------------------Transaction-----------------------------
abstract class Transaction {
    protected int transactionid;
    protected Enumaration.transactionStatus status;
    protected Date creationDate;
    
    public Transaction(int transactionid, Enumaration.transactionStatus status, Date creationDate){
        this.transactionid = transactionid;
        this.status = status;
        this.creationDate = creationDate;
    }
    
    abstract void makeTransaction();
}

//----------------------------------------Transaction Extends------------------------
class BalanceInquiry extends Transaction{
    
    private double accountId;
    
    public BalanceInquiry(int transactionid, Enumaration.transactionStatus status, Date creationDate, double accountId){
        super(transactionid,status,creationDate);
        this.accountId = accountId;
    }
    
    @Override
    public void makeTransaction(){
        System.out.println("Your Balance is: "+accountId);
    }
}

class Deposit extends Transaction{
    
    private double amount;
    
    public Deposit(int transactionid, Enumaration.transactionStatus status, Date creationDate,double amount){
        super(transactionid,status,creationDate);
        this.amount = amount;
    }
    
    @Override
    public void makeTransaction(){
        System.out.println("Your total amount: " + amount);
    }
}

class Withdraw extends Transaction{
    private double amountwithdraw;
    
    public Withdraw(int transactionid, Enumaration.transactionStatus status, Date creationDate,double amountwithdraw){
        super(transactionid,status,creationDate);
        this.amountwithdraw = amountwithdraw;
    }
    
    @Override
    public void makeTransaction(){
        System.out.println("Withdraw amount: "+amountwithdraw);
    }
}

//-------------------------------------Deposit Extends-------------------------
class Checkdeposit extends Deposit{
    private String checkNumber;
    private String bankCode;
    
    public Checkdeposit(int transactionid, Enumaration.transactionStatus status, Date creationDate, double amount,String checkNumber,String bankCode) {
        super(transactionid, status, creationDate, amount);
        this.checkNumber = checkNumber;
        this.bankCode = bankCode;
    }   
}

class Cashdeoposit extends Deposit{
    private double cashDepositLimit;
    
    public Cashdeoposit(int transactionid, Enumaration.transactionStatus status, Date creationDate, double amount,double cashDepositLimit) {
        super(transactionid, status, creationDate, amount);
        this.cashDepositLimit = cashDepositLimit;
    }
}

//------------------------------------Transaction Extends----------------------
class Transfer extends Transaction{
    private int destinationAccount;
    private int sourceAccount;
    private double amount;
    
    public Transfer(int transactionid, Enumaration.transactionStatus status, Date creationDate,int destinationAccount, int sourceAccount, double amount){
        super(transactionid,status,creationDate);
        this.destinationAccount = destinationAccount;
        this.sourceAccount = sourceAccount;
        this.amount = amount;
    }
    
    @Override
    public void makeTransaction(){
        System.out.println("Transfer amount: " +amount);
    }
}