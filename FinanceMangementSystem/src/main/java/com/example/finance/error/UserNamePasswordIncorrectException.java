package com.example.finance.error;

public class UserNamePasswordIncorrectException extends Exception{
    public UserNamePasswordIncorrectException() {
        super();
    }

    public UserNamePasswordIncorrectException(String message) {
        super(message);
    }

    public UserNamePasswordIncorrectException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNamePasswordIncorrectException(Throwable cause) {
        super(cause);
    }

    protected UserNamePasswordIncorrectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
