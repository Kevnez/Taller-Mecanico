# Diseño - Taller Mecánico

En este archivo está el plano del programa: qué clases tiene, cómo funciona el menú y dónde se usan los Maps.

## 1. Estructura de Ejecución (Main.java)

El sistema se ejecuta a través de un bucle interactivo `while` controlado por una variable numérica `opcion`. Utiliza la clase `Scanner` para la captura de entradas por consola y se comunica directamente con la clase gestora que es el `Main`.

La validación se realiza con expresiones lógicas en el `Main` mediante `if / else if`, no mediante el manejo de excepciones con bloques `try-catch`. Cada operación puede lanzar un mensaje de error por pantalla y el menú sigue funcionando.

## 2. Cómo funciona el menú (Main.java)

El menú se repite con un `do-while` / `while` hasta que el empleado elige salir. Para leer lo que escribe el empleado usamos `Scanner`. En el `Main` no revisamos datos con métodos separados: en cada opción llamamos directamente al código de esa opción dentro de un `if`.

Si los datos están mal, mostramos el mensaje y el menú sigue funcionando. En el `finally` de cada vuelta mostramos que la operación terminó, haya salido bien o mal.

El menú desplegable tiene 5 opciones operativas + 1 para salir.

## 3. Opciones del Menú

### 1 - Ingresar auto 
Despliega por pantalla el pedido de datos. Pide patente, marca, modelo, dueño y problema. Valida que la patente no esté vacía y que no exista ya. Si la patente ya existe, muestra error. Si está todo bien, crea un `new Auto(

### 2 - Buscar y cambiar estado 
Pide la patente a buscar. Busca en el `HashMap` con `get(patente)`. Si no existe, muestra "No se encontro esa patente". Si existe, muestra sus datos con `mostrarDatos()`, pide el nuevo estado y lo cambia con `setEstado(nuevoEstado)`.

### 3 - Listar todos 
Despliega por pantalla todos los autos registrados indicando patente, marca, modelo, dueño, problema y estado. Si no hay autos, muestra "No hay autos cargados". Recorre el `HashMap` con `for (Auto a : autos.values())`.

### 4 - Reporte ordenado por patente 
Despliega por pantalla todos los autos pero ordenados por patente, de menor a mayor. Para lograr el orden, copia el `HashMap` a un `TreeMap` con `new TreeMap<>(autos)` y después lo recorre. Es el mismo listado que el 3, pero ordenado.

### 5 - Retirar auto 
Pide la patente a retirar. Busca en el `HashMap` con `remove(patente)`. Si no existe, muestra "No se encontro esa patente". Si existe, muestra sus datos y lo borra del sistema. Después de retirarlo ya no aparece en el listado.

### 6 - Salir 
Cierra el flujo del programa y finaliza con el mensaje "Chau!". Cierra el `Scanner` con `sc.close()`.

## 4. Dónde se validan los datos y dónde se muestran los errores

Como no usamos excepciones personalizadas, toda la validación se hace con `if` en el `Main`:

- **Patente vacía:** Si `patente.isEmpty()` es verdadero, muestra "Error: la patente no puede estar vacia".
- **Patente repetida:** Si `autos.containsKey(patente)` es verdadero, muestra "Error: esa patente ya existe".
- **Patente no encontrada:** Si `autos.get(patente)` devuelve `null`, muestra "No se encontro esa patente".
- **Sin autos cargados:** Si `autos.isEmpty()` es verdadero, muestra "No hay autos cargados".

Cada error muestra su propio mensaje por pantalla y el menú sigue funcionando sin cortarse.

## 5. Maps que usamos: HashMap y TreeMap

- **HashMap:** Garantiza la búsqueda rápida por patente. Lo usamos para guardar todos los autos. La patente es la clave (`String`) y el auto es el valor (`Auto`).
```java


+---------------------+
|        Main         |
+---------------------+
| - autos: Map        |
| - sc: Scanner       |
+---------------------+
| + main()            |
+---------------------+
         |
         | usa
         v
+---------------------+
|        Auto         |
+---------------------+
| - patente: String   |
| - marca: String     |
| - modelo: String    |
| - duenio: String    |
| - problema: String  |
| - estado: String    |
+---------------------+
| + getPatente()      |
| + getEstado()       |
| + setEstado()       |
| + mostrarDatos()    |
+---------------------+
