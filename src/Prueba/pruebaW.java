/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

/**
 *
 * @author Laboratorio5Pc11
 */
public class pruebaW
{
    
    public static void main(String [] args)
    {
        int a = 5;
        int b = 5;
         a*=b++;
         System.out.println("esto es a:" + a);
         System.out.println("esto es b:" + b);
         a*=++b;
         System.out.println("esto es a:" + a);
         System.out.println("esto es b:" + b);
        //1) diferencia en  i++ o ....++i
        //2) diferencia entre while y do while
        //3) la condicional es la misma? while,for, for each
        //4) diferencia entre break y continue
       /** int a = 0;
        while(a<5)
        {
            System.out.println("a");
            a++;
        }*/
                     
       /**int i ;
        for(i=0; i <2; i++)
        {
            int j = 0;
            while(j<5)
            {
                if(j < 2)
                {
                    System.out.println("IF j: " + j);
                }
                else
                {
                    System.out.println("Rompemos j: " + j);
                    //continue;
                    //break;
                }
                j++;
                
            }
            System.out.println("Ciclo for: " + i);       
                       // break;
                        continue;

        }*/
        /**int verificar = 0;
        
        while(verificar <= 100)
        {
            if(verificar == 52)
            {
                System.out.println("Hola mundo");
                 
            }
           
            System.out.println(verificar);
             
            verificar++;
        }
        System.out.println();*/
       
    }
}

