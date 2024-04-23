package br.com.rafaedudu.calculadoradecrafts;

import br.com.rafaedudu.calculadoradecrafts.config.BancoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraDeCraftsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraDeCraftsApplication.class, args);
		BancoConfig.connect();
	}

}
