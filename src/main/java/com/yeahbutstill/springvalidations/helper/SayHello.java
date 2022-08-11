package com.yeahbutstill.springvalidations.helper;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Component
@Validated
public class SayHello {

    public String sayHello(@NotBlank String name) {
        return "Hello " + name;
    }

}
