//package com.fullstack.todo.todoappfullstack.controller;
//
//import java.net.URI;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import com.fullstack.todo.todoappfullstack.todoResource.Todo;
//import com.fullstack.todo.todoappfullstack.todoResource.TodoService;
//
//@RestController
//@CrossOrigin(origins="http://localhost:4200")
//public class TodoController {
//
//	@Autowired
//	TodoService todoService;
//	
//	
//	@GetMapping("/users/{username}")
//	public List<Todo> getAllTodos(@PathVariable String username){
//		return todoService.findAll();
//	}
//	
//	@DeleteMapping("/users/{username}/{id}")
//	public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable int id){
//		Todo deleteTodo = todoService.deleteByid(id);
//		if(deleteTodo!=null)
//			return ResponseEntity.noContent().build();
//		return ResponseEntity.notFound().build();
//	}
//	
//	@GetMapping("/users/{username}/{id}")
//	public Todo getTodo(@PathVariable String username, @PathVariable int id) {
//		return todoService.findByid(id);
//	}
//	
//	@PutMapping("/users/{username}/{id}")
//	public ResponseEntity<Todo> updateTodo(@PathVariable String username,
//			@PathVariable int id, @RequestBody Todo todo){
//			Todo todoUpdated = todoService.save(todo);
//			return new ResponseEntity<Todo>(todoUpdated, HttpStatus.OK);
//	}
//	
//	
//	@PostMapping("/users/{username}")
//	public ResponseEntity<Void> addTodo(@PathVariable String username, @RequestBody Todo todo){
//		Todo createdTodo = todoService.save(todo);
//		URI uri = ServletUriComponentsBuilder
//		.fromCurrentRequest().path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
//		return ResponseEntity.created(uri).build();
//	}
//}
