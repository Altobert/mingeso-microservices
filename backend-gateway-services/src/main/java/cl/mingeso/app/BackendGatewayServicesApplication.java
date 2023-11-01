package cl.mingeso.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BackendGatewayServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendGatewayServicesApplication.class, args);
	}

}
