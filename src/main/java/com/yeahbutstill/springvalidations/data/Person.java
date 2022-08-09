package com.yeahbutstill.springvalidations.data;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class Person {

    @NotBlank
    @NotNull
    private String id;

    @NotBlank
    @NotNull
    private String name;

}
