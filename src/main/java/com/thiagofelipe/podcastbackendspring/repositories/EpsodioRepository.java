package com.thiagofelipe.podcastbackendspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagofelipe.podcastbackendspring.domain.Epsodio;


public interface EpsodioRepository extends JpaRepository<Epsodio, String>{

}
