package com.wipro.apibanco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.apibanco.model.Cliente.Usuario;

@Repository 
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{ 
 
}