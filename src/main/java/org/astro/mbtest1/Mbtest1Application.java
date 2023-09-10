package org.astro.mbtest1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"org.astro.mbtest1.**.mappers"})
public class Mbtest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Mbtest1Application.class, args);
	}

}
