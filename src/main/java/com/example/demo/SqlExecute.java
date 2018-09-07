/**
 * 
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SqlExecute implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
    public void run(String... args) throws Exception {
		
		System.out.println("---------------SQL Execute Start-----------------");
		
		String sql = "select sysdate()";
		String sysDate = jdbcTemplate.queryForObject(sql, String.class);
		
		System.out.println("---------------SQL Execute End-----------------");
		
		System.out.println("System Date:" + sysDate);

	}

}
