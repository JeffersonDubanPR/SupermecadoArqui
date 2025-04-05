package com.example.Supermecado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SupermecadoApplication {

	public static void main(String[] args) {

		loadEnv();


		SpringApplication.run(SupermecadoApplication.class, args);
	}


    private static void loadEnv(){

        Dotenv dotenv = Dotenv.load();
        System.setProperty("DB_URL",dotenv.get("DB_URL"));
        System.setProperty("DB_USERNAME",dotenv.get("DB_USERNAME"));
        System.setProperty("DB_PASSWORD",dotenv.get("DB_PASSWORD"));

    }
}



