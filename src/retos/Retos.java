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
        /*final int SALARIO_BASE=3500000;
        final int VALOR_COMISION=1500000;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de ventas: ");
        int cantidadVentas=entrada.nextInt();
        
        //PROCESO
        double valorDeduccion=(cantidadVentas*VALOR_COMISION)*0.05;
        
        double comisionDeducida=(cantidadVentas*VALOR_COMISION)-valorDeduccion;
        
        float salarioTotal= (float)(SALARIO_BASE+comisionDeducida);
        
        //SALIDA
        System.out.println("Su salario es: "+salarioTotal);*/
        
        
        
        
      
        /*Hallar la edad de Pedro, sabiendo que dentro de 11 años tendrá la mitad del cuadrado de la edad que 
        tenia hace 13 años*/
        
        //AX2+BX+C
        
       
        
        /*Scanner entrada = new Scanner(System.in);
        
        //ENTRADAS
        
        System.out.println("Digite el coeficiente A: ");
        final int A=entrada.nextInt();
        
        System.out.println("Digite el coeficiente B: ");
        final int B=entrada.nextInt();
        
        System.out.println("Digite el coeficiente C: ");
        final int C=entrada.nextInt();
        
        
        //PROCESO
        double x1=((B*-1)+(Math.sqrt((Math.pow(B,2))-(4*A*C))))/(2*A);
        double x2=((B*-1)-(Math.sqrt((Math.pow(B,2))-(4*A*C))))/(2*A);
        
        //SALIDAS
        System.out.println("EL valor de x1 es: "+x1);
        System.out.println("EL valor de x2 es: "+x2);*/
        
        
        
        
        
     
        /*En una finca entre gallinas y conejos, se cuentan 50 cabezas y 140 patas 
        ¿Cuántas gallinas y conejos hay en la granja?*/
        
        //Ax+By=C
        //Dx+Ey=F
        
        
        
        
        
        /* Un terreno cuadrado tiene un área de N m2 ¿Cuántos metros de alambre se necesitan para cercarlo?*/
 
        //entradas
        /*Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el area: ");
        int area=entrada.nextInt();
        
        //PROCESO
        double lado=Math.sqrt(area);
        double cercado=lado*4;
        
        //salida
        System.out.println("la cantidad de alambre es de: "+cercado);*/
        
        
        
        /*Construir un programa que reciba números enteros y los sume mientras estos sean positivos, si se 
        digita un número negativo el programa debe terminar*/
        
        /*Scanner entrada = new Scanner(System.in);
        
        int numero=1;
        int contador=0;
        
        
        while(numero>=0){
            
            System.out.println("Por favor digite un numero entero: ");
            numero=entrada.nextInt();
            
            if(numero>=0){
                contador=contador+numero;
            }
            
                 
        }
        
        System.out.println("El contador quedo en: "+(contador));*/
        
        
        
        
        /*Codificar un programa que presente un menú de 4 opciones y reciba un numero natural  para realizar 
            las siguientes operaciones:
            0: Salida
            1: Encuentre si el número es múltiplo de 2
            2: Encuentre la raíz cuadrada del número
            3: Sume 100 al número ingresado
            4: Eleve a la 2 el número ingresado */ 
        
           /*int opcion;
           Scanner entrada = new Scanner(System.in);
           
           
        
           do{
               
               System.out.println("Bienvenido \n");
               
               System.out.println("0: Salida");
               System.out.println("1: Multiplo 2");
               System.out.println("2: raiz cuadrada");
               System.out.println("3: suma 100");
               System.out.println("4: potencia 2");
               
               System.out.print("Digite una opcion: ");
               opcion=entrada.nextInt();
               
               switch(opcion){
                   
                   case 0: 
                       break;
                       
                   case 1:
                       
                       System.out.print("\n Digite un numero entero: ");
                       int numero=entrada.nextInt();
                       
                       int resto= numero%2; //% operador modulo
                       
                       if(resto==0){
                           System.out.println("El "+numero+" es multiplo de 2");
                       }else{
                           System.out.println("El "+numero+" No es multiplo de 2");
                       } 
                       break;
                    
                   case 2:
                       
                       System.out.print("\n Digite un numero entero: ");
                       int numero2=entrada.nextInt();
                      
                       if(numero2>=0){
                           double raiz=Math.sqrt(numero2);
                           System.out.println("La raiz cuadrada de "+numero2+" es: "+ raiz);
                       }else{
                           System.out.println("Digite un número positivo");
                       }
                       
                    break;
                    
                   case 3:
                       System.out.print("\n Digite un numero entero: ");
                       int numero3=entrada.nextInt();
                       
                       System.out.println("El "+numero3+" +100="+(numero3+100));
                       
                    break;
                    
                   case 4:
                       
                       System.out.print("\n Digite un numero entero: ");
                       int numero4=entrada.nextInt();
                       
                       System.out.println("El numero "+numero4+"elevado a la 2 es: "+(Math.pow(numero4, 2)));
                       
                       break;
                     
                   
               }
               
           }while(opcion!=0);*/
        
        
        
        /* Mostrar los números del 1 al 200 saltando de 12 en 12(1,12,24…)*/
        
        /*for(int i=1; i<=200; i=i+12){
            
            System.out.println("Tabla de 12: 1");
            
            System.out.println("Tabla del 12: "+i);
            
       
        }*/
        
        
        /*Pedir 20 números y contar cuantos de los ingresados fueron negativos*/
        
        
        
    }
    
}
