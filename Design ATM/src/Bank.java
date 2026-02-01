/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

public class Bank {
    private String name;
    private String bankCode;
    
    Bank(String name, String bankcode){
        this.name=name;
        this.bankCode=bankCode;
    }
    
    public double getBankCode(){
        return getBankCode();
    }
    
    public void addATM(ATM add){
        
    }
}

class ATM{
    private int atmId;
    private String address;
    
    ATM(int atmId, String address){
        this.atmId=atmId;
        this.address=address;
    }
    
    public void authenticateUser(){
        
    }
}

class CashDispenser{
    private int totalFiveDollarBills;
    private int totalTwentyDollarBills;
    
    CashDispenser(int totalFiveDollarBills, int totalTwentyDollarBills ){
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

class Screen{
    public void showMessage(String massage){
        System.out.println("Screen: " +massage);
    }
}

class Printer{
    public String printReceipt(){
        return "Money Amount.";
    }
}

class CardReader{
    public String readCare(){
        return "Read Your Card.";
    }
}

class DepositSlot{
    private double totalamount;
    
    DepositSlot(double totalamount){
        this.totalamount = totalamount;
    }
    
    public double gettotalamount(){
        return gettotalamount();
    }
}

class CheckDepositslot extends DepositSlot{
    private double checkamount;

    CheckDepositslot(double totalamount,double checkamount) {
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