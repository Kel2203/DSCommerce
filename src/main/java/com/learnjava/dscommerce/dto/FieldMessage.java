package com.learnjava.dscommerce.dto;

public class FieldMessage {
    private String fieldName;
    private String Message;

    public FieldMessage(String fieldName, String message) {
        this.fieldName = fieldName;
        Message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
