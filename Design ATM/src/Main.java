/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        //Put input Address;
        Enumaration.Address add = new Enumaration.Address("Uttara","Dhaka","Kawla","5700","Bangladesh");
        
        //Account ac = new SavingAccount(01851,50000,3020);
        
        Card cd = new Card("2382938","Murshid Mahmud","12/06/2026",1235);
        
        Customer cos = new Customer("Murshid Mahmud","murshidmahmud@gamil.com","0154875415",add,Enumaration.customerStatus.Active);
        Bank bank = new Bank("Islamic Bank","is2505");
        ATM atm = new ATM (0215212,"Uttara");
        
        Transaction withdraw = new Withdraw(2512100,Enumaration.transactionStatus.Success,new Date(), 2200);
        cos.makeTransaction(withdraw);
        
    }
}
