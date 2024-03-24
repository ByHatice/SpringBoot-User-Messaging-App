package se.iths.springbootusermessagingapp.dto;

import org.springframework.data.repository.ListCrudRepository;
import se.iths.springbootusermessagingapp.entities.User;

public interface UserRepository extends ListCrudRepository<User, Long>{
}

