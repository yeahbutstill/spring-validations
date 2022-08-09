package com.yeahbutstill.springvalidations.data;

import com.yeahbutstill.springvalidations.validation.Palindrome;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Binatang {

    @Palindrome
    private String name;

}
