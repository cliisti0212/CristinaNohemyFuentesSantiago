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
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Calcular Factorial");
            System.out.print("Ingresa un numero entero positivo: ");
            numero = datos.nextInt();
            
             if (numero <= 0) {
            System.out.println("El número debe ser mayor a 0 y positivo");
             } else {
                 long fact = 1L;
        for (int i = 2; i <= numero; i++) fact *= i;

        System.out.println(numero + "! = " + fact);
        if (numero > 20) {
            System.out.println("Exede el limite permitido");
        }
             }
            
        } while (numero < 0);

        datos.close();
    }
    
}
