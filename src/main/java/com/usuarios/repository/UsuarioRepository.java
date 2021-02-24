package com.usuarios.repository;

import org.springframework.data.repository.CrudRepository;

import com.usuarios.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}
