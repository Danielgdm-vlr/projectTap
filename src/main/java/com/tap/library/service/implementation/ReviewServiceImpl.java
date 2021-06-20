package com.tap.library.service.implementation;

import com.tap.library.model.dto.AuthorDto;
import com.tap.library.model.dto.BookDto;
import com.tap.library.model.dto.ReviewDto;
import com.tap.library.model.dto.UserDto;
import com.tap.library.model.entities.AuthorEntity;
import com.tap.library.model.entities.BookEntity;
import com.tap.library.model.entities.ReviewEntity;
import com.tap.library.model.entities.UserEntity;
import com.tap.library.repository.BookRepository;
import com.tap.library.repository.ReviewRepository;
import com.tap.library.repository.UserRepository;
import com.tap.library.service.intrf.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;
    private final BookRepository bookRepository;

    @Autowired
    public ReviewServiceImpl(ReviewRepository reviewRepository,
                             UserRepository userRepository,
                             BookRepository bookRepository)
    {
        this.reviewRepository = reviewRepository;
        this.userRepository = userRepository;
        this.bookRepository = bookRepository;
    }


    public List<ReviewDto> getAll() {
        List<ReviewEntity> reviewEntityList = reviewRepository.findAll();
        List<ReviewDto> reviewDtoList = new ArrayList<>();

        for(ReviewEntity reviewEntity: reviewEntityList){
            reviewDtoList.add(convertEntityToDto(reviewEntity));
        }

        return reviewDtoList;
    }

    private ReviewDto convertEntityToDto(ReviewEntity reviewEntity){
        return new ReviewDto(
                convertBookEntityToDto(reviewEntity.getBookEntity()),
                convertUserEntityToDto(reviewEntity.getUserEntity()),
                reviewEntity.getReviewText(),
                reviewEntity.getBookRating()
        );
    }

    private BookDto convertBookEntityToDto(BookEntity bookEntity){
        return new BookDto(
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
        AuthorDto authorDto = new AuthorDto(
                authorEntity.getFullName(),
                authorEntity.getInfo()
        );

        return authorDto;
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

    @Transactional
    public void add(ReviewDto reviewDto) {
        reviewRepository.save(convertDtoToEntity(reviewDto));
    }

    private ReviewEntity convertDtoToEntity(ReviewDto reviewDto){
        return new ReviewEntity(
                bookRepository.findByNameContainingAndGenreContaining(reviewDto.getBookDto().getName(),
                    reviewDto.getBookDto().getGenre()).get(0),
                userRepository.findByFirstName(reviewDto.getUserDto().getFirstName()).get(0),
                reviewDto.getReviewText(),
                reviewDto.getBookRating()
        );
    }
}
