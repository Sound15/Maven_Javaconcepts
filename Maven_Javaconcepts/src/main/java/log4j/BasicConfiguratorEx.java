package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorEx {
	static Logger logger=Logger.getLogger(BasicConfiguratorEx.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.debug("This is debug message"); 
		logger.info("This is an info");
		logger.warn("This is warning");
		logger.error("This is an error");
		logger.fatal("This is fatal message");

	}

}
