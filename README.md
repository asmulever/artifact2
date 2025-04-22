# 📌 Actividad2

Proyecto simple desarrollado en **Java 8** utilizando **Apache Maven** como sistema de construcción. Esta aplicación de consola demuestra cómo procesar argumentos desde la línea de comandos usando `commons-cli`, y cómo registrar eventos mediante `log4j`.

## 📂 Estructura del Proyecto

```
Actividad2/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            └── ar/
                └── edu/
                    └── udeci/
                        └── pv/
                            └── App.java
```

## ⚙️ Dependencias utilizadas

- [Apache Commons CLI](https://commons.apache.org/proper/commons-cli/): permite definir y analizar argumentos de línea de comandos.
- [Apache Log4j](https://logging.apache.org/log4j/1.2/): librería para registrar logs en distintos niveles (info, debug, error).

## 🚀 Ejecución

Para compilar y ejecutar el proyecto desde la raíz:

```bash
mvn clean package
java -cp target/Actividad2-1.0-SNAPSHOT.jar ar.edu.udeci.pv.App -n Juan
```

## 📥 Argumentos disponibles

- `-n` o `--name`: permite ingresar el nombre del usuario (opcional, por defecto usa "usuario").
- `-h` o `--help`: muestra el menú de ayuda.

### Ejemplo de uso:

```bash
java -cp target/Actividad2-1.0-SNAPSHOT.jar ar.edu.udeci.pv.App -n Ana
```

Salida esperada:

```
¡Hola, Ana!
```

Y en el log (si está configurado el archivo o consola):

```
INFO  Inicio de la aplicación
DEBUG Nombre recibido: Ana
```

## 🛠️ Desarrollo

Durante el desarrollo se implementó:

- Una clase `App.java` como punto de entrada de la aplicación.
- Definición de opciones CLI mediante `Options`.
- Análisis de argumentos con `DefaultParser`.
- Formateo de ayuda mediante `HelpFormatter`.
- Manejo de errores y logging en múltiples niveles (`info`, `debug`, `error`).

Este proyecto tiene como objetivo familiarizarse con el uso de librerías externas en un proyecto Maven, así como aplicar conceptos básicos de entrada por línea de comandos y registro de logs en Java.
