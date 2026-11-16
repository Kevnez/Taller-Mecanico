# Documentación de métodos obligatorios – Sistema de gestión de autos

## Descripción general

Esta evidencia presenta la estructura y las funcionalidades obligatorias que deben implementarse en las clases `Auto` y `Main` para el desarrollo del sistema de gestión de automóviles.

## 1. Clase Auto

La clase `Auto` representa los vehículos que se registran en el sistema. Contiene los atributos correspondientes a cada automóvil y los métodos necesarios para consultar y modificar sus datos.

**Métodos principales:**
- `Auto()`: constructor que permite crear un nuevo automóvil con todos sus datos.
- `getPatente()`: obtiene la patente del vehículo.
- `getMarca()`: devuelve la marca del automóvil.
- `getModelo()`: devuelve el modelo.
- `getDueno()`: obtiene el nombre del dueño.
- `getProblema()`: devuelve el problema o falla del vehículo.
- `getEstado()`: consulta el estado actual del automóvil.
- `setEstado(String estado)`: permite modificar el estado del vehículo.
- `mostrarDatos()`: muestra por pantalla toda la información del automóvil.

Los estados contemplados son: **En espera, En reparación y Listo**.

## 2. Clase Main

La clase `Main` contiene la lógica principal del programa y permite interactuar con el usuario mediante un menú de opciones.

**Métodos principales:**
- `main(String[] args)`: inicia el programa, crea el HashMap y el Scanner, y muestra el menú.
- `mostrarMenu()`: presenta las opciones disponibles.
- `registrarAuto()`: solicita los datos del automóvil y lo almacena en el HashMap utilizando la patente como clave. También verifica que no exista previamente.
- `buscarAuto(String patente)`: permite buscar un automóvil mediante su patente.
- `cambiarEstado(String patente, String nuevoEstado)`: busca un vehículo y modifica su estado.
- `mostrarTodos()`: recorre el HashMap y muestra todos los automóviles registrados.

## Objetivo de esta evidencia

Documentar los métodos obligatorios y sus respectivas responsabilidades para establecer una guía de implementación del sistema.

Esta documentación permite organizar el desarrollo, identificar las funciones que debe cumplir cada clase y utilizarla como referencia durante las pruebas y verificaciones del programa.
