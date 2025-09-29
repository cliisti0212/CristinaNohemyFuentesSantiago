/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

/**
 *
 * @author fuent
 */
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de términos de la serie Fibonacci: ");
        int numero = datos.nextInt();
        
        if (numero <= 0) {
            System.out.println("Por favor, ingrese  un número mayor a 0");
        } else{
            System.out.println("Serie Fibonnacci con " + numero + " términos: ");
        }
        
        int a = 0, b = 1;
        for (int i = 1; i <= numero; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        datos.close();
    }
}
