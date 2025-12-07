API Market Manager – Backend
Plataforma de Gestión Comercial B2B • Spring Boot • JWT • PostgreSQL
🌟 Presentación

API Market Manager es el backend de un sistema orientado a equipos comerciales que necesitan cotizar APIs, gestionar clientes y visualizar métricas clave, todo desde una arquitectura moderna, segura y escalable.

Este proyecto fue desarrollado siguiendo buenas prácticas profesionales de la industria, priorizando claridad, mantenibilidad y rendimiento. El backend está completamente modularizado, documentado y preparado para integrarse tanto con un frontend web como móvil.

🎯 Objetivos del Sistema

Autenticación y autorización robusta con JWT + Spring Security

Gestión completa de usuarios, roles, clientes y operaciones

Arquitectura limpia basada en capas desacopladas

Persistencia confiable con PostgreSQL + JPA/Hibernate

APIs documentadas mediante Swagger UI

Base sólida para consumo desde aplicaciones móviles o web

🧰 Stack Tecnológico
Categoría	Tecnologías
Backend	Java 17 • Spring Boot 3 • Maven
Seguridad	Spring Security • JWT
Persistencia	PostgreSQL • JPA • Hibernate
Documentación	Swagger / OpenAPI
Utilidades	ModelMapper
📐 Arquitectura del Proyecto

La solución implementa un diseño basado en capas desacopladas:

controller  →  dto  →  service  →  repository  →  entity


Beneficios:

Separación clara de responsabilidades

Código limpio y fácil de extender

Ideal para escalabilidad y mantenimiento futuro

🔐 Autenticación y Seguridad

Inicio de sesión basado en JWT

Expiración configurable

Roles y permisos gestionados desde base de datos

Filtros personalizados para interceptar solicitudes protegidas

🗄️ Base de Datos

Motor: PostgreSQL

Mapeo objeto-relacional con Hibernate

Migraciones automáticas con spring.jpa.hibernate.ddl-auto=update

📘 Documentación de la API

Swagger UI disponible una vez levantado el proyecto:

http://localhost:8080/swagger-ui.html


Incluye:

Endpoints categorizados

Ejemplos de request/response

Modelo interactivo ideal para pruebas

▶️ Ejecución del Proyecto
1️⃣ Requisitos

JDK 17+

Maven 3+

PostgreSQL instalado

Crear base de datos:

apimarketdb

2️⃣ Configurar credenciales en application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/apimarketdb
spring.datasource.username=postgres
spring.datasource.password=123456

3️⃣ Ejecutar
mvn clean install
mvn spring-boot:run

🧪 Endpoints Principales
🔹 Autenticación
POST /api/auth/register
POST /api/auth/login

🔹 Gestión de Usuarios
GET /api/usuarios
GET /api/usuarios/{id}
PUT /api/usuarios/{id}

🔗 Repositorio Oficial

🔗 https://github.com/ChicoElias/api-market-backend

🧑‍💻 Autor

Elías Delgado Manríquez
Desarrollador Fullstack | API & Backend Architecture

⭐ Frase final

"Construido para escalar, diseñado para aprender, listo para el mundo real."
