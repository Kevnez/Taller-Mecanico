// 1 - INGRESAR AUTO
System.out.print("Patente: ");
String patente = sc.nextLine().toUpperCase();

if (patente.isEmpty()) {
    System.out.println("Error: la patente no puede estar vacia.");
} else if (autos.containsKey(patente)) {
    System.out.println("Error: esa patente ya existe.");
} else {
    System.out.print("Marca: ");
    String marca = sc.nextLine();
    System.out.print("Modelo: ");
    String modelo = sc.nextLine();
    System.out.print("Dueño: ");
    String duenio = sc.nextLine();
    System.out.print("Problema: ");
    String problema = sc.nextLine();

    if (marca.isEmpty() || modelo.isEmpty() || duenio.isEmpty() || problema.isEmpty()) {
        System.out.println("Error: un dato esta mal / vacio.");
    } else {
        autos.put(patente, new Auto(patente, marca, modelo, duenio, problema));
        System.out.println("Auto agregado!");
    }
}
