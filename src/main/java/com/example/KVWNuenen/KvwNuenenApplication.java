package com.example.KVWNuenen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class KvwNuenenApplication {

	public static void main(String[] args) {
		SpringApplication.run(KvwNuenenApplication.class, args);
	}

	@RestController
	public class testController{
		@GetMapping("/hi")
		public String sayHi(){
			return "Hi friend!";
		}
	}
}
