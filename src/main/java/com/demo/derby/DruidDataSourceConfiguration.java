package com.demo.derby;
import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;
  
@Configuration  
public class DruidDataSourceConfiguration {  
    @Bean  
    @ConfigurationProperties(prefix = "spring.datasource")  
    public DataSource druidDataSource() {  
        DruidDataSource druidDataSource = new DruidDataSource();  
        return druidDataSource;  
    }  
    

    @Resource
    DataSource dataSource;
    
    
	@Bean
	public JdbcTemplate getJdbcTemplate(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		
		jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate;
	}
	
}  