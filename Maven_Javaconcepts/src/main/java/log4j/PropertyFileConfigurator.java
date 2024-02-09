package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyFileConfigurator {

	static Logger logger=Logger.getLogger(PropertyFileConfigurator.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is debug message"); 
		logger.info("This is an info");
		logger.warn("This is warning");
		logger.error("This is an error");
		logger.fatal("This is fatal message");


	}

}
