package org.camunda.example.externaltaskworker;

import org.camunda.bpm.client.spring.annotation.EnableExternalTaskClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ExternalTaskWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalTaskWorkerApplication.class, args);
	}

}
