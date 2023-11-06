package com.sunfacil.sunfacil;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@OpenAPIDefinition(servers = {@Server(url = "/",description = "Default Server URL")})
@EnableCaching
@SpringBootApplication
public class InverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(InverterApplication.class, args);
	}

}
