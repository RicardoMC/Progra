/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opoeraciones.matematicas;

/**
 * @RicardoMaldonadoCastro
 */
import java.util.InputMismatchException; 
import java.util.Scanner; //se importa scanner

public class OpeMate
{

    int entrada1;
    int entrada2;

    public int sumar(int a, int b) 
    {
        return a + b;
    }

    public int restar(int a, int b)
    {
        return a - b;
    }

    public int multiplicar(int a, int b)
    {
        return a * b;
    }

    public int dividir(int a, int b)
    {
        return a / b;
        
    }

    public int modulo(int a, int b)
    {
        return a % b;
    }
    
    public double porcentaje(double a , double b)
    {
        return  (a/100)*b;
    }
    
    public int exponente(int a, int b )
    {
        return (int) Math.pow(a,b);
    }
    
    public int raiz(int a, int b)
    {
        return (int) Math.sqrt(a);
    }

    private void mostrarMenu()
    {
        System.out.println(" Usted puede realizar las siguientes operaciones matematicas");
        System.out.println(" 1.- Sumar");
        System.out.println(" 2.- Restar");
        System.out.println(" 3.- Multiplicar");
        System.out.println(" 4.- Dividir");
        System.out.println(" 5.- Modulo");
        System.out.println(" 6.- Porcentaje");
        System.out.println(" 7.- Exponente");
        System.out.println(" 8.- Fraccion");
        System.out.println(" 0.- salir del menu");
        System.out.println(" Introdusca el numero de la operacion matematica que decea realizar");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int operacion;
        do {

            OpeMate oM = new OpeMate(); //se crea el objeto operacion matematica oM
            oM.mostrarMenu(); //se llama al metodo mostrarMenu

            Scanner mostrar = new Scanner(System.in); //se crea un scanner 
            System.out.println();
            operacion = mostrar.nextInt();

            if (operacion != 0) 
            {
                System.out.println("Ingrese el primer numero: ");
                int entrada1 = mostrar.nextInt(); //ingresa el primer numero mediante scanner

                System.out.println("Ingrese el segundo numero: ");
                int entrada2 = mostrar.nextInt(); 

                switch (operacion)//se ingresa la variable que creamos 
                {
                    case 1:
                        try
                        {
                            System.out.println("El total es: " + oM.sumar(entrada1, entrada2));
                            System.out.println();
                        }
                        catch(InputMismatchException error)
                        {
                            System.out.println("Solo se permite numeros " + error);
                        }
                        break;

                    case 2:
                        System.out.println("El total es: " + oM.restar(entrada1, entrada2));
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("El total es: " + oM.multiplicar(entrada1, entrada2));
                        System.out.println();
                        break;

                    case 4:
                        try
                        {
                             System.out.println("El total es: " + oM.dividir(entrada1, entrada2));
                             System.out.println();
                        }
                        catch(ArithmeticException zero)
                        {
                            System.out.println("no se puede dividir entre cero " + zero);
                        }
                        break;

                    case 5:
                        System.out.println("El total es: " + oM.modulo(entrada1, entrada2));
                        System.out.println();
                        break;
                        
                    case 6:
                        System.out.println("El total es: " + oM.porcentaje(entrada2, entrada2));
                        System.out.println();
                        break;
                        
                    case 7:
                        System.out.println("El total es: " + oM.exponente(entrada2, entrada2));
                        System.out.println();
                        break;
                    case 8:
                        System.out.println("El total es: " + oM.raiz(entrada2, entrada2));
                        System.out.println();
                        break;
                }
            }
        } while (operacion != 0);

        System.out.println("Gracias por utilizar el programa");

    }
}
