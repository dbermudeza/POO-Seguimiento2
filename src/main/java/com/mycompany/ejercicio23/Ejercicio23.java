
package com.mycompany.ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        int a, b, c;
        double solucion1, solucion2;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Ingrese el valor de A: ");
        a = entrada.nextInt();
        System.out.println("Ingrese el valor de B: ");
        b = entrada.nextInt();
        System.out.println("Ingrese el valor de C: ");
        c = entrada.nextInt();
        
        solucion1 = (-b + (Math.sqrt((Math.pow(b, 2)-4*(a*c)))))/(2*a);
        solucion2 = (-b - (Math.sqrt((Math.pow(b, 2)-4*(a*c)))))/(2*a);
        
        System.out.println("La primera posible solución para la ecuación es: " + solucion1);
        System.out.println("La otra posible solución para la ecuación es: " + solucion2);
    }
}
