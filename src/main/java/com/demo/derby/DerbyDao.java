package com.demo.derby;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class DerbyDao {

	@Resource
	private  JdbcTemplate jdbcTemplate;
	
	
	public Integer create(){		
		jdbcTemplate.execute("create table test(id int generated always as identity,user_name varchar(10));");		
		return 0;		
	}
	
	public Integer insert(){	
		jdbcTemplate.update("insert into test (user_name)values(?)","fc");
		return 0;		
	}
	public List query(){
		List list = jdbcTemplate.queryForList("select * from test");	
		return list;		
	}
	
	
}
