package com.datas.aula5appspringdatas.controller;


import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datas.aula5appspringdatas.model.Tarefas;
import com.datas.aula5appspringdatas.repo.TarefasRepository;

@RestController
@RequestMapping(value ="/api")
public class TarefaController {
	@Autowired
	private TarefasRepository repository;
	
	Calendar calendar = Calendar.getInstance();
	int hora = calendar.get(Calendar.HOUR_OF_DAY);
	
	@GetMapping
	public List<Tarefas> findAll(){
		return repository.findAll();
	}
	
	@GetMapping(value = "/tarefas")
	public ResponseEntity<List<Tarefas>> getAll(){
		if(hora > 8 && hora <17) {
			System.out.println("entrou, dentro do horario");
			return ResponseEntity.ok(repository.findAll());
		} else {
			System.out.println("fora do horário");
			return ResponseEntity.noContent().build();
		}
	}
	
	@PostMapping
	public ResponseEntity<Tarefas> post(@RequestBody Tarefas tarefas) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(tarefas));
	}
	
}
