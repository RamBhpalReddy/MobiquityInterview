package com.mobiquity.InterviewProgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class InterviewProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewProgramApplication.class, args);
	}

}
