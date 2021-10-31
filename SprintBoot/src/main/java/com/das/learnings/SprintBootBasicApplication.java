package com.das.learnings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SprintBootBasicApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SprintBootBasicApplication.class, args);
		
		DasFamily dasFamily= context.getBean(DasFamily.class);
		dasFamily.printWelcome();
	}

}
