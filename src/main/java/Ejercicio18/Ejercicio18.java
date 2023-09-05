
package Ejercicio18;
import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        double Codigoempleado,Salariobruto,Salarioneto,Retención;
        String Nombre;
        double Horastrabajadasmes;
        double Valorhoratrabajada;
        double Pretencionenlafuente;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese El codigo del empleado: ");
        Codigoempleado = entrada.nextInt();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Ingrese El Nombre del empleado: ");
        Nombre = entrada2.nextLine();
        
     
        System.out.println("Ingrese Las horas trabajadas al mes: ");
        Horastrabajadasmes = entrada.nextDouble();
        
    
        System.out.println("Ingrese el valor de la hora trabajada: ");
        Valorhoratrabajada = entrada.nextDouble();
        
       
        System.out.println("Ingrese el porcentaje de retención en la fuente: "+ "%");
        Pretencionenlafuente = entrada.nextDouble();
        Pretencionenlafuente = Pretencionenlafuente/100;
        Salariobruto = Horastrabajadasmes * Valorhoratrabajada;
        Retención = Salariobruto * Pretencionenlafuente;
        Salarioneto = Salariobruto - Retención;
        
        
        System.out.println("Codigo: "+Codigoempleado);
        System.out.println("Nombre: "+ Nombre);
        System.out.println("Salario bruto: ");
        if (Salariobruto > 1000000) {
            System.out.format("%f%n",Salariobruto);
        } else {
            System.out.println(Salariobruto);
            }
        System.out.println("Salario neto: ");
        if (Salarioneto > 1000000) { 
            System.out.format("%f%n",Salarioneto);
        } else {
            System.out.println(Salarioneto);
        }
                
    }
}
 
