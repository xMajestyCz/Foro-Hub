# Foro-Hub
Foro Hub es un desafío de desarrollo Back End que busca replicar el funcionamiento interno de un foro utilizando el framework Spring. Este foro permitirá a los usuarios realizar operaciones CRUD (¡crear, leer, actualizar y eliminar!).

En este proyecto, construiremos una API REST que será el corazón del sistema, encargándose de manejar las solicitudes, validar las reglas de negocio y garantizar la persistencia segura de los datos.

## Funcionalidades de la API
La API incluye las siguientes características:

1. Gestíon de tópicos:
- Crear un nuevo tópico.
- Mostrar todos los tópicos creados.
- Mostrar un tópico específico.
- Actualizar un tópico existente.
- Eliminar un tópico.

2. Buenas prácticas REST:
- Uso de rutas claras y semánticas.
- Respuestas en formatos JSON.

3. Base de datos:
- Implementación de un sistema de almacenamiento persistente para manejar los datos de usuarios y tópicos.

4. Autenticación y autorización:
- Servicio para proteger el acceso a las rutas y limitar las operaciones según los roles de usuario.

## Tecnologías Utilizadas
- Java: Lenguaje de programación principal.
- Spring Boot: Framework para simplificar la creación de aplicaciones Java.
- Spring Security: Para la autenticación y autorización.
- JPA/Hibernate: Para la gestión de la persistencia de datos.
- PostgreSQL: Cómo base de datos.
- Maven: Gestor de dependencias.

## Requisitos Previos
- Java 17 o superior.
- Contar con Maven configurado.
- Una base de datos compatible (Principalmente PostgreSQL)
- Contar con una herramienta para realizar solicitudes HTTP como Postman o Insomnia.

## Enpoints de la API
| Método | Endpoint            | Descripción                   |
|--------|---------------------|-------------------------------|
| POST   | `/api/login`        | Crear una nueva JWT.          |
| POST   | `/api/topicos`      | Crear un nuevo tópico.        |
| GET    | `/api/topicos`      | Listar todos los tópicos.     |
| GET    | `/api/topicos/{id}` | Mostrar un tópico específico. |
| PUT    | `/api/topicos/{id}` | Actualizar un tópico.         |
| DELETE | `/api/topicos/{id}` | Eliminar un tópico.           |
