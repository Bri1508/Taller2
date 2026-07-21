/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author Brithany Juleixy Carrion Peralta
 */
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero en la posicion " + i);
            numeros[i] = teclado.nextInt();
        }

        System.out.println("VALORES ALMACENADOS");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }
}
