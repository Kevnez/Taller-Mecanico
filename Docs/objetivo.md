## 1. Objetivo del sistema
Crear un sistema en Java para gestionar los autos que ingresan a un taller mecánico. El sistema permite registrar autos, buscarlos por patente, cambiar su estado, listarlos, ver el reporte ordenado por patente y retirarlos, de forma rápida y sin que se pierdan los datos.

## 2. Historias De Usuario
- **Encargado del taller:** Es la única persona que usa el sistema. Ingresa por el menú, carga autos, los busca y cambia su estado.
- **Sistema:** Guarda los autos, los busca y muestra la información.

## 3. Requerimientos

| RF | Requerimiento |
| --- | --- |
| RF1 | El sistema muestra un menú con opciones |
| RF2 | El sistema permite registrar un auto nuevo con patente, marca, modelo, dueño y problema. El estado arranca en "En espera" |
| RF3 | El sistema no permite registrar dos autos con la misma patente |
| RF4 | El sistema permite buscar un auto por su patente y cambiar su estado |
| RF5 | El sistema permite mostrar todos los autos registrados |
| RF6 | El sistema permite mostrar los autos ordenados por patente |
| RF7 | El sistema permite retirar un auto por su patente |
| RF8 | El sistema permite mostrar los datos de un auto |
| RF9 | El sistema permite salir del programa |

## 4. Casos De Uso

### CU1 - Ingresar auto
- **Actor:** Encargado
- **Pasos:** 1. Elige la opción 1. 2. Ingresa patente, marca, modelo, dueño y problema. 3. El sistema guarda el auto con estado "En espera".
- **Si la patente está vacía:** El sistema muestra "Error: la patente no puede estar vacia." y no lo guarda.
- **Si la patente ya existe:** El sistema muestra "Error: esa patente ya existe." y no lo guarda.

### CU2 - Buscar y cambiar estado
- **Actor:** Encargado
- **Pasos:** 1. Elige la opción 2. 2. Ingresa la patente. 3. El sistema muestra los datos del auto. 4. Ingresa el nuevo estado. 5. El sistema actualiza el estado.
- **Si no existe:** El sistema muestra "No se encontro esa patente".

### CU3 - Listar todos
- **Actor:** Encargado
- **Pasos:** 1. Elige la opción 3. 2. El sistema muestra todos los autos.
- **Si no hay autos:** El sistema muestra "No hay autos cargados".

### CU4 - Reporte ordenado por patente
- **Actor:** Encargado
- **Pasos:** 1. Elige la opción 4. 2. El sistema muestra todos los autos ordenados por patente de menor a mayor.

### CU5 - Retirar auto
- **Actor:** Encargado
- **Pasos:** 1. Elige la opción 5. 2. Ingresa la patente. 3. El sistema muestra "Auto retirado:" y los datos del auto. 4. El auto ya no aparece en el listado.
- **Si no existe:** El sistema muestra "No se encontro esa patente".

### CU6 - Salir
- **Actor:** Encargado
- **Pasos:** 1. Elige la opción 6. 2. El sistema muestra "Chau!" y cierra el Scanner.

## 5. Clases

### Clase Auto
Es la clase que representa cada auto del taller.
- **Atributos:** patente, marca, modelo, duenio, problema, estado
- **Métodos:** Constructor, `getEstado()`, `setEstado(String nuevoEstado)`, `mostrarDatos()`
- **¿Por qué existe?** Para guardar toda la información de un auto en un solo objeto.

### Clase Main
Es la clase principal, donde está el menú.
- **Atributos:** `HashMap<String, Auto> autos`, `Scanner sc`
- **Métodos:** `main(String[] args)` con menú con `while (opcion != 6)` y un `if` por cada opción
- **¿Por qué existe?** Para controlar el programa, pedir datos por teclado y llamar a los métodos de Auto.

### ¿Por qué usamos HashMap?
Usamos `HashMap<String, Auto>` para guardar los autos.

- **Clave:** patente (String)
- **Valor:** auto (Auto)

**Ventajas:**
- **Búsqueda rápida:** Al buscar por patente, el sistema lo encuentra enseguida, no tiene que recorrer toda la lista.
- **Sin duplicados:** La patente es única. Si ya existe, no deja guardar otro auto con la misma patente.
- **Fácil de usar:** Con `autos.get(patente)` lo buscamos, con `autos.put(patente, auto)` lo guardamos y con `autos.remove(patente)` lo retiramos.

Si usáramos una lista, tendríamos que recorrer auto por auto hasta encontrar la patente, y sería más lento.

Para el reporte usamos `TreeMap` con `new TreeMap<>(autos)` para mostrar todo ordenado por patente.

## 6. Estados de un Auto
El estado arranca en "En espera" cuando se registra el auto, y el encargado lo va cambiando con la opción 2 escribiendo el nuevo estado. Por ejemplo: En espera, En reparación, Listo.

## 7. Flujo del Programa
1. El programa muestra el menú.
2. El usuario elige una opción.
3. El programa ejecuta la opción con un `if`.
4. El programa vuelve a mostrar el menú con un `while (opcion != 6)`.
5. El programa termina solo cuando el usuario elige Salir.

## 8. Historia de usuario

Como encargado:

Quiero ver qué autos están en el taller, así no busco uno que ya se entregó, que me avise si escribo una patente que ya existe, para no guardar el mismo auto dos veces, que el sistema me busque el auto por la patente, porque si lo busco a mano me tardo un montón, como también quiero que no me deje cambiar el estado de un auto que no existe, para no cambiarle el estado a otro auto por error.

Como dueño:

Quiero que el programa no se cierre cuando alguien carga algo mal, porque se perderían los autos que ya estaban registrados.

