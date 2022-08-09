package com.yeahbutstill.springvalidations.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@SpringBootTest
class BinatangTest {

    @Autowired
    private Validator validator;

    @Test
    void testPalindromeFail() {
        Set<ConstraintViolation<Binatang>> constraintViolationSet = validator.validate(Binatang.builder().name("harimau").build());
        String messageFail = constraintViolationSet.stream().findFirst().get().getMessage();
        Assertions.assertFalse(constraintViolationSet.isEmpty());
        Assertions.assertEquals(1, constraintViolationSet.size());
        Assertions.assertEquals("Data bukan polindrome", messageFail);
    }

    @Test
    void testPalindromeSuccess() {
        Set<ConstraintViolation<Binatang>> constraintViolationSet = validator.validate(Binatang.builder().name("kodok").build());
        Assertions.assertTrue(constraintViolationSet.isEmpty());
    }
}