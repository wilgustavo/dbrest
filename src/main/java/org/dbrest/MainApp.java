package org.dbrest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.dbrest.servicios.HolaService;

public class MainApp extends Application{
	
	private Set<Class<?>> classes = new HashSet<Class<?>>();
	private Set<Object> singletons = new HashSet<Object>();
	
	public MainApp() {
		singletons.add(new HolaService());
	}
	
	public Set<Class<?>> getClasses() {
		return classes;
	}
	
	public Set<Object> getSingletons() {
		return singletons;
	}

}
