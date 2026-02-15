/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        //Put input Address;
        Enumeration.Address add = new Enumeration.Address("Uttara","Dhaka","Kawla","5700","Bangladesh");
        add.display();
        
        Card cd = new Card("2382938","Murshid Mahmud","12/06/2026",1235);
        
        Customer cos = new Customer("Murshid Mahmud","murshidmahmud@gamil.com","0154875415",add,Enumeration.customerStatus.Active);
        cos.display_customer();
        
        Bank bank = new Bank("Islami Bank","10012505");
        bank.display_bank();
        
        ATM atm = new ATM (0215212,"Uttara");
        
        Account acc = new Account(0);
        
        Transaction deposit = new Deposit(2512100,Enumeration.transactionStatus.Success,new Date(),50000,acc);
        deposit.makeTransaction();
        
        Transaction withdraw = new Withdraw(2512100,Enumeration.transactionStatus.Success,new Date(), 2200,acc);
        withdraw.makeTransaction();
        
        Transaction inquiry = new BalanceInquiry(2512100,Enumeration.transactionStatus.Success,new Date(),acc);
        inquiry.makeTransaction();
    }
}
