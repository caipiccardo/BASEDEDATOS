package modelo;

import org.junit.Assert;
import org.junit.Test;

public class TestAgregar {
   
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Dato dato = new Dato("d001", "Dato1");
        BaseDeDatos instance = new BaseDeDatos();
        boolean esperado = true;
        boolean obtenido = instance.agregar(dato);
        Assert.assertEquals(esperado, obtenido);
    }
    
}
