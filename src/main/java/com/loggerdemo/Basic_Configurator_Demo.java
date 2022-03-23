package com.loggerdemo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configurator_Demo {
	
	static Logger log = Logger.getLogger(Basic_Configurator_Demo.class);

	public static void main(String[] args) {
		
		BasicConfigurator.configure();

		log.debug("debug");
		log.info("info");
		log.warn("warning");
		log.error("error");
		log.fatal("fatal");
		
	}

}
