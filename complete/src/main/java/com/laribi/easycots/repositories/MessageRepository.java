package com.laribi.easycots.repositories;

import com.laribi.easycots.models.Message;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MessageRepository extends CrudRepository<Message, Integer> {

}
