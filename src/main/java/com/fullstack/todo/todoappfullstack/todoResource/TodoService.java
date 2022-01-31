package com.fullstack.todo.todoappfullstack.todoResource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


@Service
public class TodoService {
	private static List<Todo> todoList  = new ArrayList<>();
	static int idCounter=0;
	static {
		todoList.add(new Todo("Udhay","Master React",++idCounter,new Date(),false));
		todoList.add(new Todo("Udhay","Master Spring-boot",++idCounter,new Date(),false));
		todoList.add(new Todo("Udhay","Create Fullstack app",++idCounter,new Date(),false));
	}
	public List<Todo> findAll(){
		System.out.println(todoList);
		return todoList;
	}
	
	public Todo deleteByid(int id) {
		Todo todo = findByid(id);
		if(todoList.remove(todo))
			return todo;
		return null;
	}

	public Todo findByid(int id) {
		try{
		return todoList.stream()
				.filter((todo)->todo.getId()==id).collect(Collectors.toList()).get(0);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public Todo save(Todo todo) {
		if(todo.getId()==-1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todoList.add(todo);
		}
		else {
			deleteByid(todo.getId());
			System.out.println(todo.toString());
			todoList.add(todo);
		}
		return todo;
	}
	
}
