package cl.mingeso.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BackendEurekaServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendEurekaServicesApplication.class, args);
	}

}
