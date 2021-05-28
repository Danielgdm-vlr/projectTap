package com.tap.library.config;

import com.tap.library.models.Books;
import com.tap.library.repository.BooksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BooksConfig {
    @Bean
    CommandLineRunner commandLineRunner(BooksRepository booksRepository){
        return args ->{
            Books book;
            for(int i = 1; i <= 3; i++ ){
                book = new Books(String.format("name%s", i), String.format("genre%s", i + 1), 3, String.format("publisher%s", i));
                booksRepository.save(book);
            }
            book = null;
        };
    }
}
