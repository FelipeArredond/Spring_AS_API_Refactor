package com.postobon.asignacion.cedis;

import com.postobon.asignacion.cedis.domain.entity.RolEntity;
import com.postobon.asignacion.cedis.domain.repository.RolJPA;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final RolJPA rolJPA;

	public Application(RolJPA rolJPA) {
		this.rolJPA = rolJPA;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class,
				args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.rolJPA.save(RolEntity.builder().sDescripcion("Admin").build());
		this.rolJPA.save(RolEntity.builder().sDescripcion("Analista").build());
	}
}
