package com.tap.library.config;

import com.tap.library.entities.AuthorEntity;
import com.tap.library.entities.BookEntity;
import com.tap.library.entities.RequestEntity;
import com.tap.library.entities.UserEntity;
import com.tap.library.repository.AuthorRepository;
import com.tap.library.repository.BookRepository;
import com.tap.library.repository.RequestRepository;
import com.tap.library.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Configuration
public class AppConfig {
    @Bean
    CommandLineRunner commandLineRunnerApp(BookRepository bookRepository,
                                                  AuthorRepository authorRepository,
                                                  UserRepository userRepository,
                                                  RequestRepository requestRepository){
        return args ->{
            BookEntity bookEntity;
            AuthorEntity authorEntity;
            UserEntity userEntity;
            RequestEntity requestEntity;

            userEntity = new UserEntity("user1", "user1", true);
            userRepository.save(userEntity);

            for(int i = 1; i <= 3; i++ ){
                bookEntity = new BookEntity(String.format("name%s", i), String.format("genre%s", i + 20), 3, String.format("publisher%s", i));

                authorEntity = new AuthorEntity(String.format("author%s", i), String.format("wrote books %s", i*20));
                bookEntity.setAuthorEntity(authorEntity);

                userEntity = new UserEntity("client1", "client1", false);

                Date date = Date.valueOf(LocalDate.now());
                LocalDate dateForReturn  = LocalDate.now().plus(2, ChronoUnit.WEEKS);
                Date dateForReturnSql = Date.valueOf(dateForReturn);
                requestEntity = new RequestEntity(userEntity, bookEntity, date);
                requestEntity.setEndDate(dateForReturnSql);

                bookRepository.save(bookEntity);
                authorRepository.save(authorEntity);
                userRepository.save(userEntity);
                requestRepository.save(requestEntity);
            }
            bookEntity = null;
            authorEntity = null;
            userEntity = null;
            requestEntity = null;
        };
    }
}
