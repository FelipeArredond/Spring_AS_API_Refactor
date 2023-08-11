package com.postobon.asignacion.cedis;

import com.postobon.asignacion.cedis.domain.entity.RolEntity;
import com.postobon.asignacion.cedis.domain.repository.jpa.RolJPA;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		this.rolJPA.save(RolEntity.builder().sDesc("Admin").build());
		this.rolJPA.save(RolEntity.builder().sDesc("Analista").build());
	}
}
