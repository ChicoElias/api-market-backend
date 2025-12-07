🌐
<div align="center">
API Market Manager – Backend
Plataforma de Gestión Comercial B2B

Spring Boot • JWT • PostgreSQL • Java 17

🧩 Arquitectura moderna • 🔐 Seguridad sólida • 🚀 Desempeño real para producción
</div>
<br> <div align="center">
✨ Presentación
</div>

API Market Manager es un backend diseñado para empresas que venden APIs y necesitan manejar clientes, cotizaciones y accesos de forma segura y escalable.
El proyecto utiliza una arquitectura modular profesional y estándares de la industria para asegurar claridad, mantenibilidad y extensibilidad.

<br> <div align="center">
🎯 Objetivos del Sistema
</div>

🔐 Autenticación robusta con JWT + Spring Security

👥 Gestión completa de usuarios, roles y permisos

🧱 Arquitectura limpia y desacoplada en capas

🗄️ Persistencia sólida con PostgreSQL + JPA/Hibernate

📘 APIs documentadas con Swagger UI

🌐 Backend ideal para frontend móvil o web

<br> <div align="center">
🧰 Tecnologías Utilizadas
</div>
Categoría	Tecnologías
Backend	Java 17 • Spring Boot 3 • Maven
Seguridad	Spring Security • JWT
Base de Datos	PostgreSQL • JPA • Hibernate
Documentación	Swagger / OpenAPI
Utilidades	ModelMapper
<br> <div align="center">
🏗️ Arquitectura del Proyecto
</div>
controller      →      dto      →      service      →      repository      →      model


Beneficios:
✔ Separación de responsabilidades
✔ Código mantenible y escalable
✔ Estructura profesional lista para producción

<br> <div align="center">
🔐 Seguridad y Autenticación
</div>

Login mediante JWT

Tokens con expiración configurada

Validación automática en cada request

Filtros personalizados para solicitudes protegidas

<br> <div align="center">
🗄️ Base de Datos
</div>

Construida sobre PostgreSQL

Entidades mapeadas con Hibernate

Generación automática de tablas (update)

<br> <div align="center">
📘 Documentación de la API
</div>

Una vez ejecutado:

🔗 Swagger UI:

http://localhost:8080/swagger-ui.html


Incluye:
✔ Endpoints agrupados
✔ Ejemplos
✔ Inspección visual del modelo

<br> <div align="center">
▶️ Cómo Ejecutar el Proyecto
</div>
1️⃣ Requisitos

JDK 17+

Maven

PostgreSQL

2️⃣ Crear Base de Datos
CREATE DATABASE apimarketdb;

3️⃣ Configurar credenciales en application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/apimarketdb
spring.datasource.username=postgres
spring.datasource.password=123456

4️⃣ Ejecutar
mvn clean install
mvn spring-boot:run

<br> <div align="center">
📡 Endpoints Principales
</div>
🔹 Autenticación
POST /api/auth/register
POST /api/auth/login

🔹 Usuarios
GET /api/usuarios
GET /api/usuarios/{id}
PUT /api/usuarios/{id}

<br> <div align="center">
🔗 Repositorio Oficial
</div>

👉 https://github.com/ChicoElias/api-market-backend

<br> <div align="center">
🧑‍💻 Autor
</div>

Elías Delgado Manríquez
Desarrollador Fullstack | Backend Architecture | Android Developer

<br> <div align="center">
🌟 Frase Final
“Construido para escalar. Diseñado para aprender. Listo para el mundo real.”
</div>
