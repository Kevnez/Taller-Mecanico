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
            System.out.println("4- Reporte ordenado");
            System.out.println("5- Retirar auto");
            System.out.println("6- Salir");
            System.out.print("Elegi: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                // ACA PEGAS SOLO EL CODIGO 1
            }

            if (opcion == 2) {
                // ACA PEGAS SOLO EL CODIGO 2
            }

            if (opcion == 3) {
                // ACA PEGAS SOLO EL CODIGO 3
            }

            if (opcion == 4) {
                // ACA PEGAS SOLO EL CODIGO 4
            }

            if (opcion == 5) {
                // ACA PEGAS SOLO EL CODIGO 5
            }
        }
        System.out.println("Chau!");
        sc.close();
    }
}
