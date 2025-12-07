API Market Manager – Backend
Plataforma de Gestión Comercial B2B • Spring Boot • JWT • PostgreSQL
🌟 Presentación

API Market Manager es el backend de un sistema orientado a equipos comerciales que necesitan cotizar APIs, gestionar clientes y visualizar métricas clave, todo desde una arquitectura moderna, segura y escalable.

Este proyecto fue diseñado bajo estándares profesionales, logrando un equilibrio entre claridad, rendimiento y buenas prácticas. Además, incluye componentes competitivos de portafolio para demostrar dominio técnico real a nivel industry-ready.

🎯 Objetivos del Sistema

Autenticación y autorización robusta mediante JWT + Spring Security

Gestión completa de usuarios, roles, clientes y operaciones

Arquitectura limpia basada en capas desacopladas

Persistencia estructurada con PostgreSQL + JPA/Hibernate

APIs documentadas y navegables vía Swagger UI

Base sólida para consumo desde frontend móvil o web

🛠️ Stack Tecnológico
Categoría	Herramientas
Backend	Java 17 · Spring Boot 3+ · Maven
Seguridad	Spring Security · JWT
Persistencia	PostgreSQL · JPA · Hibernate
Utilidades	ModelMapper
Documentación	SpringDoc · Swagger UI
🧩 Arquitectura del Proyecto
src/
 └─ main/
     ├─ java/com/apimarket/
     │   ├─ controller/    → Controladores REST
     │   ├─ service/       → Lógica de negocio
     │   ├─ repository/    → Acceso a datos JPA
     │   ├─ model/         → Entidades y enums
     │   └─ security/      → JWT, filtros, providers
     └─ resources/
         ├─ application.properties
         └─ static / templates (si aplica)


Diseñado bajo principios de:

Responsabilidad única

Inyección de dependencias

Capa de servicio limpia

Control de acceso por roles

🔐 Seguridad Implementada

La autenticación JWT sigue un flujo profesional:

Usuario envía credenciales

Servicio valida en base de datos

Se genera token firmado y con expiración

JWT se envía en cada request protegida

Filtro verifica validez antes de ejecutar el endpoint

Incluye:

Filtro JWT personalizado

Manejo contextual del usuario autenticado

Roles ADMIN / EJECUTIVO

Password hashing con BCrypt

⚙️ Configuración de Base de Datos

Crear la base:

CREATE DATABASE apimarketdb;


application.properties:

server.port=8080

spring.datasource.url=jdbc:postgresql://localhost:5432/apimarketdb
spring.datasource.username=postgres
spring.datasource.password=TU_CLAVE

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.security.jwt.secret=TU_SECRETO_JWT
spring.security.jwt.expiration-ms=86400000

springdoc.api-docs.path=/v3/api-docs
springdoc.swagger-ui.path=/swagger-ui.html

▶️ Ejecución del Proyecto
1️⃣ Build
mvn clean install

2️⃣ Run
mvn spring-boot:run

3️⃣ Documentación API
http://localhost:8080/swagger-ui.html

📌 Endpoints Principales
🔑 Autenticación
Método	Endpoint	Función
POST	/auth/login	Genera token JWT
👤 Usuarios
Método	Endpoint	Función
GET	/usuarios	Lista todos los usuarios
GET	/usuarios/{id}	Usuario por ID
PUT	/usuarios/{id}	Actualización parcial
POST	/usuarios/{id}/saldo	Incrementa saldo
💼 Sección Portafolio (Plus Competitivo)

Este backend incorpora prácticas que muestran madurez técnica:

Arquitectura escalable pensada para crecer por módulos

Seguridad realista, similar a entornos productivos

DTOs y ModelMapper para desacoplar entidades de vistas

Limpieza del código, siguiendo convenciones profesionales

Uso adecuado de inyección de dependencias y servicios desacoplados

Documentación clara para onboarding rápido

Este proyecto demuestra:

Dominio de Spring Boot moderno

Comprensión de seguridad aplicada

Buen diseño modular

Capacidad de entregar software listo para integración real

🧠 Estado del Proyecto

✔ Cumple rubrica académica
✔ Cumple estándares profesionales
✔ Listo para despliegue o integración
✔ Código claro, organizado y mantenible

🙌 Autor

Elías Delgado Manríquez
Ingeniería en Informática – DUOC UC

✨ Frase final
“Construir software es resolver problemas; construir buen software es anticiparlos.”
