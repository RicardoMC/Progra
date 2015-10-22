/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opoeraciones.matematicas;

/**
 * @author RicardoMaldonadoCastro
 */
import java.util.InputMismatchException; 
import java.util.Scanner;

public class OpeMate 
{
    int entrada1;
    int entrada2;

    public double sumar(double a, double b)
    {
        return a + b;
    }

    public double restar(double a, double b)
    {
        return a - b;
    }

    public double multiplicar(double a, double b)
    {
        return a * b;
    }

    public double dividir(double a, double b) 
    {
        return a / b;

    }

    public double modulo(double a, double b)
    {
        return a % b;
    }

    public double porcentaje(double a, double b)
    {
        return (b / 100) * a;
    }

    public double exponente(double a, double b)
    {
        return (int) Math.pow(a, b);
    }

    public double raiz(double a, double b)
    {
        return (int) Math.sqrt(a);
    }

    private void mostrarMenu()
    {
        System.out.println(" Usted puede realizar las siguientes "
                + "operaciones matematicas");
        System.out.println(" 1.- Sumar");
        System.out.println(" 2.- Restar");
        System.out.println(" 3.- Multiplicar");
        System.out.println(" 4.- Dividir");
        System.out.println(" 5.- Modulo");
        System.out.println(" 6.- Porcentaje");
        System.out.println(" 7.- Exponente");
        System.out.println(" 8.- Raiz");
        System.out.println(" 0.- salir del menu");
        System.out.println(" Introdusca el numero de la operacion "
                + "matematica que decea realizar");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int operacion = 0;
        do 
        {
            OpeMate oM = new OpeMate();//se crea el objeto operacion matematica oM
            oM.mostrarMenu(); //se llama al metodo mostrarMenu
            
            try 
            {
                Scanner mostrar = new Scanner(System.in); //se crea un scanner 
                System.out.println();
                operacion = mostrar.nextInt();

                if (operacion != 0)
                {
                    System.out.println("Ingrese el primer numero: ");
                    int entrada1 = mostrar.nextInt(); //ingresa el primer 
                    //numero mediante scanner

                    System.out.println("Ingrese el segundo numero: ");
                    int entrada2 = mostrar.nextInt();

                    switch (operacion)//se ingresa la variable que creamos 
                    {
                        case 1:
                            System.out.println("El total es: "
                                    + oM.sumar(entrada1, entrada2));
                            System.out.println();
                            break;

                        case 2:
                            System.out.println("El total es: "
                                    + oM.restar(entrada1, entrada2));
                            System.out.println();
                            break;

                        case 3:
                            System.out.println("El total es: "
                                    + oM.multiplicar(entrada1, entrada2));
                            System.out.println();
                            break;

                        case 4:
                            System.out.println("El total es: "
                                    + oM.dividir(entrada1, entrada2));
                            System.out.println();
                            break;

                        case 5:
                            System.out.println("El total es: "
                                    + oM.modulo(entrada1, entrada2));
                            System.out.println();
                            break;

                        case 6:
                            
                            System.out.println("El total es: "
                                    + oM.porcentaje(entrada2, entrada2)+"%");
                            System.out.println();
                            break;

                        case 7:
                            System.out.println("El total es: "
                                    + oM.exponente(entrada2, entrada2));
                            System.out.println();
                            break;

                        case 8:
                            System.out.println("El total es: "
                                    + oM.raiz(entrada2, entrada2));
                            System.out.println();
                            break;
                        
                    }
                }
            } 
            catch (InputMismatchException error )//controla la entrada de una letra
            {
                System.out.println("Solo se permite numeros " + error);
            }
            catch( ArithmeticException valor)//controla la division entre ceo     
            {
                System.out.println("No se puede dividir entre Cero " + valor);
            }
            catch(NumberFormatException num)
            {
                System.out.println("No esta dentro el rango del menu "+ num);
            }
        } while (operacion != 0);
        
        System.out.println("Gracias por utilizar el programa");
    }
}
