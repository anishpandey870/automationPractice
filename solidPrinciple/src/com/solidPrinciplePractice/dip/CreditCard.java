package com.solidPrinciplePractice.dip;

public class CreditCard implements BankCard {
    public void doTransaction(long amount){
        System.out.println("transaction creditCard");
    }

}
