package se.iths.springbootusermessagingapp.user;

import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User, Long>{
}

