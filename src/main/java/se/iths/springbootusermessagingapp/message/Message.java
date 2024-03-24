package se.iths.springbootusermessagingapp.message;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import se.iths.springbootusermessagingapp.user.User;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Lob
    @Column(name = "content")
    private String content;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "isPublic", nullable = false)
    private Boolean isPublic = false;

    @Column(name = "createdDate", nullable = false)
    private Instant createdDate;

    @Column(name = "lastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

}