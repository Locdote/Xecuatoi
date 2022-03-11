package com.thunghiem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.thunghiem.*")
public class ThuNghiemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThuNghiemApplication.class, args);
	}

}
