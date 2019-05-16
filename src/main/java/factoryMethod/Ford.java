package factoryMethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/* This is concrete product */

public class Ford implements Auto {

    public void readAuto() {
        System.out.println("This is Ford");
    }
}
