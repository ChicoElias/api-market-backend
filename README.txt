PASO A PASO PARA LEVANTAR EL BACKEND

1) Instalar Java 17
   - Descargar Temurin u OpenJDK 17 desde la página oficial.
   - Instalar y verificar en una consola:
     java -version

2) Instalar IntelliJ IDEA Community (o Ultimate)
   - Abrir IntelliJ.
   - En la pantalla inicial elegir "Open" y seleccionar la carpeta del proyecto "api-market-backend".

3) Esperar a que IntelliJ descargue las dependencias de Maven
   - Abajo a la derecha aparecerá un mensaje de "Importing Maven project".
   - Cuando termine, no deben aparecer errores rojos en el pom.xml.

4) Ejecutar la aplicación
   - Abrir la clase:
     src/main/java/com/apimarket/ApiMarketBackendApplication.java
   - Click derecho sobre la clase y elegir "Run 'ApiMarketBackendApplication'".
   - El backend se levanta en: http://localhost:8080

5) Probar autenticación y APIs
   - Abrir un navegador en:
     http://localhost:8080/swagger-ui.html
   - Desde Swagger se pueden probar:
     POST /api/auth/register
     POST /api/auth/login
     GET  /api/productos
     GET  /api/usuarios

6) Usuario de prueba creado automáticamente
   - Email: admin@apimarket.cl
   - Password: admin123

7) Para usar desde otro computador (profesor)
   - Subir esta carpeta a GitHub.
   - En el notebook del profesor:
     - Clonar el repositorio.
     - Importar el proyecto en IntelliJ como proyecto Maven.
     - Ejecutar la clase ApiMarketBackendApplication.
