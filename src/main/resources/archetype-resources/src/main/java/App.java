#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class App {

    public static void main(String[] args) {
        Config config = ConfigFactory.load();
        System.out.println("Hello, world to " + config.getString("name"));
    }

}
