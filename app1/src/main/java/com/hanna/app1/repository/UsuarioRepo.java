package com.hanna.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hanna.app1.model.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {

}
