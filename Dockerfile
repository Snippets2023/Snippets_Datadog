# Usa una imagen base con Java 17
FROM adoptopenjdk:17

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el archivo JAR generado por Gradle en el directorio /app
COPY build/libs/*.jar app.jar

# Expone el puerto 8080 en el contenedor
EXPOSE 8080

# Comando para ejecutar la aplicación cuando se inicie el contenedor
CMD ["java", "-jar", "app.jar"]
