/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

//-----------------------------------Class Bank--------------------------------
public class Bank {
    private String name;
    private String bankCode;
    
    public Bank(String name, String bankCode){
        this.name=name;
        this.bankCode=bankCode;
    }
    
    public String getBankCode(){
        return bankCode;
    }
    
    public void display_bank(){
        System.out.println("Bank name: "+name);
        System.out.println();
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

//----------------------------Keypad--------------------------------

class Keypad{
    public String getinput(){
        return "Getinput in User";
    }
}

//-------------------------------Screen------------------------------
class Screen{
    public void showMessage(String message){
        System.out.println("Screen: " +message);
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
    public String readCard(){
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