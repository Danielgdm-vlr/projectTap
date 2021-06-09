package com.tap.library.repository;

import com.tap.library.model.entities.AuthorEntity;
import com.tap.library.model.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {
    @Query("update BookEntity set authorEntity = ?2 where id = ?1")
    void setAuthor(int id, AuthorEntity authorEntity);

    List<BookEntity> findByNameContaining(String name);
}
