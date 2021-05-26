package com.thiagofelipe.podcastbackendspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagofelipe.podcastbackendspring.domain.Epsodio;
import com.thiagofelipe.podcastbackendspring.repositories.EpsodioRepository;


@Service
public class EpsodioService {
	@Autowired
	private EpsodioRepository repo;
	
	public List<Epsodio> findAll(){
		return repo.findAll();
	}
}
