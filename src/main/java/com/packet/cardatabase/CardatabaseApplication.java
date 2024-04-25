package com.packet.cardatabase;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CardatabaseApplication {

	public static void main(String[] args) {

		SpringApplication.run(CardatabaseApplication.class, args);



	}

}
