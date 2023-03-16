package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class MyMediaMonitorIamApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(MyMediaMonitorIamApplicationStarter.class, args);
	}

}
