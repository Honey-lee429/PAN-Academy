package com.hanna.app3;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.hanna.app3.model.Usuario;



@Component
@FeignClient(name = "servidorzinho", url="localhost:8081", path="/usuarios")
public interface WorkerFeign {
	

	@GetMapping
	public ResponseEntity<List<Usuario>> getAll();

}
