package com.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usuarios.entities.Usuario;
import com.usuarios.service.UsuarioService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

	@Autowired
	UsuarioService service;
	
	@GetMapping("/all")
	public ResponseEntity<Iterable<Usuario>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}
	
	@PostMapping("/create")
	public ResponseEntity<Usuario> create(@RequestBody Usuario usuario) {
		return ResponseEntity.ok(service.create(usuario));
	}
	
	@PutMapping("/update")
	public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {
		return ResponseEntity.ok(service.update(usuario));
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Integer> delete(@PathVariable(value = "id") Integer id) {
		service.delete(id);
		return ResponseEntity.ok(id);
	}
	
}
