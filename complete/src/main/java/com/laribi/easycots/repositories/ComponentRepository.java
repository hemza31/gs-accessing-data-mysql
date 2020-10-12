package com.laribi.easycots.repositories;

import org.springframework.data.repository.CrudRepository;

import com.laribi.easycots.models.Component;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ComponentRepository extends CrudRepository<Component, Integer> {

}
