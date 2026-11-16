import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Auto> autos = new HashMap<>();
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("=== TALLER MECANICO ===");
            System.out.println("1- Ingresar auto");
            System.out.println("2- Buscar y cambiar estado");
            System.out.println("3- Listar todos");
            System.out.println("4- Reporte ordenado por patente");
            System.out.println("5- Retirar auto");
            System.out.println("6- Salir");
            System.out.print("Elegi: ");
            opcion = sc.nextInt();
            sc.nextLine();

            // CODIGO 1
            if (opcion == 1) {
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
                    autos.put(patente, new Auto(patente, marca, modelo, duenio, problema));
                    System.out.println("Auto agregado!");
                }
            }

            // CODIGO 2
            if (opcion == 2) {
                System.out.print("Patente a buscar: ");
                String buscar = sc.nextLine().toUpperCase();
                Auto encontrado = autos.get(buscar);
                if (encontrado == null) {
                    System.out.println("No se encontro esa patente.");
                } else {
                    encontrado.mostrarDatos();
                    System.out.print("Nuevo estado: ");
                    String nuevoEstado = sc.nextLine();
                    encontrado.setEstado(nuevoEstado);
                    System.out.println("Estado cambiado a: " + encontrado.getEstado());
                }
            }

            // CODIGO 3
            if (opcion == 3) {
                if (autos.isEmpty()) {
                    System.out.println("No hay autos cargados.");
                } else {
                    for (Auto a : autos.values()) {
                        a.mostrarDatos();
                    }
                }
            }

            // CODIGO 4
            if (opcion == 4) {
                Map<String, Auto> ordenados = new TreeMap<>(autos);
                for (Auto a : ordenados.values()) {
                    a.mostrarDatos();
                }
            }

            // CODIGO 5
            if (opcion == 5) {
                System.out.print("Patente a retirar: ");
                String retirar = sc.nextLine().toUpperCase();
                Auto sacado = autos.remove(retirar);
                if (sacado == null) {
                    System.out.println("No se encontro esa patente.");
                } else {
                    System.out.println("Auto retirado:");
                    sacado.mostrarDatos();
                }
            }
        }
        System.out.println("Chau!");
        sc.close();
    }
}
