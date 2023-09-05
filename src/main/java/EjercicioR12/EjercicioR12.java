package EjercicioR12;

import java.util.Scanner;

public class EjercicioR12 {

    public static void main(String[] args) {
        int NHT, VHN, HET, HEE8, Salario;
        String NOM;
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del trabajador: ");
        NOM = entrada2.nextLine();
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de horas trabajadas: ");
        NHT = entrada.nextInt();
        
        System.out.println("Ingrese el valor normal de la hora trabajada: ");
        VHN = entrada.nextInt();
        
        if (NHT > 40){
            HET = NHT-40;
                if (HET > 8){
                    HEE8 = HET - 8;
                        Salario = 40*VHN + 2*8*VHN + HEE8*3*VHN;
                }else{
                    Salario = 40*VHN + HET*2*VHN;
      }}else
            Salario = NHT*VHN;
        System.out.println("El trabajador: "+ NOM+" Devengó: $"+Salario);
                
              
            
                
                    
                
            
        
        
        
    }
}
