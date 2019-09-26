package com.myConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyConfigServer {
	
	public static void main(String[] args) {
		SpringApplication.run(MyConfigServer.class, args);
	}

}
