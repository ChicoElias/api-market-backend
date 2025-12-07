<div align="center">

# 🛒 API Market Backend
### Sistema de Gestión de E-Commerce & Autenticación

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1.5-green?style=for-the-badge&logo=spring&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge&logo=apachemaven&logoColor=white)
![H2 Database](https://img.shields.io/badge/Database-H2-darkblue?style=for-the-badge&logo=h2&logoColor=white)

<br>

<p align="center">
  <strong>Evaluación 3 - Desarrollo Fullstack</strong><br>
  Backend robusto desarrollado con arquitectura en capas, seguridad JWT y buenas prácticas RESTful.
</p>

[Ver Documentación API](#-documentación-api) • [Instalar Localmente](#-instalación-y-ejecución) • [Estructura](#-estructura-del-proyecto)

</div>

---

## 📖 Sobre el Proyecto

**API Market** es una solución backend diseñada para administrar el núcleo de una plataforma de ventas en línea. Este servicio actúa como la fuente de verdad para la gestión de inventario y el control de acceso de usuarios.

El sistema permite a los administradores mantener un catálogo de productos actualizado y gestionar el acceso de los usuarios mediante un sistema de seguridad basado en tokens.

### ✨ Funcionalidades Clave

* 🔐 **Seguridad Avanzada:** Implementación de Spring Security con filtros JWT (JSON Web Token) para proteger endpoints sensibles.
* 📦 **Gestión de Productos:** CRUD completo (Crear, Leer, Actualizar, Borrar) para el inventario de la tienda.
* 👥 **Control de Usuarios:** Registro de clientes y autenticación de administradores.
* 📄 **Documentación Viva:** Integración con Swagger UI para pruebas interactivas en tiempo real.
* ⚡ **Base de Datos en Memoria:** Uso de H2 para despliegue rápido y pruebas sin configuración externa.

---

## 🛠️ Stack Tecnológico

El proyecto fue construido utilizando las siguientes herramientas y librerías:

| Tecnología | Uso en el Proyecto |
| :--- | :--- |
| **Java 17 (JDK)** | Lenguaje base, aprovechando las características modernas de la versión LTS. |
| **Spring Boot 3** | Framework principal para la inyección de dependencias y servidor embebido. |
| **Spring Security** | Manejo de autenticación, autorización y encriptación de contraseñas (BCrypt). |
| **Lombok** | Reducción de código boilerplate (Getters, Setters, Constructores). |
| **JPA / Hibernate** | Mapeo Objeto-Relacional (ORM) para la persistencia de datos. |
| **Swagger / OpenAPI** | Documentación automática de los endpoints REST. |

---

## 📂 Estructura del Proyecto

El código sigue una arquitectura de capas tradicional para garantizar la mantenibilidad:

```bash
com.apimarket
├── 🔒 auth           # Controladores y lógica de autenticación (Login/Register)
├── ⚙️ config         # Configuraciones (Security, Swagger, Cors)
├── 🎮 controller     # Capa de controladores REST (Endpoints)
├── 📦 model          # Entidades JPA (Producto, Usuario)
├── 💾 repository     # Interfaces de acceso a datos (JPA Repositories)
├── 🧠 service        # Lógica de negocio y validaciones
└── 🛡️ security       # Filtros JWT y utilidades de token
