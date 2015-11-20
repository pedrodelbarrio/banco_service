package com.fpmislata.banco_service.core;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class BusinessMessage {

    private String message, fieldName;

    public BusinessMessage() {
    }

    public BusinessMessage(String message, String fieldName) {
        this.message = message;
        this.fieldName = fieldName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

}
