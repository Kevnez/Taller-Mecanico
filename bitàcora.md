# Lunes 09/11 (dia 1) 
La profesora presenta el proyecto y se forma el grupo. 

No se pudo coordinar encuentro grupal ese día ya que no hubo comunicación de ninguna parte interesada.

# Martes 10/11 (dia 2)
Que nos trabo: no hubo comun@icacion con los integrantes para organizar el trabajo y repartir tareas.

Estado: Sin avance grupal.

# Miércoles 11/11 (dia 3)
Que nos trabo: intente de escribir a los integrantes para coordinar, tampoco hubo respuesta.

Quien hizo que: empecé a investigar por mi cuenta para poder iniciar con el proyecto, se define el tema taller mecanico.

Estado: Avance individual en investigación.

# Jueves 12/11 (dia 4) 
Que nos trabo: Aun seguía sin respuesta por parte de integrantes del grupo.
No se pudo avanzar en grupo.

Estado: Proyecto detenido por falta de comunicación.

# Viernes 13/11 (dia 5)
Que nos trabo: me dejé estar porque no tenía con quién avanzar el proyecto, pero tenía una idea para realizar el mismo.

Estado: Sin avance.

# Sábado 14/11 (dia 6)
Quien hizo que: Kevin aviso a la profesora que los integrantes no se habían puesto en contacto y que por eso no habíamos arrancado.
La profesora quedó al tanto de la situación, pasándomeel contacto de un compañero para poder trabajar juntos.
Mientras tanto decido retomar el proyecto por mi cuenta para no quedar sin entrega y poder avanzar con el proyecto asignado.

Se creó el repositorio en GitHub Kevnez/Taller-Mecanico y el README.md.Completo la bitácora con la situación real.
Que sigue: terminar código base, sus funcionalidades y probar el programa

Estado: En desarrollo, a cargo de un integrante hasta el momento.

# DOMINGO 15/11 (dia 7)

Se sumo el integrante Cespedes, Lautaro. El integrante Kevin Martinez realizo los codigos del proyecto, luego el 2do integrante cespedes lautaro anoto las tarjetas en trello sobre como martinnez iba avanzando sobre el analisis
Luego, cespedes lautaro subio las capturas de los avances y tambien las discripcion en la carpeta llamada "pruebas"

# LUNES 16/11 (dia 8)

Que nos trabó: Al revisar el README.md en GitHub, en la parte de "Nombre del programa" aparecía "MÁS ALTO: CesMar" en lugar de "Taller CesMar". Cuando entrábamos a editar, el texto estaba bien, pero al salir volvía a aparecer mal.

Que hizo: Kevin revisó el archivo en modo edición y confirmó que el texto original estaba bien escrito: "Taller CesMar". Después indagando nos dimos cuenta que no era un error del archivo, sino del traductor automático del navegador (Edge/Chrome). El traductor pensaba que la página estaba en inglés y traducía la palabra "Taller", que en inglés significa "Más alto". Se desactivó la traducción con "Mostrar original" y el nombre volvió a verse bien.

Estado: README.md revisado y corregido. Se aprendió a diferenciar un error real del archivo de un error de visualización del navegador.

# martes 17/11 (dia 9)

#Que hicimos#

# Creación de Auto.java y Main.java


**Auto.java:**
Creamos la clase Auto con patente, marca, modelo, dueño, problema y estado.
Agregamos los métodos obligatorios: mostrarDatos(), cambiarEstado() y getPatente().
Entendimos que Auto es el Back-End, donde se guardan los datos.

**Main.java:**
Creamos el menú principal que ve el usuario (Front-End).
El menú permite registrar auto, buscar por patente, cambiar estado y listar todos los autos.
Conectamos Main con Auto usando el HashMap<String, Auto> con la patente como clave.
Probamos que buscar por patente funciona sin recorrer toda la lista.

**Que nos trabo?:** Al principio no entendíamos cómo conectar Main con Auto, pero después entendimos que Main pide los datos y Auto los guarda.

**Que sigue** Ejecutar main java y auto java en eclipse, subir pruebas realizadas y modificar el readme dando la conclusion

## jueves 19/11 (día 11)

#Que hicimos#

### Ejecución exitosa de Main.java en Eclipse

Hoy ejecutamos el `Main.java` en Eclipse y el programa funcionó con éxito.

Probamos el menú completo:
1. Ingresar auto: cargamos un auto con patente, marca, modelo, dueño y problema. Se guardó con estado "En espera".
2. Buscar y cambiar estado: buscamos por patente, se mostraron los datos y cambiamos el estado.
3. Listar todos: mostró todos los autos cargados.
4. Reporte ordenado por patente: mostró los autos ordenados de menor a mayor con `TreeMap`.
5. Retirar auto: retiramos un auto por patente y ya no apareció en el listado.
6. Salir: mostró "Chau!" y cerró el programa.

También probamos las validaciones: no dejó cargar una patente vacía, no dejó repetir una patente que ya existía, y cuando buscamos una patente que no existe mostró "No se encontro esa patente".

Que nos trabó: Al principio no sabíamos si había que ejecutar `Auto.java` o `Main.java`, pero después entendimos que solo se ejecuta `Main.java` porque es la que tiene el `main()` y es la que crea los objetos de `Auto`.

Estado: Main.java ejecutado con éxito en Eclipse. Se suben las capturas de las pruebas a la carpeta `Pruebas`.

Que sigue: Terminar de subir las capturas.
