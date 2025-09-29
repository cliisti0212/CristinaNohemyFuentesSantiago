/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana1_java;

/**
 *
 * @author fuent
 */
import java.util.Random;
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Random aleatorio = new Random();
        int secreto = aleatorio.nextInt(100) + 1;
        int intentos = 0;
        
        System.out.println("===ADIVINA EL NUMERO======");
        System.out.println("Adivina el numero entre 1 y 100");

        while (true) {
            System.out.print("Tu intento: ");
            int x = datos.nextInt();
            if (x <= 0) {
            System.out.println("El número debe ser mayor a 0 y positivo");
             } else {
                intentos++;
            }
            

            if (x == secreto) {
                System.out.println("Felicidades Lo lograste en " + intentos + " intentos.");
                break;
            } else if (x > secreto) {
                System.out.println("Demasiado alto.");
            } else {
                System.out.println("Demasiado bajo.");
            }
        }
        datos.close();
    }
    
}
