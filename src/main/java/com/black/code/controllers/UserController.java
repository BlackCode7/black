package com.black.code.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.black.code.entities.User;
import com.black.code.repositories.UserRepository;

@RestController
@RequestMapping(value="/users") // mapeia a rota /users
public class UserController {
	
	// Criacao do repository
	@Autowired
	private UserRepository repository;	
	
	
	@DeleteMapping(path ={"/{id}"}) // Método delete
	public ResponseEntity <?> delete(@PathVariable long id) {
	   return repository.findById(id)
	           .map(record -> {
	               repository.deleteById(id);
	               return ResponseEntity.ok().build();
	           }).orElse(ResponseEntity.notFound().build());
	}
	
	
	@PutMapping(value="/{id}")//Metodo Put
	public ResponseEntity<User> update(@PathVariable("id") long id,	                                      @RequestBody User user) {
	   return repository.findById(id).map(record -> {
			record.setName(user.getName());
            record.setEmail(user.getEmail());
            record.setCpf(user.getCpf());
            record.setEndereco(user.getEndereco());
            User updated = repository.save(record);
            return ResponseEntity.ok().body(updated);
       		}).orElse(ResponseEntity.notFound().build());
	}	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED) // Método post
	public User create(@RequestBody User user) {
		return repository.save(user);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() { // buscando todos os usarios
	    List<User> result = repository.findAll();
	    return ResponseEntity.ok(result);
	}	
	
	@GetMapping(value = "/page") // buscando usuarios por paginas
	public ResponseEntity<Page<User>> findAll(Pageable pageable) {
	    Page<User> result = repository.findAll(pageable);
	    return ResponseEntity.ok(result);
	}
	
	@GetMapping(value = "/search-name") // busca por nome
	public ResponseEntity<Page<User>> searchByName(@RequestParam(defaultValue = "") String name, Pageable pageable) {
	    Page<User> result = repository.findByNameContainingIgnoreCase(name, pageable);
	    return ResponseEntity.ok(result);
	}
	
	@GetMapping(value = "/search-cpf") // busca por cpf
	public ResponseEntity<Page<User>> searchByCpf(@RequestParam(defaultValue = "") String cpf, Pageable pageable) {
	    Page<User> result = repository.findByCpfContainingIgnoreCase(cpf, pageable);
	    return ResponseEntity.ok(result);
	}
	
	@GetMapping(value = "/search-email") // busca por email
	public ResponseEntity<Page<User>> searchByEmail(@RequestParam(defaultValue = "") String email, Pageable pageable) {
	    Page<User> result = repository.findByEmailContainingIgnoreCase(email, pageable);
	    return ResponseEntity.ok(result);
	}
	
	@GetMapping(value = "/search-endereco") // busca por endereco
	public ResponseEntity<Page<User>> searchByEndereco(@RequestParam(defaultValue = "") String endereco, Pageable pageable) {
	    Page<User> result = repository.findByEnderecoContainingIgnoreCase(endereco, pageable);
	    return ResponseEntity.ok(result);
	}
	
	
	/*
	@GetMapping(path = {"/users/{id}"})
	public ResponseEntity findById(@PathVariable long id_){
	   return repository.findById(id_)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}
	*/
	
	//name, cpf, email, endereco
	//@GetMapping(value = "/search-salary") // EndPoint que faz busca em maior salario x menor salario
	//public ResponseEntity<Page<User>> searchBySalary(@RequestParam(defaultValue = "0") Double minSalary, @RequestParam(defaultValue = "1000000000000") Double maxSalary, Pageable pageable) {
	//    Page<User> result = repository.findBySalaryBetween(minSalary, maxSalary, pageable);
	//    return ResponseEntity.ok(result);
	//}
		
	/*
	@GetMapping
	public ResponseEntity<List<User>> findOne() { //pega todos os usarios
	    List<User> result = repository.findOne();
	    return ResponseEntity.ok(result);
	}
	*/
}
