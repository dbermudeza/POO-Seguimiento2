
package com.mycompany.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        int patrimonio, matricula;
        byte estrato;
        String nombre, inscripcion;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese su número de inscripción: ");
        inscripcion = entrada.next();
        System.out.println("Ingrese su patrimonio: ");
        patrimonio = entrada.nextInt();
        System.out.println("Ingrese su estrato: ");
        estrato = entrada.nextByte();
        matricula = 50000;
        
        if ((patrimonio > 2000000)&&(estrato > 3))
            matricula= matricula+((patrimonio*3)/100);
        
        System.out.println("El estudiante con nombre " + nombre + " y número de inscripción " + inscripcion + " debe pagar $" + matricula);
    }
}
