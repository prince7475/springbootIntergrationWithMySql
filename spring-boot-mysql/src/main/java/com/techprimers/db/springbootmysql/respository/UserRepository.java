package com.techprimers.db.springbootmysql.respository;

import com.techprimers.db.springbootmysql.modal.User;
import org.springframework.data.repository.CrudRepository;

//This will be auto implemented by spring into a bean called userRepository
//CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {
}
