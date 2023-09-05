package Ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        double Lado1, Lado2, Lado3, Perimetro, SP, Area;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado 1 del triangulo: ");
        Lado1 = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del lado 2 del triangulo: ");
        Lado2 = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del lado 3 del triangulo: ");
        Lado3 = entrada.nextDouble();
        
        Perimetro = Lado1 + Lado2 + Lado3;
        SP = Perimetro/2;
        Area = Math.sqrt(SP*(SP-Lado1)*(SP-Lado2)*(SP-Lado3));
        
        System.out.println("El valor del área es: "+Area);
        System.out.println("El valor del perimetro es: "+Perimetro);
        System.out.println("El valor del semiperimetro es: "+SP);
    }
}
