
package modelo;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String id = "d001";
        Dato dato = new Dato("d001", "Datos1");
        BaseDeDatos instance = new BaseDeDatos();
        instance.agregar(dato);
        boolean esperado = true;
        boolean obtenido = instance.eliminar(id);
        Assert.assertEquals(esperado, obtenido);
    }
}
