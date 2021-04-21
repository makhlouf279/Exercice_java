package com.aroua;

public class NoBalanceException extends RuntimeException{

    private String message;

    NoBalanceException(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
