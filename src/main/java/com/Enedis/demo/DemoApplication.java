
package com.Enedis.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication

public class DemoApplication implements CommandLineRunner{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {


		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		String sql = "INSERT INTO books (id, versa) VALUES("
				+"'7','fneklel')";
		jdbcTemplate.update(sql);
	}
}