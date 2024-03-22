package se.iths.springbootusermessagingapp.user;

import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface UserRepository extends ListCrudRepository<User, Long>{
}
