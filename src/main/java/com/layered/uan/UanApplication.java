package com.layered.uan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.layered.uan")
public class UanApplication {

	public static void main(String[] args) {
		SpringApplication.run(UanApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner loadData(InitDataLoader loader) {
		return args->loader.loadData();
	}

}
