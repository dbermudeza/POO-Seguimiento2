package Ejercicio24;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        double EsferaA, EsferaB, EsferaC, Mayor;
        String Esfm;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esferaA:  ");
        EsferaA = entrada.nextDouble();
        
        System.out.println("Ingrese el peso de la esferaB:  ");
        EsferaB = entrada.nextDouble();
        
        System.out.println("Ingrese el peso de la esferaC:  ");
        EsferaC = entrada.nextDouble();
        
        if ((EsferaA > EsferaB)&&(EsferaA > EsferaC)){
            Mayor = EsferaA;
            Esfm = "EsferaA";
            
        }else if (EsferaB > EsferaC){
            Mayor = EsferaB;
            Esfm = "EsferaB";
        }else{
            Mayor = EsferaC;
            Esfm = "EsferaC";
        }System.out.println("La esfera con mayor peso es:  "+Esfm+" Con un peso de: "+Mayor);
        
    }
}
    

