package br.edu.unichristus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info = @Info(
				title = "Biblioteca Virtual Pública",
				version = "1.0",
				description = "API da Disciplina TEPW 2025.1",
				contact = @Contact(
						name = "Ítalo & Jefferson",
						email = "jefferson.c.nunes@gmail.com",
						url = "http://unichristus.edu.br/")
		)
)
@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
