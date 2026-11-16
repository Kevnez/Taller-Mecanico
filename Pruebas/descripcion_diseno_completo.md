# Diseño completo – Sistema de gestión de Taller Mecánico

## 1. Descripción general

Esta documentación presenta el diseño y funcionamiento del sistema de gestión de un taller mecánico, desarrollado en Java.

Se detallan la estructura del programa, las opciones del menú, las validaciones, las estructuras de datos, las clases utilizadas, los estados de los automóviles, el flujo de ejecución y las necesidades identificadas mediante historias de usuario.

## 2. Estructura de ejecución

El programa funciona mediante un bucle interactivo `while`, controlado por una variable numérica llamada `opcion`.

Se utiliza la clase `Scanner` para recibir los datos ingresados por el usuario y comunicarse con las funcionalidades de la clase `Main`.

Las validaciones se realizan mediante estructuras condicionales `if / else if / else` y bloques `try-catch` para manejar posibles excepciones.

## 3. Opciones del menú

El sistema cuenta con seis opciones principales:

1. **Ingresar auto:** permite registrar un vehículo solicitando patente, marca, modelo, dueño y problema. Comprueba que la patente no esté repetida.
2. **Buscar y cambiar estado:** permite buscar un automóvil mediante su patente, visualizar sus datos y modificar su estado.
3. **Listar todos:** muestra todos los automóviles registrados con sus respectivos datos.
4. **Reporte ordenado por patente:** muestra los vehículos ordenados por patente utilizando un `TreeMap`.
5. **Retirar auto:** permite buscar un automóvil y eliminarlo del sistema mediante su patente.
6. **Salir:** finaliza el programa y cierra el Scanner.

## 4. Validaciones y manejo de errores

El sistema contempla diferentes situaciones para evitar errores durante su funcionamiento:

- Patente vacía: verifica que el usuario ingrese una patente.
- Patente repetida: comprueba que el vehículo no esté registrado anteriormente.
- Patente no encontrada: informa cuando no existe un automóvil con esa patente.
- Sin automóviles registrados: muestra un mensaje cuando no hay vehículos cargados.

Cada situación presenta un mensaje correspondiente y permite continuar utilizando el programa.

## 5. Estructuras de datos utilizadas

**HashMap:**

Se utiliza para almacenar los automóviles mediante la patente como clave (`String`) y el objeto `Auto` como valor. Permite realizar búsquedas y administrar los vehículos registrados.

**TreeMap:**

Se utiliza para generar un listado ordenado por patente, copiando los registros del HashMap y organizándolos alfabéticamente.

## 6. Diagrama de clases

El diseño contempla dos clases principales:

- **Main:** administra el menú, el Scanner y la colección de automóviles.
- **Auto:** contiene los atributos patente, marca, modelo, dueño, problema y estado. También incluye métodos para consultar, modificar y mostrar los datos.

La clase Main utiliza y crea objetos de la clase Auto para gestionar los vehículos.

## 7. Estados de un automóvil

Cada vehículo registrado puede encontrarse en tres estados:

1. **En espera:** estado inicial que se asigna al registrar un automóvil.
2. **En reparación:** indica que el vehículo está siendo reparado.
3. **Listo:** indica que el trabajo sobre el vehículo ha finalizado.

El encargado puede modificar el estado utilizando la opción correspondiente del menú.

## 8. Flujo del programa

El funcionamiento general sigue esta secuencia:

1. El programa muestra el menú principal.
2. El usuario selecciona una opción.
3. El programa ejecuta la operación correspondiente mediante estructuras `if / else`.
4. Una vez finalizada la operación, vuelve a mostrar el menú utilizando un bucle `do-while`.
5. El programa termina únicamente cuando el usuario selecciona la opción Salir.

## 9. Historias de usuario

Se identifican dos necesidades principales:

**Como encargado del taller:**

- Quiero consultar qué automóviles están actualmente en el taller para no confundirlos con los que ya fueron entregados.
- Quiero que el sistema me avise cuando ingreso una patente que ya existe para evitar registrar el mismo automóvil dos veces.
- Quiero buscar los vehículos mediante su patente para encontrarlos rápidamente.
- Quiero evitar cambiar accidentalmente el estado de un automóvil que no existe.

**Como dueño del vehículo:**

- Quiero que el programa no se cierre cuando alguien ingresa un dato incorrecto, porque podrían perderse los automóviles que ya estaban registrados.

## 10. Objetivo de esta documentación

Documentar integralmente el diseño del sistema, describiendo sus funcionalidades, organización interna, validaciones y necesidades de los usuarios.

Este material sirve como referencia para el desarrollo, análisis y posterior verificación del funcionamiento del programa de gestión del taller mecánico.
