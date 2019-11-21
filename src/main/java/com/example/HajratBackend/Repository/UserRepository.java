package com.example.HajratBackend.Repository;

import com.example.HajratBackend.Module.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
