Diseño - Taller Mecánico

Acá está el plano del programa: qué clases tiene, cómo funciona el menú y dónde uso los Maps.

1. Cómo funciona (Main.java)

El programa corre con un `while (opcion != 6)`. Uso `Scanner` para leer lo que escribe el usuario.

Valido todo con `if` en el `Main`. Si algo está mal muestro el mensaje y el menú sigue andando.

Todo está adentro de `main()` con un `if` por cada opción. Cuando elegís salir muestra "Chau!" y cierro el Scanner con `sc.close()`.

El menú tiene 5 opciones + salir.

2. Opciones

*1 - Ingresar auto*
Pido patente, marca, modelo, dueño y problema. La patente la paso a mayúsculas con `toUpperCase()`. Si está vacía muestra "Error: la patente no puede estar vacia." Si ya existe muestra "Error: esa patente ya existe." Si está todo bien hago `new Auto(...)` y lo guardo con `autos.put(patente, nuevoAuto)`.

*2 - Buscar y cambiar estado*
Pido la patente y la paso a mayúsculas. Busco con `get(patente)`. Si es `null` muestra "No se encontro esa patente". Si existe muestro los datos con `mostrarDatos()`, pido el nuevo estado y lo cambio con `setEstado(nuevoEstado)`.

*3 - Listar todos*
Si no hay autos muestra "No hay autos cargados". Si hay, recorro con `for (Auto a: autos.values())` y muestro cada uno con `mostrarDatos()`.

*4 - Reporte ordenado por patente*
Es el mismo listado pero ordenado por patente. Copio el `HashMap` a un `TreeMap` con `new TreeMap<>(autos)` y lo recorro.

*5 - Retirar auto*
Pido la patente y la paso a mayúsculas. Lo saco con `remove(patente)`. Si es `null` muestra "No se encontro esa patente". Si existe muestra "Auto retirado:" y sus datos. Después ya no aparece en el listado.

*6 - Salir*
Muestra "Chau!" y cierra el Scanner.

3. Maps que uso

- *HashMap:* para guardar todos los autos. La clave es la patente (`String`) y el valor es el `Auto`.
- *TreeMap:* en el reporte, para mostrar todo ordenado por patente.

4. Clases

*Main:* tiene `HashMap<String, Auto> autos`, `Scanner sc` y `main(String[] args)`. Ahí está todo el menú.

*Auto:* tiene patente, marca, modelo, dueño, problema y estado. Tiene el constructor, `mostrarDatos()`, `setEstado(String nuevoEstado)` y `getEstado()`. El estado arranca en "En espera".

Main crea y usa Auto.


