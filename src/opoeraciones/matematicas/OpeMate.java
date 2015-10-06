/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opoeraciones.matematicas;

/**
 *
 * @author RicardoMaldonadoCastro
 */
import java.util.Scanner; //se importa scanner

public class OpeMate 
{
    int entrada1;
    int entrada2;
    
      
    private int sumar(int a , int b)
    {
        return a + b ;
    }
    
    private int restar(int a , int b)
    {
        return a - b ;
    }
    
    private int multiplicar(int a , int b)
    {
        return a * b ;
    }
    
    private int dividir(int a , int b)
    {
        return a / b ;
    }
    
    private int modulo(int a , int b)
    {
        return a % b ;
    }
    
    private void mostrarMenu()
    {
        System.out.println(" Usted puede realizar las siguientes operaciones matematicas");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        System.out.println("5.- Modulo");
        System.out.println(" Introdusca el numero de la operacion matematica que decea realizar");
                
    }
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       OpeMate oM = new OpeMate(); //se crea el objeto operacion matematica oM
       oM.mostrarMenu(); //se llama al metodo mostrarMenu
       
       Scanner mostrar = new Scanner(System.in); //se importa primero y luego se crea un scanner 
       System.out.println();
       System.out.println("La operacion que desea realizar es:");
       int operacion =  mostrar.nextInt(); //se crea una variable q sea igual al 
                                          // scanner para comparando enteros en el switch
       
        System.out.println("Ingrese el primer numero es:");
        int entrada1 = mostrar.nextInt(); //ingresa el primer numero mediante scanner
        
        System.out.println("Ingrese el segundo numero es:");
        int entrada2 = mostrar.nextInt(); //ingresa el segundo numero mediante scanner
        
        
       switch(operacion)//se ingresa la variable que creamos 
       {
           case 1: 
             System.out.println("El total es: " + oM.sumar(entrada1,entrada2));
            break;
               
           case 2: 
              System.out.println("El total es: " + oM.restar(entrada1,entrada2));
            break;
           
           case 3: 
              System.out.println("El total es: " + oM.multiplicar(entrada1,entrada2));
            break;
               
           case 4: 
              System.out.println("El total es: " + oM.dividir(entrada1,entrada2));
            break; 
               
           case 5: 
              System.out.println("El total es: " + oM.modulo(entrada1,entrada2));
            break;    
       }
       
        // TODO code application logic here
    }
    
}
