package com.wynats.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wynats.entity.Todo;


public interface TodoRepository extends PagingAndSortingRepository<Todo,String> {
	

}
