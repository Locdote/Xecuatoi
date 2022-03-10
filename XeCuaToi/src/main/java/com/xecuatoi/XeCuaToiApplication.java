package com.xecuatoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.xecuatoi.*")
public class XeCuaToiApplication {

	public static void main(String[] args) {
		SpringApplication.run(XeCuaToiApplication.class, args);
	}

}
