package com.example.demo;

import jdk.internal.vm.compiler.collections.EconomicMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Map<String, String> env = System.getenv();
		// Java 8
		//env.forEach((k, v) -> System.out.println(k + ":" + v));

		// Classic way to loop a map
		for (Map.Entry<String, String> entry : env.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		SpringApplication.run(DemoApplication.class, args);
	}
}
