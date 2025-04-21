package ar.edu.udeci.pv;
import org.apache.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App {
    // final static Logger logger = Logger.getLogger(App.class);
    private static final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Inicio de la aplicación");
        logger.debug("Este es un mensaje de depuración");
        logger.warn("Este es un mensaje de advertencia");
        logger.error("Este es un mensaje de error");
        logger.fatal("Este es un mensaje fatal");

        System.out.println("¡Hola desde actividad2!");
    }
}
