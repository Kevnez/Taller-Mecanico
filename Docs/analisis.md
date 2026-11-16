
## 1. Objetivo del sistema
Crear un sistema en Java para gestionar los autos que ingresan a un taller mecánico. El sistema debe permitir registrar autos, buscarlos por patente, cambiar su estado de reparación y mostrar sus datos, de forma rápida y sin que se pierdan los datos.

## 2. Actores
- **Usuario / Encargado del taller:** Es la única persona que usa el sistema. Ingresa por el menú, carga autos, los busca y cambia su estado.
- **Sistema:** Guarda los autos, los busca y muestra la información.

## 3. Requerimientos Funcionales

| RF1 | El sistema debe mostrar un menú con opciones |
| RF2 | El sistema debe permitir registrar un auto nuevo con patente, marca, modelo, dueño, problema y estado |
| RF3 | El sistema no debe permitir registrar dos autos con la misma patente |
| RF4 | El sistema debe permitir buscar un auto por su patente |
| RF5 | El sistema debe permitir mostrar todos los autos registrados |
| RF6 | El sistema debe permitir cambiar el estado de un auto (Ejemplo: En espera, En reparación, Listo) |
| RF7 | El sistema debe permitir mostrar los datos de un auto |
| RF8 | El sistema debe permitir salir del programa |

## 4. Casos de Uso

### CU1 - Registrar auto
- **Actor:** Encargado
- **Pasos:** 1. Elige la opción Registrar. 2. Ingresa patente, marca, modelo, dueño y problema. 3. El sistema guarda el auto con estado "En espera".
- **Si la patente ya existe:** El sistema muestra un error y no lo guarda.

### CU2 - Buscar auto por patente
- **Actor:** Encargado
- **Pasos:** 1. Elige la opción Buscar. 2. Ingresa la patente. 3. El sistema muestra los datos del auto.
- **Si no existe:** El sistema muestra "Auto no encontrado".

### CU3 - Cambiar estado del auto
- **Actor:** Encargado
- **Pasos:** 1. Elige la opción Cambiar estado. 2. Ingresa la patente. 3. Elige el nuevo estado. 4. El sistema actualiza el estado.

### CU4 - Mostrar todos los autos
- **Actor:** Encargado
- **Pasos:** 1. Elige la opción Mostrar todos. 2. El sistema muestra la lista completa.
- **Si no hay autos:** El sistema muestra "No hay autos registrados".

## 5. Clases

### Clase Auto
Es la clase que representa cada auto del taller.
- **Atributos:** patente, marca, modelo, duenio, problema, estado
- **Métodos:** getPatente(), getEstado(), setEstado(), mostrarDatos()
- **¿Por qué existe?** Para guardar toda la información de un auto en un solo objeto.

### Clase Main
Es la clase principal, donde está el menú.
- **Atributos:** Map<String, Auto> autos, Scanner sc
- **Métodos:** main(), menú con do-while, if / else
- **¿Por qué existe?** Para controlar el programa, pedir datos por teclado y llamar a los métodos de Auto.


### ¿Por qué usamos HashMap?
Usamos `HashMap<String, Auto>` para guardar los autos.

- **Clave:** patente (String)
- **Valor:** auto (Auto)

**Ventajas:**
- **Búsqueda rápida:** Al buscar por patente, el sistema lo encuentra enseguida, no tiene que recorrer toda la lista.
- **Sin duplicados:** La patente es única. Si ya existe, no deja guardar otro auto con la misma patente.
- **Fácil de usar:** Con `autos.get(patente)` lo buscamos y con `autos.put(patente, auto)` lo guardamos.

Si usáramos una lista, tendríamos que recorrer auto por auto hasta encontrar la patente, y sería más lento.

## 6. Estados de un Auto
Un auto puede estar en estos estados:
1. En espera
2. En reparación
3. Listo

El estado empieza en "En espera" cuando se registra el auto, y el encargado lo va cambiando con la opción Cambiar estado.

## 7. Flujo del Programa
1. El programa muestra el menú.
2. El usuario elige una opción.
3. El programa ejecuta la opción con un `if / else`.
4. El programa vuelve a mostrar el menú con un `do-while`.
5. El programa termina solo cuando el usuario elige Salir.


## 8. Historia de usuario 

Como encargado:
Quiero ver qué autos están en el taller, así no busco uno que ya se entregó, que me avise si escribo una patente que ya existe, para no guardar el mismo auto dos veces, que el sistema me busque el auto por la patente, porque si lo busco a mano me tardo un montón como tambien quiero que no me deje cambiar el estado de un auto que no existe, para no cambiarle el estado a otro auto por error.

Como dueño:
Quiero que el programa no se cierre cuando alguien carga algo mal, porque se perderían los autos que ya estaban registrados.
