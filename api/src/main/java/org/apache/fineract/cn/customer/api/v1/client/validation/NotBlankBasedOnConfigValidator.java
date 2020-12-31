package org.apache.fineract.cn.customer.api.v1.client.validation;

import org.apache.commons.lang.StringUtils;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class NotBlankBasedOnConfigValidator implements ConstraintValidator<NotBlankBasedOnConfig, Object> {
    private String fieldName;
    private String expectedFieldValue;

    @Value("${config.bypassNotNull}")
    private Boolean bypassMandatory;

    @Override
    public void initialize(NotBlankBasedOnConfig constraintAnnotation) {
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if(bypassMandatory)
            return true;
        notBlank(value);
        return true;
    }
    private void notBlank(@NotBlank Object vl){
    }
}
