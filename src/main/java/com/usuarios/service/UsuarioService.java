package com.usuarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usuarios.entities.Usuario;
import com.usuarios.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repo;
	
	public Iterable<Usuario> getAll() {
		return repo.findAll();
	}
	
	public Usuario create(Usuario usuario) {
		return repo.save(usuario);
	}

	public Usuario update(Usuario usuario) {
//		Optional<Usuario> usuarioOptional = repo.findById(usuario.getId());
		return repo.save(usuario);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
