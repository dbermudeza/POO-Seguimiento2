package com.mycompany.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        double NumeroA, NumeroB;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del numero A:  ");
        NumeroA = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del numero B:  ");
        NumeroB = entrada.nextDouble();
        
        if (NumeroA > NumeroB)
            System.out.println("El numero A es mayor al numero B");
        else if (NumeroA==NumeroB)
            System.out.println("El numero A es igual al B");
        else
            System.out.println("El numero A es menor al numero B");
        
    }
}
