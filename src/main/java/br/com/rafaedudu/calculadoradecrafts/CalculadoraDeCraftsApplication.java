package br.com.rafaedudu.calculadoradecrafts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class CalculadoraDeCraftsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraDeCraftsApplication.class, args);
	}

}
