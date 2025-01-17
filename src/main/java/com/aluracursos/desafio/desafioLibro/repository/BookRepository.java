package com.aluracursos.desafio.desafioLibro.repository;

import com.aluracursos.desafio.desafioLibro.model.Book;
import com.aluracursos.desafio.desafioLibro.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByTitle(String title);

    List<Book> findByLanguage(Language language);
}
