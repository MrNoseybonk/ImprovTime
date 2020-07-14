package com.revature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.revature.beans.Activity;
import com.revature.beans.ImprovCharacter;
import com.revature.beans.Setting;
import com.revature.data.ImprovHardCoded;
import com.revature.services.CreateImprov;

@SpringBootApplication
public class ImprovTime {
	
//	private static ImprovHardCoded hardCode;
//	private static CreateImprov createImprov;

	public static void main(String[] args) {
//		hardCode = new ImprovHardCoded();
//		createImprov = new CreateImprov();
//		Activity[] activities;
//		Setting[] settings;
//		ImprovCharacter[] characters;
//		
//		activities = hardCode.buildActivityData();
//		
//		settings = hardCode.buildSettingData();
//		
//		characters = hardCode.buildCharacterData();
//		
//		createImprov.setUpImprov(activities, characters, settings);
		SpringApplication.run(ImprovTime.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("GET", "OPTIONS", "PUT", "POST", "PATCH", "DELETE")
					.allowedOrigins("*").allowedHeaders("*").allowCredentials(true);
			}
		};
	}

}
