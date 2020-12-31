package org.apache.fineract.cn.customer.api.v1.client.validation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class NotNullBasedOnConfigValidator implements ConstraintValidator<NotNullBasedOnConfig, Object> {
    private String fieldName;
    private String expectedFieldValue;

    @Value("${config.bypassNotNull}")
    private Boolean bypassMandatory;

    @Override
    public void initialize(NotNullBasedOnConfig constraintAnnotation) {
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if(bypassMandatory)
            return true;
        if(value == null)
            return false;
        return true;
    }
}
