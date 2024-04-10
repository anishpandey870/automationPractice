package com.solidPrinciplePractice.dip;

public class ShopingMall {
    private BankCard bankCard;

    public ShopingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }
    private void doPurchase(long amount){
            System.out.println("transaction creditCard");
            bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {

       BankCard debitCard1=new DebitCard();
      // BankCard creditCard=new CreditCard();
        ShopingMall shopingMall=new ShopingMall(debitCard1);
        shopingMall.doPurchase(4000);
    }
}
