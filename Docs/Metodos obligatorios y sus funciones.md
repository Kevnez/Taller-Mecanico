### 1. Clase Auto - Métodos

| Método | ¿Qué hace? | ¿Qué devuelve? |
| --- | --- | --- |
| Auto(String patente, String marca, String modelo, String duenio, String problema) | Constructor. Crea un auto nuevo con todos sus datos y pone el estado en "En espera". | Crea el objeto |
| getEstado() | Devuelve el estado actual del auto. | String estado |
| setEstado(String nuevoEstado) | Cambia el estado del auto por el que le paso. | Nada, solo cambia el dato |
| mostrarDatos() | Muestra por pantalla patente, marca, modelo, dueño, problema y estado. | Nada, imprime |

### 2. Clase Main - Métodos

| Método | ¿Qué hace? | ¿Qué devuelve? |
| --- | --- | --- |
| main(String[] args) | Arranca el programa, crea el `HashMap` y el `Scanner` y muestra el menú con `while (opcion != 6)`. Adentro tiene un `if` por cada opción: 1. Ingresar auto, 2. Buscar y cambiar estado, 3. Listar todos, 4. Reporte ordenado por patente, 5. Retirar auto, 6. Salir. | Nada |
