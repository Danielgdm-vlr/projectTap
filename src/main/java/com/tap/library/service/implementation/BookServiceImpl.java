package com.tap.library.service.implementation;

import com.tap.library.model.dto.AuthorDto;
import com.tap.library.model.dto.BookDto;
import com.tap.library.model.entities.AuthorEntity;
import com.tap.library.model.entities.BookEntity;
import com.tap.library.repository.AuthorRepository;
import com.tap.library.repository.BookRepository;
import com.tap.library.service.intrf.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository, AuthorRepository authorRepository){
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Transactional
    public void add(BookDto bookDto){
        BookEntity bookEntity = convertDtoToEntity(bookDto);
        bookRepository.save(bookEntity);
    }

    public List<BookDto> getAll(){
        List<BookEntity> bookEntityList = bookRepository.findAll();
        List<BookDto> bookDtoList = new ArrayList<>();

        for(BookEntity bookEntity: bookEntityList){
            bookDtoList.add(convertEntityToDto(bookEntity));
        }

        return bookDtoList;
    }

    public List<BookDto> getByName(String name){
        List<BookEntity> bookEntityList = bookRepository.findByNameContaining(name);
        List<BookDto> bookDtoList = new ArrayList<>();

        for(BookEntity bookEntity: bookEntityList){
            bookDtoList.add(convertEntityToDto(bookEntity));
        }

        return bookDtoList;
    }

    public List<BookDto> getByGenre(String genre){
        List<BookEntity> bookEntityList = bookRepository.findByGenreContaining(genre);
        List<BookDto> bookDtoList = new ArrayList<>();

        for(BookEntity bookEntity: bookEntityList){
            bookDtoList.add(convertEntityToDto(bookEntity));
        }

        return bookDtoList;
    }

    public List<BookDto> getByNameAndGenre(String name, String genre){
        List<BookEntity> bookEntityList = bookRepository.findByNameContainingAndGenreContaining(name, genre);
        List<BookDto> bookDtoList = new ArrayList<>();

        for (BookEntity bookEntity: bookEntityList){
            bookDtoList.add(convertEntityToDto(bookEntity));
        }

        return bookDtoList;
    }

    public List<BookDto> getByAuthor(String name){
        List<BookEntity> bookEntityList = bookRepository.findAll();
        List<BookDto> bookDtoList = new ArrayList<>();

        for(BookEntity bookEntity: bookEntityList){
            if(bookEntity.getAuthorEntity().getFullName().equals(name)) {
                bookDtoList.add(convertEntityToDto(bookEntity));
            }
        }

        return bookDtoList;
    }

    private BookEntity convertDtoToEntity(BookDto bookDto){
        BookEntity bookEntity = new BookEntity();

        bookEntity.setName(bookDto.getName());
        bookEntity.setGenre(bookDto.getGenre());
        bookEntity.setRating(bookDto.getRating());
        bookEntity.setStock(bookDto.getStock());
        bookEntity.setPublisherName(bookDto.getPublisherName());

//        Optional<AuthorEntity> authorEntityOptional = authorRepository.findAuthorEntityByFullName(bookDto.getAuthorDto().getFullName());
//        bookEntity.setAuthorEntity(authorEntityOptional.get());

        bookEntity.setAuthorEntity(authorRepository.findAuthorEntityByFullName(bookDto.getAuthorDto().getFullName()));

        return bookEntity;
    }

    private BookDto convertEntityToDto(BookEntity bookEntity){
        BookDto bookDto = new BookDto(
                bookEntity.getName(),
                bookEntity.getGenre(),
                bookEntity.getRating(),
                bookEntity.getStock(),
                bookEntity.getPublisherName(),
                convertAuthorEntityToDto(bookEntity.getAuthorEntity()),
                bookEntity.getPhoto_categories(),
                bookEntity.getPhoto_books()

        );

        return bookDto;
    }

    private AuthorDto convertAuthorEntityToDto(AuthorEntity authorEntity){
        AuthorDto authorDto = new AuthorDto(
                authorEntity.getFullName(),
                authorEntity.getInfo()
        );

        return authorDto;
    }
}
