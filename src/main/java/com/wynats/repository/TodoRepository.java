package com.wynats.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.wynats.entity.Todo;

@CrossOrigin(origins = "http://localhost:4200")
public interface TodoRepository extends PagingAndSortingRepository<Todo, String> {

}
