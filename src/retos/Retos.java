/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Retos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Juan tiene N cantidad de pesos, Camila tiene la mitad de lo que posee Juan y Ricardo 
        tiene la mitad de lo que poseen Camila y Juan Juntos.¿Puede JAVA ayudarme a calcular la cantidad de 
        dinero de los 3?*/
        
        
        //Entradas
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de dinero de Juan: ");
        int dineroJuan= entrada.nextInt();
        
        //Proceso
        int dineroCamila=dineroJuan/2;
        int dineroRicardo=(dineroJuan+dineroCamila)/2;
        
        //Salidas
        System.out.println("El dinero de juan es: "+dineroJuan);
        System.out.println("El dinero de camila es: "+dineroCamila);
        System.out.println("El dinero de ricardo es: "+dineroRicardo);*/
        
        
        
        
        
      
        /*Una compañía de software contable, paga a su personal de ventas un salario de 3500000 mensuales, 
        mas una comisión de 1500000 por cada licencia de software vendida menos el 5% de deducciones por impuestos. 
        Codifica un programa que calcule e imprima el salario mensual de un vendedor dado;*/
        
        //ENTRADAS
        final int SALARIO_BASE=3500000;
        final int VALOR_COMISION=1500000;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de ventas: ");
        int cantidadVentas=entrada.nextInt();
        
        //PROCESO
        double valorDeduccion=(cantidadVentas*VALOR_COMISION)*0.05;
        
        double comisionDeducida=(cantidadVentas*VALOR_COMISION)-valorDeduccion;
        
        float salarioTotal= (float)(SALARIO_BASE+comisionDeducida);
        
        //SALIDA
        System.out.println("Su salario es: "+salarioTotal);
        
        
        
        
        
        
        
        
        /*Hallar la edad de Pedro, sabiendo que dentro de 11 años tendrá la mitad del cuadrado de la edad que 
        tenia hace 13 años*/
        
        
        
        /*En una finca entre gallinas y conejos, se cuentan 50 cabezas y 140 patas 
        ¿Cuántas gallinas y conejos hay en la granja?*/
        
        
        
        
        
        /* Un terreno cuadrado tiene un área de N m2 ¿Cuántos metros de alambre se necesitan para cercarlo?*/
 
        
        
        
        
        
        
        
        
        
    }
    
}
