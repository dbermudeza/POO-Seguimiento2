package com.mycompany.ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        int pesoA, pesoB, pesoC, pesoD;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el peso de la bola A: ");
        pesoA = entrada.nextInt();
        System.out.println("Ingrese el peso de la bola B: ");
        pesoB = entrada.nextInt();
        System.out.println("Ingrese el peso de la bola C: ");
        pesoC = entrada.nextInt();
        System.out.println("Ingrese el peso de la bola D: ");
        pesoD = entrada.nextInt();
        
        if (pesoA == pesoB) {
            if (pesoA == pesoC) {
                System.out.println("D es de diferente peso"); 
                if (pesoD>pesoA) {
                    System.out.println("D es de mayor peso");
                } else {
                    System.out.println("D es de menor peso");
                }
            } else if (pesoA == pesoD) {
                System.out.println("C es de diferente peso"); 
                if (pesoC>pesoA) {
                    System.out.println("C es de mayor peso");
                } else {
                    System.out.println("C es de menor peso");
                }
            }
        } else if (pesoA == pesoC) {
            if (pesoA == pesoD) {
                System.out.println("B es de diferente peso");
                if (pesoB>pesoA) {
                    System.out.println("B es de mayor peso");
                } else {
                    System.out.println("B es de menor peso");
                }
            }
        } else {
            System.out.println("A es de diferente peso");
            if (pesoA>pesoB) {
                    System.out.println("A es de mayor peso");
                } else {
                    System.out.println("A es de menor peso");
                }
        }
    }
}
