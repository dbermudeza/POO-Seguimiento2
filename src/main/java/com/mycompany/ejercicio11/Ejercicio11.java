package com.mycompany.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        /*N1: Valor del primer número a entrar.
        N2: Valor del segundo número.
        N3: Valor del tercer número.
        MAYOR: Variable que almacenará el valor mayor entre N1, N2 y N3.*/
        double N1, N2, N3, Mayor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del numero A:  ");
        N1 = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del numero B:  ");
        N2 = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del numero B:  ");
        N3 = entrada.nextDouble();
        
        if ((N1 > N2)&&(N1 > N3))
            Mayor = N1;
            
        else if (N2 > N3)
            Mayor = N2;
            
        else
            Mayor = N3;
        System.out.println("El mayor entre "+ N1+", "+N2+" y "+N3+" es: "+Mayor);
        
    }
}
