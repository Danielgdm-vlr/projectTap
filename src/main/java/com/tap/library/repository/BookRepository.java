package com.tap.library.repository;

import com.tap.library.model.entities.AuthorEntity;
import com.tap.library.model.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {
    List<BookEntity> findByNameContaining(String name);

    List<BookEntity> findByGenreContaining(String genre);

    List<BookEntity> findByNameContainingAndGenreContaining(String name, String genre);
}
