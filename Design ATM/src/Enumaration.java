/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Enumaration {
    
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
