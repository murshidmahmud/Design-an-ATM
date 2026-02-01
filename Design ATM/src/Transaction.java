/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

abstract class Transaction {
    protected int transactionid;
    protected Enumaration.transactionStatus status;
    protected Date creationDate;
    
    Transaction(int transactionid, Enumaration.transactionStatus, Date creationDate){
        this.transactionid = transactionid;
        this.status = status;
        this.creationDate = creationDate;
    }
    
    abstract void makeTransaction();
}
