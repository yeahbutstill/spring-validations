package com.yeahbutstill.springvalidations.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PalindromeValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Palindrome {

    String message() default "{PolindromeFail.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
