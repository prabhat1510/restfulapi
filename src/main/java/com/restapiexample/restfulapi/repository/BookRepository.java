package com.restapiexample.restfulapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.restapiexample.restfulapi.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
