package com.learnjava.dscommerce.services.exceptions;

public class ResourceNotFoundException extends  RuntimeException {

    public ResourceNotFoundException(String msg){
        super(msg);
    }
}