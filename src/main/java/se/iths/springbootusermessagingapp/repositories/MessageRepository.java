package se.iths.springbootusermessagingapp.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import se.iths.springbootusermessagingapp.entities.Message;
import java.awt.print.Pageable;
import java.util.List;

public interface MessageRepository extends ListCrudRepository<Message, Long> {


    @Query("SELECT m FROM Message m WHERE m.user.id = :userId")
    List<Message> findByUserId(Long userId);

    @Query("SELECT m FROM Message m WHERE m.user.id = :userId AND m.isPublic = true")
    List<Message> findPublicMessagesByUserId(Long userId);

    @Query("SELECT m FROM Message m WHERE m.isPublic = true ORDER BY m.createdDate DESC")
    List<Message> findLatestMessagesPublic(Pageable pageable);

    @Query("SELECT m FROM Message m WHERE m.isPublic = false ORDER BY m.createdDate DESC")
    List<Message> findLatestMessagesNotPublic(Pageable pageable);
}
