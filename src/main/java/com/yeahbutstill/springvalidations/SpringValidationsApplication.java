package com.yeahbutstill.springvalidations;

import com.yeahbutstill.springvalidations.config.DatabaseProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({
		DatabaseProperties.class
})
@SpringBootApplication
public class SpringValidationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringValidationsApplication.class, args);
	}

}
