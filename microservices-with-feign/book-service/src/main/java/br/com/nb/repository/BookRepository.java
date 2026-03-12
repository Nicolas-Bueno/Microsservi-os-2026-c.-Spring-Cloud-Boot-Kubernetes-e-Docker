package br.com.nb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nb.model.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}
