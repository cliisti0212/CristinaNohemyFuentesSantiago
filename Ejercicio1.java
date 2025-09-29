/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author fuent
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double saldo = 500.00;
        int opcion;

        do {
            System.out.println("=============================");
            System.out.println("        Cajero Automatico    ");
            System.out.println("=============================");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("=============================");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("\nSaldo actual: %.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("\nIngrese la cantidad a depositar: $");
                    double deposito = entrada.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("\nDeposito exitoso. Nuevo saldo: %.2f%n", saldo);
                    } else {
                        System.out.println("Cantidad inválida");
                    }
                    break;
                case 3:
                    System.out.print("\nIngrese la cantidad a retirar: $");
                    double retiro = entrada.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.printf("\nRetiro exitoso. Nuevo saldo: %.2f%n", saldo);
                    } else {
                        System.out.println("Cantidad inválida o fondos insuficientes");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción invalida intenta de nuevo");
            }
            System.out.println("");
        } while (opcion != 4);
        entrada.close();
    }   
}
