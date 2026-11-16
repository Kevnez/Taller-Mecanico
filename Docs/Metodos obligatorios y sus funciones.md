### 1. Clase Auto - Métodos obligatorios

| Método | ¿Qué hace? | ¿Qué devuelve? |
| --- | --- | --- |
| Auto(...) | Constructor. Crea un auto nuevo con todos sus datos. | Crea el objeto |
| getPatente() | Devuelve la patente. Se usa para buscar en el HashMap. | String patente |
| getMarca() | Devuelve la marca del auto. | String marca |
| getModelo() | Devuelve el modelo del auto. | String modelo |
| getDuenio() | Devuelve el nombre del dueño. | String duenio |
| getProblema() | Devuelve el problema del auto. | String problema |
| getEstado() | Devuelve el estado: En espera, En reparación o Listo. | String estado |
| setEstado(String estado) | Cambia el estado del auto. | Nada, solo cambia el dato |
| mostrarDatos() | Muestra por pantalla todos los datos del auto. | Nada, imprime |

### 2. Clase Main - Métodos obligatorios

| Método | ¿Qué hace? | ¿Qué devuelve? |
| --- | --- | --- |
| main(String[] args) | Arranca el programa, crea el HashMap y el Scanner y muestra el menú. | Nada |
| mostrarMenu() | Muestra el menú: 1. Registrar, 2. Buscar, 3. Cambiar estado, 4. Mostrar todos, 5. Salir. | Nada |
| registrarAuto() | Pide datos por teclado, crea un Auto y lo guarda con put(patente, auto). Si la patente ya existe, muestra error. | Nada |
| buscarAuto(String patente) | Busca un auto por patente con autos.get(patente). Si lo encuentra muestra sus datos, si no muestra Auto no encontrado. | Auto o null |
| cambiarEstado(String patente, String nuevoEstado) | Busca el auto y le cambia el estado con setEstado(). | Nada |
| mostrarTodos() | Recorre el HashMap y muestra todos los autos con mostrarDatos(). Si está vacío muestra No hay autos. | Nada |
