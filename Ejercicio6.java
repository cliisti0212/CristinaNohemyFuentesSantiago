/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana1_java;

/**
 *
 * @author fuent
 */
import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int numero;
        do {
            System.out.println("=================");
            System.out.println("PROMEDIO NOTAS");
            System.out.println("=================");
            System.out.print("Ingrese los estudiantes evaluados: ");
            numero = datos.nextInt();
            
            if (numero <= 0) {
            System.out.println("Tiene que haber minimo un estudiante");
             } else {
                double suma = 0.0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= numero; i++) {
            double nota;
            do {
                System.out.print("Nota del estudiante " + i + ": ");
                while (!datos.hasNextDouble()) { 
                    System.out.print("Número válido: "); 
                    datos.next(); 
                }
                nota = datos.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Error: la nota debe estar entre 0 y 10.");
                }
            } while (nota < 0 || nota > 10);

            suma += nota;
            if (nota > max) max = nota;
            if (nota < min) min = nota;
        }

        double promedio = suma / numero;
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.printf("Nota mas alta: %.2f%n", max);
        System.out.printf("Nota mas baja: %.2f%n", min);
            }
        } while (numero < 1);
        datos.close();
    }
    
}
