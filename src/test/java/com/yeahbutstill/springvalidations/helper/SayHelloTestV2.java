package com.yeahbutstill.springvalidations.helper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolationException;

@SpringBootTest
class SayHelloTestV2 {

    @Autowired
    private SayHelloV2 sayHelloV2;

    @Test
    void testSuccess() {
        String message = sayHelloV2.sayHello("Dani");
        Assertions.assertEquals("Hello Dani", message);
    }

    @Test
    void testError() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> sayHelloV2.sayHello(""));
    }

}