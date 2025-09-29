/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author fuent
 */
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        int opcion;
        
        do {
            System.out.println("====================================");
            System.out.println("        Calculadora Avanzada        ");
            System.out.println("====================================");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = datos.nextInt();
            
            switch (opcion){
                case 1: 
                    System.out.println("\nIngresa el primer número: ");
                    double suma1 = datos.nextDouble();
                    System.out.println("Ingresa el segundo número: ");
                    double suma2 = datos.nextDouble();
                    System.out.println("Resultado: " + (suma1 + suma2));
                    break;
                case 2: 
                    System.out.println("\nIngresa el primer número: ");
                    double resta1 = datos.nextDouble();
                    System.out.println("Ingresa el segundo número: ");
                    double resta2 = datos.nextDouble();
                    System.out.println("Resultado: " + (resta1 - resta2));
                    break;
                case 3:
                    System.out.println("\nIngresa el primer número: ");
                    double mult1 = datos.nextDouble();
                    System.out.println("Ingresa el segundo número: ");
                    double mult2 = datos.nextDouble();
                    System.out.println("Resultado: " + (mult1 * mult2));
                    break;
                case 4:
                    System.out.println("\nIngresa el primer número: ");
                    double div1 = datos.nextDouble();
                    System.out.println("Ingresa el segundo número: ");
                    double div2 = datos.nextDouble();
                    if (div2 != 0) {
                        System.out.println("Resultado: " + (div1 / div2));
                    }else {
                        System.out.println("No se puede dividir entre cero");
                    }
                    break;
                case 5:
                    System.out.println("\nIngresa la base: ");
                    double base = datos.nextDouble();
                    System.out.println("Ingresa el exponente: ");
                    double exponente = datos.nextDouble();
                    System.out.println("Resultado: " + Math.pow(base, exponente));
                    break;
                case 6:
                    System.out.println("\nIngresa el número: ");
                    double num = datos.nextDouble();
                    if (num >= 0) {
                        System.out.println("Resultado: " + Math.sqrt(num));
                    } else {
                        System.out.println("No se puede calcular la raíz");
                    }
                    break;
                case 7:
                    System.out.println("Saliendo de la calculadora");
                    break;
                default:
                    System.out.println("Opción inválida, intenta nuevamente");
            }
        } while (opcion != 7);
    }
}
