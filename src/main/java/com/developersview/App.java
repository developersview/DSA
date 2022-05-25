package com.developersview;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.debug("Logging from App.java");
        logger.info("Logging from App.java");
        logger.warn("Logging from App.java");
        logger.error("Logging from App.java");
        logger.trace("Logging from App.java");
        logger.fatal("Logging from App.java");
    }
}
