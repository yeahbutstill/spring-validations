package com.yeahbutstill.springvalidations.helper;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;

@Component
public class SayHelloV2 implements ISayHello {

    public String sayHello(@NotBlank String name) {
        return "Hello " + name;
    }

}
