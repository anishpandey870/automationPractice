package com.solidPrinciplePractice.dip;

public class DebitCard implements BankCard {
    public void doTransaction(long amount){
        System.out.println("transaction by debitCard");
    }
}
