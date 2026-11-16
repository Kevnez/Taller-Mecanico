# Diseño y funcionamiento – Sistema de gestión de Taller Mecánico

## 1. Descripción general

Esta documentación presenta el diseño estructural y el funcionamiento del programa de gestión de un taller mecánico, desarrollado en Java.

Se explica la estructura de ejecución, el funcionamiento del menú interactivo, las opciones disponibles, las validaciones de datos y las estructuras de almacenamiento utilizadas para administrar los automóviles.

## 2. Estructura de ejecución

El programa se ejecuta mediante un bucle interactivo `while`, controlado por una variable numérica llamada `opcion`.

Se utiliza la clase `Scanner` para capturar los datos ingresados por el usuario y comunicarse con las funcionalidades de la clase `Main`.

La validación de datos se realiza mediante expresiones lógicas y estructuras condicionales `if / else if / else`, acompañadas por bloques `try-catch` para el manejo de excepciones.

## 3. Funcionamiento del menú

El sistema cuenta con seis opciones:

1. **Ingresar auto:** permite registrar un vehículo con sus datos correspondientes y verificar que la patente no esté repetida.
2. **Buscar y cambiar estado:** permite localizar un automóvil mediante su patente y modificar su estado.
3. **Listar todos:** muestra todos los vehículos registrados con sus respectivos datos.
4. **Reporte ordenado por patente:** presenta los automóviles ordenados alfabéticamente por patente mediante el uso de `TreeMap`.
5. **Retirar auto:** permite buscar un vehículo, mostrar sus datos y eliminarlo del sistema.
6. **Salir:** finaliza la ejecución del programa y cierra el Scanner.

## 4. Validaciones y manejo de errores

El programa incorpora diferentes controles para evitar errores durante la ejecución:

- Patente vacía: verifica que el campo no esté vacío.
- Patente repetida: comprueba que no exista previamente en el sistema.
- Patente no encontrada: informa cuando no se localiza un automóvil.
- Sin automóviles registrados: muestra un mensaje cuando no existen vehículos cargados.

Cada validación presenta un mensaje correspondiente y permite que el programa continúe funcionando.

## 5. Estructuras de datos utilizadas

Se utilizan dos estructuras principales:

**HashMap:**
Permite almacenar los automóviles utilizando la patente como clave y el objeto `Auto` como valor. Facilita la búsqueda y administración de los vehículos.

**TreeMap:**
Se utiliza para generar un reporte ordenado por patente, copiando los registros del HashMap y organizándolos alfabéticamente.

## 6. Diagrama de clases

La documentación incluye un diagrama que representa la relación entre las clases `Main` y `Auto`.

- **Clase Main:** administra el menú, el Scanner y la colección de automóviles.
- **Clase Auto:** contiene los atributos del vehículo, como patente, marca, modelo, dueño, problema y estado, además de los métodos para consultar, modificar y mostrar sus datos.

La clase `Main` utiliza y crea objetos de la clase `Auto` para gestionar los registros.

## 7. Objetivo de esta evidencia

Documentar el diseño general del sistema, explicar cómo se ejecutan sus funcionalidades y reconocer las estructuras de datos y métodos utilizados.

Esta documentación sirve como referencia para comprender la organización del código, realizar el análisis del funcionamiento y verificar posteriormente que cada opción cumpla con los requisitos establecidos.
