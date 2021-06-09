package com.tap.library.repository;

import com.tap.library.model.entities.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {
    @Query("select author from AuthorEntity author where author.fullName = ?1")
    Optional<AuthorEntity> findAuthorEntityByFullName(String fullName);
}
