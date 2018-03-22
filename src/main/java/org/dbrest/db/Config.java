package org.dbrest.db;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	
	private static final String FILE_CONFIG = "/config.properties";
	
	private String url;
	private String driver;
	private String usuario;
	private String password;
	
	public Config() {
		Properties props = readConfig();
		url = props.getProperty("url", "");
		driver = props.getProperty("driver", "");
		usuario = props.getProperty("usuario", "");
		password = props.getProperty("password", "");
	}
	
	private Properties readConfig() {
		InputStream is = Config.class.getResourceAsStream(FILE_CONFIG);
		Properties props = new Properties();
		try {
			props.load(is);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage(), e.getCause());
		}
		return props;
	}
	
	public String getUrl() {
		return url;
	}
	public String getDriver() {
		return driver;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getPassword() {
		return password;
	}
	
	

}
