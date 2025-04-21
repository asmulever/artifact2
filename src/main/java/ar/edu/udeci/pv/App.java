package ar.edu.udeci.pv;
import org.apache.log4j.Logger;
import org.apache.commons.cli.*;


public class App {
    // final static Logger logger = Logger.getLogger(App.class);
    private static final Logger logger = Logger.getLogger(App.class);


    public static void main(String[] args) {
        // Definición de opciones
        Options options = new Options();

        options.addOption("h", "help", false, "Muestra ayuda");
        options.addOption("n", "name", true, "Nombre del usuario");

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();

        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("h")) {
                formatter.printHelp("actividad2", options);
                return;
            }

            String name = cmd.getOptionValue("n", "usuario");

            logger.info("Inicio de la aplicación");
            logger.debug("Nombre recibido: " + name);
            System.out.println("¡Hola, " + name + "!");

        } catch (ParseException e) {
            logger.error("Error al analizar argumentos: " + e.getMessage());
            formatter.printHelp("actividad2", options);
        }
    }
}
