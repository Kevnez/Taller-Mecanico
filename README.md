# Taller-CesMar
Integrantes:

Cespedes Lautaro

Martínez Kevin

# Nombre del programa
 Taller CesMar

# Descripcion del proyecto
Es un sistema de gestión de autos en un taller mecánico que permite registrar cada auto que ingresa, buscarlo rápido por su patente, cambiar su estado y ver un reporte ordenado.

# Problema que resuelve
En el taller, los autos se anotaban en papel. Eso generaba problemas:
- Se perdía información del auto y del dueño.
- Costaba encontrar un auto por su patente.
- No se sabía en qué estado estaba cada reparación.
- Había autos duplicados por error.

# Solución propuesta

Tema elegido: clase 7 (Mapas)

Se eligió Mapas porque el dominio del problema tiene una clave única natural (la patente), donde se necesita búsqueda directa por esa clave sin recorrer toda la colección, se debe evitar duplicados y se necesita un reporte ordenado.
Se optó por HashMap para  garantizar una búsqueda rápida y TreeMap para garantizar orden.

# Herramientas y tecnologías
Java, GitHub, IntelliJ IDEA, Html

# Enlace del tablero
https://trello.com/b/KzqhINkf/mi-tablero-de-trello

# Intrucciones para ejecutar

Clonar el repositorio, abrir la carpeta en el IDE, ejecutar Main.java:

1- Ingresar auto con patente, marca, modelo, dueño y problema.

2- Buscar auto por patente y cambiar estado del auto

3- Listar todos los autos.

4- Ver reporte ordenado por patente.

5- Retirar auto.

El programa avisa cuando la patente ya existe o cuando un dato está mal.

# Estado del proyecto
En desarrollo - Falta terminar validaciones y pruebas.
## 2. Problema a resolver

