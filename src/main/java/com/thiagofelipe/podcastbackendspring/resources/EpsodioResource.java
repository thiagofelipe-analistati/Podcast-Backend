package com.thiagofelipe.podcastbackendspring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagofelipe.podcastbackendspring.domain.Epsodio;
import com.thiagofelipe.podcastbackendspring.repositories.EpsodioRepository;

@RestController
@RequestMapping(value = "/epsodios")
public class EpsodioResource {
	@Autowired
	private EpsodioRepository repo;
	
	@GetMapping
	public ResponseEntity<List<Epsodio>> findAll(){
		List<Epsodio> list = repo.findAll();
		return ResponseEntity.ok().body(list);
	}
	@PostMapping
	public Epsodio cadastrar (@RequestBody Epsodio epsodio) {
		return repo.save(epsodio);
	}
}
