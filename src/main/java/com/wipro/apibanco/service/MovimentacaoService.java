package com.wipro.apibanco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.apibanco.model.Movimentacao;
import com.wipro.apibanco.model.Cliente.Usuario;
import com.wipro.apibanco.repository.MovimentacaoRepository;

@Service
public class MovimentacaoService {

@Autowired
private MovimentacaoRepository repository;

public Movimentacao findById(Integer id) { 
	  Optional<Movimentacao> obj = repository.findById(id); 
	  return obj.orElse(null); 
	 } 

public List<Movimentacao> findAll() { 
	  return repository.findAll(); 
	 }

public Movimentacao update(Integer id, Movimentacao obj) { 
	  Movimentacao newObj = findById(id); 
	  newObj.setNome(obj.getNome()); 
	  newObj.setSobrenome(obj.getSobrenome()); 
	  newObj.setEmail(obj.getEmail()); 
	  newObj.setSenha(obj.getSenha()); 
	  return repository.save(newObj); 
	 } 

public Movimentacao create(Movimentacao obj) { 
	  return repository.save(obj); 
	 } 

public void delete(Integer id) { 
	  findById(id);  
	  repository.deleteById(id); 
	 } 
}
