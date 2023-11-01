package cl.mingeso.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BackendConfigServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendConfigServicesApplication.class, args);
	}

}
