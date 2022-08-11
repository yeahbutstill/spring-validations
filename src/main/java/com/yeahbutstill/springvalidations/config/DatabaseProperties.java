package com.yeahbutstill.springvalidations.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties("database")
@Validated
public class DatabaseProperties {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

}
