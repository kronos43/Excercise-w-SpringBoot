package com.waynebennet.roomroomclr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;



@Configuration
@SpringBootApplication
public class RoomRoomClrApplication {

	public static RestTemplate main(String[] args) {
		final Logger log = LoggerFactory.getLogger(RoomRoomClrApplication.class);
		
		
		@Bean 
		public RestTemplate restTemplate(RestTemplateBuilder builder) {
			return builder.build();
		}
		
		SpringApplication.run(RoomRoomClrApplication.class, args);
	}

}
