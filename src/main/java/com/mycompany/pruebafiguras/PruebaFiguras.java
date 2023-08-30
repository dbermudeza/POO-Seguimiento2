
package com.mycompany.pruebafiguras;

public class PruebaFiguras {

    public static void main(String[] args) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        
        System.out.println("El área del círculo es: " + figura1.calcularArea());
        System.out.println("El perimetro del círulo es: " + figura1.calcularPerimetro());
        System.out.println("El área del rectángulo es: " + figura2.calcularArea());
        System.out.println("El perímetro del rectñangulo es: " + figura2.calcularPerimetro());
        System.out.println("El área del cuadrado es: " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es: " + figura3.calcularPerimetro());
        System.out.println("El área del triángulo es: " + figura4.CalcularArea());
        System.out.println("El perímetro del triángulo es: " + figura4.CalcularPerimetro());
        figura4.determinarTipoTriangulo();
    }
}
