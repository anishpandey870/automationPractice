package org.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidator {
    private Pattern namePattern;
   private Pattern phonePattern;
   private Pattern emailPathern;
    private static final String username_regex = "^[A-Z][a-z0-9_-]{2,15}$";
    private static final String phone_number = "^\\+\\d{1,2}[\\s]\\d{10}$|^\\d{10}$";
    private static final String email_regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{3}$";

    // private static final Pattern pattern = Pattern.compile(username_regex);

    /*
     * constructor by which we can pass pattern and invoke the compile()
     */
    public UserNameValidator() {
        namePattern = Pattern.compile(username_regex);
        phonePattern = Pattern.compile(phone_number);
        emailPathern = Pattern.compile(email_regex);
    }

    /*
     * @Param is takes the usename parameter
     * @return regex match value
     */
    public boolean nameValidate(String username) {
      Matcher  matcher = namePattern.matcher(username);
        return matcher.matches();
    }

    public boolean phoneValidate( final String phone_number) {
      Matcher  matcher = phonePattern.matcher(phone_number);
        return matcher.matches();
    }

    public boolean emailValidate(String email) {
       Matcher matcher = emailPathern.matcher(email);
        return matcher.matches();
    }

}
