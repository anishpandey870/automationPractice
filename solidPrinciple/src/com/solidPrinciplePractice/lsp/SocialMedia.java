package com.solidPrinciplePractice.lsp;

public abstract class SocialMedia {

    //@support whatsApp,facebook,instagram
    public abstract void chatWithfriend();

    //@support facebook,instagram
    public abstract void publishPost(Object obj);

    //@support whatsApp,facebook,instagram
    public abstract void sendPhotoAndVedio();

    //@support whatsApp,facebook
    public abstract void groupVedioCall(String... users);
}
