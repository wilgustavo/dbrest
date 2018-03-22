package org.dbrest.db;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

// https://stackoverflow.com/questions/7592056/am-i-using-jdbc-connection-pooling
public class Database {

	private static final BasicDataSource dataSource = new BasicDataSource();
	
	static {
		Config config = new Config();
		dataSource.setDriverClassName(config.getDriver());
		dataSource.setUrl(config.getUrl());
		dataSource.setUsername(config.getUsuario());
		dataSource.setPassword(config.getPassword());
	}
	
	private Database() {
		
	}
	
	public static Connection getConnection() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage(), e.getCause());
		}
	}

}
