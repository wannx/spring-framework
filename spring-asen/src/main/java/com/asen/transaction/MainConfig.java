//package com.asen.transaction;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
//@EnableTransactionManagement
////@EnableAspectJAutoProxy(exposeProxy = true)
//@ComponentScan(basePackages = {"com.asen"})
//public class MainConfig {
//
//	@Bean
//	public DataSource dataSource() {
//		DruidDataSource dataSource = new DruidDataSource();
//		dataSource.setUsername("root");
//		dataSource.setPassword("123456");
//		dataSource.setUrl("jdbc:mysql://10.10.10.20:3306/db_spring");
//		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		return dataSource;
//	}
//
//	@Bean
//	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//		return new JdbcTemplate(dataSource);
//	}
//
//	@Bean
//	public PlatformTransactionManager transactionManager(DataSource dataSource) {
//		return new DataSourceTransactionManager(dataSource);
//	}
//
//}
