
package com.mycompany.ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        double Valcomp, Valpag, Pdes;
        String Color;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra: ");
        Valcomp = entrada.nextDouble();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Ingrese el color de la bolita: ");
        Color = entrada2.nextLine();
        
        if (Color.equalsIgnoreCase("Blanco"))
            Pdes = 0;
         else if (Color.equalsIgnoreCase("Verde"))
            Pdes = 10;
        else if (Color.equalsIgnoreCase("Amarillo"))
            Pdes = 25;
        else if (Color.equalsIgnoreCase("Azul"))
            Pdes = 50;
        else
            Pdes = 100;
        Valpag = Valcomp - ((Pdes*Valcomp)/100);
        System.out.println("El cliente debe pagar: $"+ Valpag);
                    
                    
    }
}
