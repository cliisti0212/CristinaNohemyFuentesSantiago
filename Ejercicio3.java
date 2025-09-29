/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author fuent
 */
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero positivo: ");
        int numero = entrada.nextInt();
        
        if (numero <= 1) {
            System.out.println("El número debe ser mayor a 1 y positivo");
        }else {
        boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i==0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println("El número " + numero+ " es primo"); 
            } else {
                System.out.println("El número " + numero+ " no es primo");
            }
        }
    }
}
