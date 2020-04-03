package com.lsaiah.java;

public class BaseException extends RuntimeException {
    public BaseException() {
        super();
    }
    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }
}

class UserNotFoundException extends BaseException{

    public UserNotFoundException(String error_message) {
        super(error_message);
    }
}

class LoginFailedException extends BaseException{
    public LoginFailedException(String error_mess) {
        super(error_mess);
    }
}