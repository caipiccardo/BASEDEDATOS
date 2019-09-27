package modelo;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {
    @Test
    public void testModificar(){
        System.out.println("Modificar");
        Dato dato = new Dato("d001", "Dato1");
        BaseDeDatos instance = new BaseDeDatos();
        instance.agregar(dato);
        boolean esperado = true;
        boolean obtenido = instance.modificar(dato);
        Assert.assertEquals(esperado, obtenido);
    }
}
