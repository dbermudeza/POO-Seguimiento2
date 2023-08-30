/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebafiguras;

public class TrianguloRectangulo {
    int base, altura;
    
    public TrianguloRectangulo(int base, int altura) {
        this.base= base;
        this.altura= altura;
    }
    
    double CalcularArea() {
        return(base*altura/2);
    }
    
    double CalcularPerimetro() {
        return(base+altura+CalcularHipotenusa());
    }
    
    double CalcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }
    
    void determinarTipoTriangulo() {
        if((base==altura)&&(base==CalcularHipotenusa())&&(altura==CalcularHipotenusa()))
            System.out.println("Es un triángulo equilátero");
        else if ((base!=altura)&&(base!=CalcularHipotenusa())&&(altura!=CalcularHipotenusa()))
            System.out.println("Es un triángulo escaleno");
        else
            System.out.println("Es un triángulo isósceles");
        
    }
}
