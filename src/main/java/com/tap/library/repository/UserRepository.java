package com.tap.library.repository;

import com.tap.library.model.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    List<UserEntity> findByUsername(String username);

    List<UserEntity> findByFirstName(String firstName);

    List<UserEntity> findByLastName(String lastName);

    List<UserEntity> findByFirstNameAndLastName(String firstName, String lastName);

    List<UserEntity> findByCnp(String cnp);

    List<UserEntity> findByEmail(String email);

    List<UserEntity> findByTelephoneNumber(String telephoneNumber);

    @Query("select user from UserEntity user where user.isManager = true")
    List<UserEntity> findManagers();

    @Query("select user from UserEntity user where user.isManager = false")
    List<UserEntity> findClients();

//    @Query("update UserEntity user set " +
//            "user.firstName = ?2," +
//            "user.cnp = ?3 " +
//            "where user.email = ?1 ")
//    void updateUser(String email, String firstName, String cnp);
}
