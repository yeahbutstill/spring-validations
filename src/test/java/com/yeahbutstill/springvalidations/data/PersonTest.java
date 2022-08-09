package com.yeahbutstill.springvalidations.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import java.util.Set;

@SpringBootTest
class PersonTest {

    @Autowired
    private Validator validator;

    @Test
    void testPersonNotValid() {

        var person = new Person("", "");
        Set<ConstraintViolation<Person>> constraintViolationSet = validator.validate(person);

        Assertions.assertFalse(constraintViolationSet.isEmpty());
        Assertions.assertEquals(2, constraintViolationSet.size());

    }

    @Test
    void testPersonValid() {

        var person = new Person("1", "Dani");
        Set<ConstraintViolation<Person>> constraintViolationSet = validator.validate(person);

        Assertions.assertTrue(constraintViolationSet.isEmpty());
        Assertions.assertNotNull(constraintViolationSet);

    }

}