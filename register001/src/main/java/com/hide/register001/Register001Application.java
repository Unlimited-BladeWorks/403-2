package com.hide.register001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hide.register001.mapper")
public class Register001Application {

	public static void main(String[] args) {
		SpringApplication.run(Register001Application.class, args);
	}

}
