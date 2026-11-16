System.out.print("Patente a buscar: ");
String buscar = sc.nextLine();
boolean encontrado = false;

for (Auto a : autos) {
    if (a.getPatente().equalsIgnoreCase(buscar)) {
        a.mostrarDatos();
        System.out.println("Nuevo estado (En espera / En reparacion / Listo): ");
        String nuevoEstado = sc.nextLine();
        a.setEstado(nuevoEstado);
        System.out.println("Estado cambiado a: " + a.getEstado());
        encontrado = true;
    }
}

if (!encontrado) {
    System.out.println("No se encontro esa patente.");
}
