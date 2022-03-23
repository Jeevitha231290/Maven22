package com.loggerdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;

public class Property_Configgurator_Demo {
	
	static Logger log = Logger.getLogger(Property_Configgurator_Demo.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("info");
		log.warn("warn");
	}

}
