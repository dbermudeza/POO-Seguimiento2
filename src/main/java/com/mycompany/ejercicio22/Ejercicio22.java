package com.mycompany.ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        String nombre;
        int valorhora, horas, salario;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del trabajador: ");
        nombre = entrada.next();
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        horas = entrada.nextInt();
        System.out.println("Ingrese el salario por hora trabajada: ");
        valorhora = entrada.nextInt();
        salario = (horas*valorhora);
        
        if (salario>450000) {
            System.out.println("El nombre del trabajador es " + nombre + " y su salario es de $" + salario);
        } else {
            System.out.println("El nombre del trabajador es: " +  nombre);
        }
    }
}
