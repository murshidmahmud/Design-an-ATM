package Final_Project;

import java.util.*;

//-----------------------------------Class Bank--------------------------------
class Bank {
    private String name;
    private String bankCode;
    
    public Bank(String name, String bankCode){
        this.name=name;
        this.bankCode=bankCode;
    }
    
    public String getBankCode(){
        return bankCode;
    }
}

//--------------------------ATM--------------------------
class ATM{
    private int atmId;
    private String address;
    
    public ATM(int atmId, String address){
        this.atmId=atmId;
        this.address=address;
    }
}

//-------------------------CashDispenser--------------------------
class CashDispenser{
    private int totalFiveDollarBills;
    private int totalTwentyDollarBills;
    
    public CashDispenser(int totalFiveDollarBills, int totalTwentyDollarBills ){
        this.totalFiveDollarBills = totalFiveDollarBills;
        this.totalTwentyDollarBills = totalTwentyDollarBills;
    }
    
    public void dispenseCash(double amount){
        System.out.println("DispenseCash $ "+amount);
    }
    public void cashDispenseCash(double amount2){
        System.out.println("CashDispenseCash $"+amount2);
    }
}

class Keypad{
    public String getinput(){
        return "Getinput in User";
    }
}

//-------------------------------Screen------------------------------
class Screen{
    public void showMessage(String massage){
        System.out.println("Screen: " +massage);
    }
}

//-------------------------------printer------------------------------
class Printer{
    public String printReceipt(){
        return "Money Amount.";
    }
}

//-------------------------------cardReader------------------------------
class CardReader{
    public String readCare(){
        return "Read Your Card.";
    }
}

//-------------------------------DepositSlot------------------------------
class DepositSlot{
    private double totalamount;
    
    DepositSlot(double totalamount){
        this.totalamount = totalamount;
    }
    
    public double gettotalamount(){
        return totalamount;
    }
}

//---------------------------------------Extends----------------------------
class CheckDepositslot extends DepositSlot{
    private double checkamount;

    public CheckDepositslot(double totalamount,double checkamount) {
        super(totalamount);
        this.checkamount=checkamount;
    }
}

class CashDepositSlot extends DepositSlot{
    private double receivedollar;
   
    public CashDepositSlot(double totalamount,double receivedollar) {
        super(totalamount);
        this.receivedollar = receivedollar;
    }
}

//---------------------------Enumaration--------------------------
class Enumaration {
    
    public enum transactionType{
        BalanceInquiry, DepositCash, DepositCheck, Withdraw, Transfer;
    }
    
    public enum transactionStatus{
        Success, Failure, Blocked, Full, Partial, None;
    }
    
    public enum customerStatus{
        Active, Blocked, Banned, Compromised, Archived, Closed, Unknown;
    }
    
    public static class Address{
        private String address,city,state,zipcode,country;
        
        public Address(String address,String city,String state,String zipcode,String country){
            this.address = address;
            this.city = city;
            this.state = state;    
            this.zipcode = zipcode;
            this.country = country;
        }
    }
}

//---------------------------Customer---------------------------------
class Customer {
    private String name,email,phone;
    private Enumaration.Address address;
    private Enumaration.customerStatus Customerstatus;
    
    public Customer(String name, String email, String phone, Enumaration.Address address,Enumaration.customerStatus Customerstatus){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.Customerstatus = Customerstatus;
    }
    
    public void makeTransaction(Transaction transaction){
        transaction.makeTransaction();
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
    
    Account(int accountNumber, double totlaBalance, double availableBalance){
        this.accountNumber = accountNumber;   
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
    }
    
    public double getBalance(){
        return totalBalance;
    }
}

//---------------------------------------Account Extends------------------------
class SavingAccount extends Account{
    private double withdraw;
    
    public SavingAccount(int accountNumber, double totlaBalance, double availableBalance, double withdraw) {
        super(accountNumber, totlaBalance, availableBalance);
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

//-----------------------------Main Method------------------------------
public class Finalproject {
     public static void main(String[] args) {
        
        //Put input Address;
        Enumaration.Address add = new Enumaration.Address("Uttara","Dhaka","Kawla","5700","Bangladesh");
        
        //Account ac = new SavingAccount(1851,50000,3020);
        
        Card cd = new Card("2382938","Murshid Mahmud","12/06/2026",1235);
        
        Customer cos = new Customer("Murshid Mahmud","murshidmahmud@gamil.com","0154875415",add,Enumaration.customerStatus.Active);
        Bank bank = new Bank("Islamic Bank","is2505");
        ATM atm = new ATM (0215212,"Uttara");
        
        Transaction withdraw = new Withdraw(2512100,Enumaration.transactionStatus.Success,new Date(), 3200);
        cos.makeTransaction(withdraw);
        
    }
}
