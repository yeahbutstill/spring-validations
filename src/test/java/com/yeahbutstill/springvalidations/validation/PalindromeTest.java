package com.yeahbutstill.springvalidations.validation;

import com.yeahbutstill.springvalidations.data.Binatang;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@SpringBootTest
class PalindromeTest {

    @Autowired
    private Validator validator;

    @Test
    void palindromeValid() {
        Set<ConstraintViolation<Binatang>> constraintViolations = validator.validate(Binatang.builder().name("kodok").build());
        Assertions.assertTrue(constraintViolations.isEmpty());
    }

    @Test
    void palindromeInvalid() {
        Set<ConstraintViolation<Binatang>> constraintViolations = validator.validate(Binatang.builder().name("kupukupu").build());
        Assertions.assertFalse(constraintViolations.isEmpty());
        Assertions.assertEquals(1, constraintViolations.size());
    }

    @Test
    void palindromeInvalidMessage() {
        Set<ConstraintViolation<Binatang>> constraintViolations = validator.validate(Binatang.builder().name("macan").build());
        Assertions.assertFalse(constraintViolations.isEmpty());
        Assertions.assertEquals(1, constraintViolations.size());

        String messageFail = constraintViolations.stream().findFirst().get().getMessage();
        Assertions.assertEquals("Data bukan palindrome", messageFail);
    }

}