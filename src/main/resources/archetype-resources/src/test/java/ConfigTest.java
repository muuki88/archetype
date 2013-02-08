#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * Simple test class
 * 
 * @author muki
 * 
 */
public class ConfigTest {

    @Test
    public void testConfig() {
        // Loads from the application.conf in test resources
        // Overrides the reference.conf in main resources
        Config config = ConfigFactory.load();
        assertEquals("Maya", config.getString("name"));
    }

}
