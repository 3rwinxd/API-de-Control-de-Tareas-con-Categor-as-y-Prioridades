
# API de Control de Tareas con Categorías y Prioridades

API REST desarrollada con **Spring Boot** para practicar los fundamentos del desarrollo backend en Java. Implementa una arquitectura en capas limpia, Spring Data JPA, H2 Database en memoria y validaciones robustas para la gestión eficiente de tareas.

---

##  Tecnologías y Stack Utilizado
* **Java 17 / 21**
* **Spring Boot** (Spring Web, Spring Data JPA, Validation)
* **H2 Database** (Base de datos en memoria para desarrollo y pruebas)
* **Maven** (Gestor de dependencias)
* **Git & GitHub** (Control de versiones)

---

##  Arquitectura del Proyecto
El proyecto sigue una **arquitectura en capas** estándar para garantizar la separación de responsabilidades:

```text
com.api.control.tareas.tareas
 ├── controller    # Controladores REST (Endpoints HTTP)
 ├── service       # Lógica de negocio
 ├── repository    # Interfaces de acceso a datos (Spring Data JPA)
 └── model         # Entidades de la base de datos (JPA Entities)
