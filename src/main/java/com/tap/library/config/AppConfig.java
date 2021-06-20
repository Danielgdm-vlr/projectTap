//package com.tap.library.config;
//
//import com.tap.library.model.entities.*;
//import com.tap.library.repository.*;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.sql.Date;
//import java.time.LocalDate;
//import java.time.temporal.ChronoUnit;
//import java.util.Locale;
//
//@Configuration
//public class AppConfig {
//    @Bean
//    CommandLineRunner commandLineRunnerApp(BookRepository bookRepository,
//                                           AuthorRepository authorRepository,
//                                           UserRepository userRepository,
//                                           RequestRepository requestRepository,
//                                           ReviewRepository reviewRepository){
//        return args ->{
//            BookEntity bookEntity;
//            AuthorEntity authorEntity;
//            UserEntity userEntity;
//            RequestEntity requestEntity;
//
//            userEntity = new UserEntity("test", "user1", true);
//            userRepository.save(userEntity);
//
//            bookEntity = null;
//
//            for(int i = 1; i <= 5; i++ ){
//                bookEntity = new BookEntity(
//                        String.format("name%s", i),
//                        String.format("genre%s", i + 20),
//                        5.0,
//                        3,
//                        String.format("publisher%s", i),
//                        String.format("photo_categories%s", i),
//                        String.format("photo_books%s", i)
//                        );
//
//                authorEntity = new AuthorEntity(String.format("author%s", i), String.format("wrote books %s", i*20));
//                bookEntity.setAuthorEntity(authorEntity);
//
//                userEntity = new UserEntity("client1", "client1", false);
//
//                Date date = Date.valueOf(LocalDate.now());
//                LocalDate dateForReturn  = LocalDate.now().plus(2, ChronoUnit.WEEKS);
//                Date dateForReturnSql = Date.valueOf(dateForReturn);
//                requestEntity = new RequestEntity(userEntity, bookEntity, date);
//                requestEntity.setEndDate(dateForReturnSql);
//
//                bookRepository.save(bookEntity);
//                authorRepository.save(authorEntity);
//                userRepository.save(userEntity);
//                requestRepository.save(requestEntity);
//            }
//
//            reviewRepository.save(new ReviewEntity(
//                    bookEntity,
//                    userEntity,
//                    "asdatest",
//                    4.24
//            ));
//
//            bookEntity = null;
//            authorEntity = null;
//            userEntity = null;
//            requestEntity = null;
//        };
//    }
//}
