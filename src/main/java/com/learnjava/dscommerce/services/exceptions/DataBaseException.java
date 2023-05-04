package com.learnjava.dscommerce.services.exceptions;

public class DataBaseException extends  RuntimeException {

    public DataBaseException(String msg){
        super(msg);
    }
}