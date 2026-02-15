/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

//-------------------------------Transaction-----------------------------
abstract class Transaction {
    protected int transactionid;
    protected Enumeration.transactionStatus status;
    protected Date creationDate;
    
    public Transaction(int transactionid, Enumeration.transactionStatus status, Date creationDate){
        this.transactionid = transactionid;
        this.status = status;
        this.creationDate = creationDate;
    }
    
    abstract void makeTransaction();
}

//----------------------------------------Transaction Extends------------------------
class BalanceInquiry extends Transaction{
    
    private Account account;
    
    public BalanceInquiry(int transactionid, Enumeration.transactionStatus status, Date creationDate, Account account){
        super(transactionid,status,creationDate);
        this.account = account;
    }
    
    @Override
    public void makeTransaction(){
        System.out.println();
        System.out.println("Your total Balance: "+account.getBalance());
    }
}

class Deposit extends Transaction{
    
    private double amount;
    private Account account;
    
    public Deposit(int transactionid, Enumeration.transactionStatus status, Date creationDate,double amount,Account account){
        super(transactionid,status,creationDate);
        this.amount = amount;
        this.account = account;
    }
    
    @Override
    public void makeTransaction(){
        account.deposit(amount);
        System.out.println("Deposit Successful.");
    }
}

class Withdraw extends Transaction{
    private double amountwithdraw;
    private Account account;
    
    public Withdraw(int transactionid, Enumeration.transactionStatus status, Date creationDate,double amountwithdraw,Account account){
        super(transactionid,status,creationDate);
        this.amountwithdraw = amountwithdraw;
        this.account = account;
    }
    
    @Override
    public void makeTransaction(){
        account.withdraw(amountwithdraw);
        System.out.println("Withdraw Successfull");
    }
}

//-------------------------------------Deposit Extends-------------------------
class Checkdeposit extends Deposit{
    private String checkNumber;
    private String bankCode;
    
    public Checkdeposit(int transactionid, Enumeration.transactionStatus status, Date creationDate, double amount,String checkNumber,String bankCode,Account account) {
        super(transactionid, status, creationDate, amount,account);
        this.checkNumber = checkNumber;
        this.bankCode = bankCode;
    }
    
    @Override
    public void makeTransaction(){
//        super.makeTransaction();
        System.out.println("Number is: "+checkNumber);
        System.out.println("Bankcode : "+bankCode);
    }
}

class Cashdeoposit extends Deposit{
    private double cashDepositLimit;
    
    public Cashdeoposit(int transactionid, Enumeration.transactionStatus status, Date creationDate, double amount,double cashDepositLimit,Account account) {
        super(transactionid, status, creationDate, amount,account);
        this.cashDepositLimit = cashDepositLimit;
    }
}

//------------------------------------Transaction Extends----------------------
class Transfer extends Transaction{
    private int destinationAccount;
    private int sourceAccount;
    private double amount;
    
    public Transfer(int transactionid, Enumeration.transactionStatus status, Date creationDate,int destinationAccount, int sourceAccount, double amount){
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