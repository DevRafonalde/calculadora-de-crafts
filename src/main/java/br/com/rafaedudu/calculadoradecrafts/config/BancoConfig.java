package br.com.rafaedudu.calculadoradecrafts.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoConfig {
    public static void connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:src/main/resources/teste.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Conexão feita!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.sqlite.JDBC");
        dataSourceBuilder.url("jdbc:sqlite:your.db");
        return dataSourceBuilder.build();
    }
}
