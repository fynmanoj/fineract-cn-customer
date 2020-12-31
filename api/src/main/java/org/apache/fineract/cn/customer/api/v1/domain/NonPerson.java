package org.apache.fineract.cn.customer.api.v1.domain;

import org.hibernate.validator.constraints.NotBlank;

public class NonPerson {
    @NotBlank
    private String productIdentifier;
    @NotBlank
    private String accountNumber;

    public NonPerson() {
    }

    public String getProductIdentifier() {
        return productIdentifier;
    }

    public void setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
