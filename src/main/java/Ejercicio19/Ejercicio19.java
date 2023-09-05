package Ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        double Lado, Altura, Perimetro, Area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado del triangulo: ");
        Lado = entrada.nextDouble();
        
        Altura = (Lado*Math.sqrt(3))/2;
        Area = (Math.pow(Lado,2)*Math.sqrt(3))/4;
        Perimetro = 3*Lado;
        
        
        System.out.println("La altura del triangulo es: "+Math.round(Altura*1000.0)/1000.0);
        System.out.println("El área del triangulo es: "+Math.round(Area*1000.0)/1000.0);
        System.out.println("El Perímetro del triangulo es: "+Perimetro);
        
        
    }
}
