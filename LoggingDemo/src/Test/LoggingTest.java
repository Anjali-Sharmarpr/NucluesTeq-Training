package Test;

/* if level is set INFO then from top to INFO all log will display
 * 
 * OFF
 * FATAL
 * ERROR
 * WARN
 * INFO
 * DEBUG
 * TRACE
 * ALL
  */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingTest {
       
	private static Logger log= LogManager.getLogger(LoggingTest.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		
		log.info("Success.....");
		
		log.error("DB Connection error occurred...");
		
		log.debug("Debuggging required...");
		
		log.fatal("Fatal error..");
		
		log.warn("Warning occured....");
		
		log.trace("Trace log");

		
	}

}


 
