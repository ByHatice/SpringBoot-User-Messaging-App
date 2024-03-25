package se.iths.springbootusermessagingapp.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import se.iths.springbootusermessagingapp.entities.User;

import java.util.List;

public interface UserRepository  extends ListCrudRepository<User, Long> {
    List<User> findByUserName(String username);

    List<User> findByEmail(String email);

    List<User> findByFullName(String fullName);

    List<User> findByFullNameContaining(String partialName);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO user (user_name, profile_picture, full_name, email) VALUES (:userName, :profilePicture, :fullName, :email)", nativeQuery = true)
    void newUser(@Param("userName") String userName, @Param("profilePicture") String profilePicture, @Param("fullName") String fullName, @Param("email") String email);
    @Modifying
    @Transactional
    @Query("UPDATE User u SET u.profilePicture = :profilePicture WHERE u.id = :id")
    void updateProfilePictureByUserName(@Param("id") Long id, @Param("profilePicture") String profilePicture);

    @Modifying
    @Transactional
    @Query("UPDATE User u SET u.userName = :userName WHERE u.id = :id")
    void updateUserNameByUserName(@Param("id") Long id, @Param("userName") String userName);

    @Modifying
    @Transactional
    @Query("UPDATE User u SET u.email = :email WHERE u.id = :id")
    void updateEmailById(@Param("id") Long id, @Param("email") String email);

}
