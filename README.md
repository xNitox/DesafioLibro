# Desafío Libro

![GitHub repo size](https://img.shields.io/github/repo-size/xNitox/DesafioLibro)
![GitHub contributors](https://img.shields.io/github/contributors/xNitox/DesafioLibro)
![GitHub stars](https://img.shields.io/github/stars/xNitox/DesafioLibro?style=social)
![GitHub forks](https://img.shields.io/github/forks/xNitox/DesafioLibro?style=social)
![GitHub issues](https://img.shields.io/github/issues/xNitox/DesafioLibro)


## **Descripción del Proyecto**

Este proyecto es una aplicación de consola diseñada para realizar búsquedas de libros a través de una API y almacenarlos en una base de datos. Utiliza JPA de Spring para la gestión de datos y PostgreSQL como sistema de almacenamiento.

El desarrollo está realizado en **Java** y se conecta a la **API de Gutendex** para obtener información sobre libros y autores.

---

## **Características Principales**

- **Aplicación basada en el paradigma de Programación Orientada a Objetos.**
- **Gestión y manipulación de listas y colecciones de datos.**
- **Integración de solicitudes HTTP** para interactuar con servicios externos.
- **Uso de la API Gutendex** para acceder a información de libros y autores.
- **Manejo robusto de excepciones en el código.**
- **Implementación de librerías para procesar datos en formato JSON.**
- **Base de datos PostgreSQL** para el almacenamiento y consulta de información.
- **Uso de Records** para simplificar el manejo de datos serializados.
- **Anotaciones de Spring** para facilitar la configuración y el desarrollo.

---

## **Características de la Aplicación**

### **Menú Interactivo**

La aplicación cuenta con un menú en consola que permite al usuario acceder a diferentes funcionalidades, como realizar búsquedas, registrar datos y generar reportes.

#### Ejemplo de Menú
```
1. Buscar un libro en la API de Gutendex
2. Mostrar todos los libros registrados
3. Mostrar todos los autores registrados
4. Mostrar todos los autores registrados en un periodo de tiempo
5. Mostrar todos los libros filtrados por idioma
6. Mostrar Estadisticas de los libros
7. Salir de la aplicación
```

---

## **Principales Funcionalidades**

### **Búsqueda y Registro de Libros**

Se realizan peticiones a la API para obtener información sobre libros y se guarda en la base de datos.

#### Ejemplo de Solicitud y Respuesta:
```
Solicitud: GET https://gutendex.com/books?search=java
Respuesta: {
    "count": 100,
    "results": [
        {
            "id": 12345,
            "title": "Effective Java",
            "authors": ["Joshua Bloch"]
        }
    ]
}
```

### **Visualización de Libros Registrados**

Permite consultar todos los libros almacenados en la base de datos.

#### Ejemplo:
```
Ingresa nombre del libro para buscar:
ice
El libro fue encontrado con exito!
------------LIBRO--------------
Titulo: Alice's Adventures in Wonderland
Id: 2
Autores: [Nombre: Carroll, Lewis]
Descargas: 43939
Lenguajes: INGLES
```

### **Consulta de Autores Registrados**

Muestra una lista de todos los autores presentes en el sistema.

#### Ejemplo:
```
1. Joshua Bloch
2. Robert C. Martin
```

### **Filtrar Autores por Año**

Permite buscar autores cuyos libros fueron publicados en un año específico.

#### Ejemplo:
```
Año: 2008
Autores:
1. Joshua Bloch
```

### **Filtrar Libros por Idioma**

Posibilidad de listar libros según el idioma en el que están escritos.

#### Ejemplo:
```
Idioma: EN
1. Effective Java - Joshua Bloch
2. Clean Code - Robert C. Martin
```

### **Generación de Estadísticas**

Proporciona información estadística sobre los libros almacenados, incluyendo un top 10.

#### Ejemplo:
```
Total de libros registrados: 100
Top 10 libros más buscados:
1. Effective Java - 50 búsquedas
2. Clean Code - 45 búsquedas
```

---

## **Requisitos para Ejecutar el Proyecto**

- **Java Development Kit (JDK) 8 o superior:** Lenguaje principal del proyecto.
- **IDE IntelliJ IDEA:** Recomendado para la escritura y depuración del código.
- **Librería Gson:** Para el manejo de datos en formato JSON.
- **Gutendex API:** Fuente principal de los datos.
- **PostgreSQL:** Sistema de base de datos utilizado.
- **Framework Spring:** Base para el desarrollo del proyecto.

---

Contribuciones
Las contribuciones son bienvenidas. Si tienes alguna idea.


Contacto
[nibaldoji306@gmail.com](mailto:tu-email@example.com)
[Mi LinkedIn](https://www.linkedin.com/in/nibaldocontreras/)
