package hdm.org.se1.addressbook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * A simple http://logging.apache.org/log4j/2.x demo,
 *  see file log4j2.xml for configuration options.
 * 
 */
public class App {
    private static Logger log = LogManager.getLogger(App.class);

    /**
     * @param args Unused
     */
    public static void main( String[] args ) {
        System.out.println( "Fuck hello world! Hello Dolly :-D" );
        
        log.debug("With respect to logging you may want to configure file ");
        log.debug("'src/main/resources/log4j2.xml' to suit your needs.");
        log.debug("This config file 'log4j2.xml' will result in 'A1.log'");
        log.debug("file containing logging output as well.");
    }
}
