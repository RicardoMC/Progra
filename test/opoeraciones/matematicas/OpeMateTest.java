/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package opoeraciones.matematicas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Laboratorio3Pc5
 */
public class OpeMateTest
{
    
    public OpeMateTest() 
    {
        
    }
    
    @Test
    public void sumaEnterosPositivos()
    {
        OpeMate opeMat = new OpeMate();
        int entrada1 = 5;
        int entrada2 = 10;
        int resultado = entrada1 + entrada2;
        assertEquals(resultado-5,opeMat.sumar(entrada1, entrada2));
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
