package com.aluracursos.desafio.desafioLibro;

import com.aluracursos.desafio.desafioLibro.main.Main;
import com.aluracursos.desafio.desafioLibro.service.AuthorService;
import com.aluracursos.desafio.desafioLibro.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class desafioLibro implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	@Autowired
	private AuthorService authorService;

	public static void main(String[] args) {
		SpringApplication.run(desafioLibro.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(bookService, authorService);

		main.initApp();
	}
}
