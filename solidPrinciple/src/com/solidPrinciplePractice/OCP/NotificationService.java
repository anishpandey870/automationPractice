package com.solidPrinciplePractice.OCP;

public interface NotificationService {
    public void sendOTP(String medium);
    public void sendTransactionReport(String medium);
}
