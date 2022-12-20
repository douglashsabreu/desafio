package com.douglas.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.douglas.desafio.domain.Cargo;

@Repository
public interface CargoRepositorio extends JpaRepository<Cargo, Integer>{

}
