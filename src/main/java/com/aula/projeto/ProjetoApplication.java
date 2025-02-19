package com.aula.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.datasource.url=jdbc:h2:mem:testdb
import spring.datasource.driverClassName=org.h2.Driver
import spring.datasource.username=sa
import spring.datasource.password=password
import spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

}
