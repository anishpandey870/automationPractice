package org.example;

import junit.framework.Assert;
import org.example.regex.UserNameValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    UserNameValidator uv = new UserNameValidator();

    @Test
    @DisplayName("this test case for valid name")
    public void nameValidate_test() {
        String str = "Abc";
//        String exp="Akhil";
//        boolean act=uv.nameValidate(str);
        Assert.assertTrue(uv.nameValidate(str));
    }

    @Test
    @DisplayName("for invalid name")
    public void nameInvalid_test() {
        Assert.assertFalse(uv.nameValidate("AnisN"));
    }

    @Test
    @DisplayName("for valid phone number")
    public void phoneValidate_test() {
        String phone = "9799791798";
        Assert.assertTrue(uv.phoneValidate(phone));
    }

    @DisplayName("for invalid phone number")
    @Test
    public void phoneInvalidate_test() {
        String phone = "98999799791798";
        Assert.assertFalse(uv.phoneValidate(phone));
    }

    @Test
    @DisplayName("for valid email id")
    public void emailValidate_test() {
        String email = "abc@gmail.com";
        boolean em = uv.emailValidate(email);
        Assert.assertTrue(em);
    }

    @Test
    @DisplayName("for in valid email id")
    public void emailInvalidate_test() {
        String email = "abc@gmail.comhkjk";
        boolean em = uv.emailValidate(email);
        Assert.assertFalse(em);
    }
}
