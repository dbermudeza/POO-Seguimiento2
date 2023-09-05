package com.mycompany.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        int ventas1, ventas2, ventas3, salario, salario1, salario2, salario3, totalventas;
        float pventas, psalario;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las ventas del departamento 1: ");
        ventas1 = entrada.nextInt();
        System.out.println("Ingrese las ventas del departamento 2: ");
        ventas2 = entrada.nextInt();
        System.out.println("Ingrese las ventas del departamento 3: ");
        ventas3 = entrada.nextInt();
        System.out.println("Ingrese el salario mensual de los trabajadores: ");
        salario = entrada.nextInt();
        
        salario1 = salario;
        salario2 = salario;
        salario3 = salario;
       
        totalventas = ventas1+ventas2+ventas3;
        pventas = (totalventas*33)/100;
        psalario = (salario*20)/100;
        
        if (ventas1>pventas) {
            salario1+=psalario;
        } 
        if (ventas2>pventas) {
            salario2+=psalario;
        } 
        if (ventas3>pventas) {
            salario3+=psalario;
        } 
        
        
        System.out.println("El salario del departamento 1 es: " + salario1);
        System.out.println("El salario del departamento 2 es: " + salario2);
        System.out.println("El salario del departamento 3 es: " + salario3);
        
   }
}
