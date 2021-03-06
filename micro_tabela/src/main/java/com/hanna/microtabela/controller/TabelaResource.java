package com.hanna.microtabela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanna.microtabela.model.Tabela;
import com.hanna.microtabela.repository.TabelaRepository;

@RestController
@RequestMapping(value="/tabela")
public class TabelaResource {
	@Autowired
	private TabelaRepository tabelaRepository;
	
	@GetMapping
	public ResponseEntity<List<Tabela>> getAll(){
		return ResponseEntity.ok(tabelaRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Tabela> getById(@PathVariable("id") Long id){
		return ResponseEntity.ok(tabelaRepository.findById(id).get());
	}

}
