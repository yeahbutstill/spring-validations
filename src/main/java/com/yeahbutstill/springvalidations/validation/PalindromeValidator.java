package com.yeahbutstill.springvalidations.validation;

import com.yeahbutstill.springvalidations.helper.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PalindromeValidator implements ConstraintValidator<Palindrome, String> {

    @Autowired
    private StringHelper stringHelper;

    @Override
    public void initialize(Palindrome constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return stringHelper.isPalindrome(s);
    }
}
