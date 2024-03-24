package se.iths.springbootusermessagingapp.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String userName;

    private String profilePicture;

    private String fullName;

    @Column(name = "email", nullable = false)
    private String email;

}