package log4j;


import org.apache.log4j.Logger;

import org.apache.log4j.xml.DOMConfigurator;


public class XMLConfigurator {
		static Logger logger=Logger.getLogger(XMLConfigurator.class);

		public static void main(String[] args) {
			DOMConfigurator.configure("log4j.xml");
						
			logger.debug("This is debug message"); 
			logger.info("This is an info");
			logger.warn("This is warning");
			logger.error("This is an error");
			logger.fatal("This is fatal message");

	}

}
