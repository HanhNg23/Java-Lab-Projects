package com.springcloud.eureka_service01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.inject.Inject;

@SpringBootApplication
@EnableDiscoveryClient // enables you to register a service with a running Eureka Service registry
@RestController
public class Service01 {
	public static void main(String[] args) {
          SpringApplication.run(Service01.class, args);
    }
 
	@RequestMapping("/")
    public String index() {
         return "This is  a Spring Boot application";
    }

	@Inject
	private MountainDAO dao;

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mountain get(@PathVariable("id") Long id) {
		Mountain c = dao.get(id);
		return c;
	}
	 
}