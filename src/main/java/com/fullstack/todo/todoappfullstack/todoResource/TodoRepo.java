package com.fullstack.todo.todoappfullstack.todoResource;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<Todo, Integer>{

	List<Todo> findByUser(String user);
}
