package ir.digixo.custom;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CouponCodeValidator implements ConstraintValidator<CouponCode, String> {

    String couponCodePrefix;

    @Override
    public void initialize(CouponCode constraintAnnotation) {
        couponCodePrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean result;
        if (value != null) {
            result = value.startsWith(couponCodePrefix);
        } else
            result = false;
        return result;
    }
}
