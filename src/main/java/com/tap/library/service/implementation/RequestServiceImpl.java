package com.tap.library.service.implementation;

import com.tap.library.model.dto.AuthorDto;
import com.tap.library.model.dto.BookDto;
import com.tap.library.model.dto.RequestDto;
import com.tap.library.model.dto.UserDto;
import com.tap.library.model.entities.AuthorEntity;
import com.tap.library.model.entities.BookEntity;
import com.tap.library.model.entities.RequestEntity;
import com.tap.library.model.entities.UserEntity;
import com.tap.library.repository.BookRepository;
import com.tap.library.repository.RequestRepository;
import com.tap.library.repository.UserRepository;
import com.tap.library.service.intrf.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {
    private final RequestRepository requestRepository;
    private final UserRepository userRepository;
    private final BookRepository bookRepository;

    @Autowired
    public RequestServiceImpl(RequestRepository requestRepository,
                              UserRepository userRepository,
                              BookRepository bookRepository){
        this.requestRepository = requestRepository;
        this.userRepository = userRepository;
        this.bookRepository = bookRepository;
    }

    @Transactional
    public void add(RequestDto requestDto){
        requestRepository.save(convertDtoToEntity(requestDto));
    }

    public List<RequestDto> getAll(){
        List<RequestEntity> requestEntityList = requestRepository.findAll();
        List<RequestDto> requestDtoList = new ArrayList<>();

        for(RequestEntity requestEntity: requestEntityList){
            requestDtoList.add(convertEntityToDto(requestEntity));
        }

        return requestDtoList;
    }

    private RequestEntity convertDtoToEntity(RequestDto requestDto){
        return new RequestEntity(
                userRepository.findByFirstName(requestDto.getUserDto().getFirstName()).get(0),
                bookRepository.findByNameContainingAndGenreContaining(requestDto.getBookDto().getName(),
                        requestDto.getBookDto().getGenre()
                ).get(0),
                requestDto.getStartDate(),
                requestDto.getEndDate()
        );
    }

    private RequestDto convertEntityToDto(RequestEntity requestEntity){
        return new RequestDto(
                convertUserEntityToDto(requestEntity.getUserEntity()),
                convertBookEntityToDto(requestEntity.getBookEntity()),
                requestEntity.getStartDate(),
                requestEntity.getEndDate()
        );
    }

    private UserDto convertUserEntityToDto(UserEntity userEntity){
        return new UserDto(
                userEntity.getUsername(),
                userEntity.getPassword(),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                userEntity.getCnp(),
                userEntity.getEmail(),
                userEntity.getTelephoneNumber(),
                userEntity.isManager()
        );
    }

    private BookDto convertBookEntityToDto(BookEntity bookEntity){
        return new BookDto(
                bookEntity.getId(),
                bookEntity.getName(),
                bookEntity.getGenre(),
                bookEntity.getRating(),
                bookEntity.getStock(),
                bookEntity.getPublisherName(),
                convertAuthorEntityToDto(bookEntity.getAuthorEntity()),
                bookEntity.getPhoto_categories(),
                bookEntity.getPhoto_books()
        );
    }

    private AuthorDto convertAuthorEntityToDto(AuthorEntity authorEntity){
        return new AuthorDto(
                authorEntity.getFullName(),
                authorEntity.getInfo()
        );
    }
}
