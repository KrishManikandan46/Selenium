package f6_MustKnowJava;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class J05_Log4j {

	public static void basicConfigurator() {
		Logger logger = Logger.getLogger(J05_Log4j.class);
		BasicConfigurator.configure();
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.fatal("fatal");
	}

	public static void propertyonfigurator() {
		Logger logger = Logger.getLogger(J05_Log4j.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.fatal("fatal");
	}

	public static void XmlConfigurator() {
		Logger logger = Logger.getLogger(J05_Log4j.class);
		DOMConfigurator.configure("log4j.xml");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.fatal("fatal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//basicConfigurator();
		propertyonfigurator();
	}

}
