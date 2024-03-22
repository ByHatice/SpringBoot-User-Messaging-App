package se.iths.springbootusermessagingapp.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import se.iths.springbootusermessagingapp.message.Message;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String userName;
    private String profilePicture;
    private String fullName;
    private String email;


    @OneToMany(mappedBy = "user", cascade= CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Message> messageList= new ArrayList<>();

    @CreatedDate
    private Instant createdDate;

    @LastModifiedDate
    private Instant lastModifiedDate;
}