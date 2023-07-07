package org.example;

public class PasswordValidator {

    private static final String WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE = "비밀번호는 8자 이상 12자 이하여야 합니다.";

    public static void validate(String password) {
        int length = password.length();
        if(password.length() < 8 || password.length() > 12){
            throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
        }
    }
}
