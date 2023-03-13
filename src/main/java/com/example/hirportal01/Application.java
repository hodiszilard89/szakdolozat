package com.example.hirportal01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.SQLException;
;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		System.out.println();
	}

}
