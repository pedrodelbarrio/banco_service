package com.fpmislata.banco_service.core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class BusinessException extends Exception {

    private List<BusinessMessage> businessMessages = new ArrayList<>();

    public BusinessException(List<BusinessMessage> businessMessages) {
        this.businessMessages.addAll(businessMessages);
    }

    public BusinessException(String message, String fieldName) {
        BusinessMessage businessMessage = new BusinessMessage(message, fieldName);
        businessMessages.add(businessMessage);
    }

    public List<BusinessMessage> getBusinessMessages() {
        return businessMessages;
    }

    public void setBusinessMessages(List<BusinessMessage> businessMessages) {
        this.businessMessages = businessMessages;
    }

}
