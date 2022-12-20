package com.douglas.desafio;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.douglas.desafio.domain.Cargo;
import com.douglas.desafio.domain.Usuario;
import com.douglas.desafio.repository.CargoRepositorio;
import com.douglas.desafio.repository.UsuarioRepositorio;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner{
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	@Autowired
	private CargoRepositorio cargoRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cargo cargo1 = new Cargo(null, "Administrador");
		
		Usuario user1 = new Usuario(null, "Douglas Abreu", 10310021626L, 1071989, cargo1);
		
		cargo1.getUsuarios().addAll(Arrays.asList(user1));
		
		this.usuarioRepositorio.saveAll(Arrays.asList(user1));
		this.cargoRepositorio.saveAll(Arrays.asList(cargo1));
		
		
		
		
	}

}
