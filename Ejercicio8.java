/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana1_java;

/**
 *
 * @author fuent
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio8 {
    
    static class Producto {
        String nombre;
        double precio;
        int cantidad;

        Producto(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        @Override
        public String toString() {
            return String.format("%-20s | $%8.2f | %5d", nombre, precio, cantidad);
        }
    }
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        ArrayList<SistemaInventario.Producto> inventario = new ArrayList<>();
        int opcion;

        do {
            System.out.println("====================================");
            System.out.println("        Sistema Inventario        ");
            System.out.println("====================================");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Total del inventario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = datos.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = datos.nextLine().trim();
                    while (nombre.isEmpty()) { System.out.print("Nombre no vacío: "); nombre = datos.nextLine().trim(); }

                    double precio = leerDoubleNoNegativo(datos, "Precio: ");
                    int cantidad = leerEnteroNoNegativo(datos, "Cantidad: ");

                    inventario.add(new SistemaInventario.Producto(nombre, precio, cantidad));
                    System.out.println("Producto registrado.");
                    break;

                case 2:
                    if (inventario.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        System.out.println(String.format("%-20s | %-9s | %-5s", "Nombre", "Precio", "Cant."));
                        System.out.println("-----------------------------------------------");
                        for (SistemaInventario.Producto p : inventario) System.out.println(p);
                    }
                    break;

                case 3:
                    double total = 0.0;
                    for (SistemaInventario.Producto p : inventario) total += p.precio * p.cantidad;
                    System.out.printf("Valor total del inventario: $%.2f%n", total);
                    break;

                case 4:
                    System.out.println("Saliendo del inventario...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);
        datos.close();
    }

    private static double leerDoubleNoNegativo(Scanner datos, String etiqueta) {
        System.out.print(etiqueta);
        while (!datos.hasNextDouble()) { System.out.print("Número válido: "); datos.next(); }
        double v = datos.nextDouble();
        while (v < 0) { System.out.print("Debe ser ≥ 0: "); while (!datos.hasNextDouble()) { System.out.print("Número válido: "); datos.next(); } v = datos.nextDouble(); }
        return v;
    }

    private static int leerEnteroNoNegativo(Scanner datos, String etiqueta) {
        System.out.print(etiqueta);
        while (!datos.hasNextInt()) { System.out.print("Entero válido: "); datos.next(); }
        int v = datos.nextInt();
        while (v < 0) { System.out.print("Debe ser ≥ 0: "); while (!datos.hasNextInt()) { System.out.print("Entero válido: "); datos.next(); } v = datos.nextInt(); }
        return v;
    }
    
}
