
package ejercicio2guia1;

import java.util.ArrayList;
import modelo.BaseDeDatos;
import modelo.Dato;

public class Ejercicio2guia1 {

    public static void main(String[] args) {
        BaseDeDatos bd = new BaseDeDatos();
        Dato dato;
        String id;
        
        dato = new Dato("d001", "Datos1");
        bd.agregar(dato);
        dato = new Dato("d002", "Datos2");
        bd.agregar(dato);
        dato = new Dato("d003", "Datos3");
        bd.agregar(dato);
        
        ListarDatos(bd.listar());
        
        System.out.println("...........MODIFICAR........");
        
        dato = new Dato("d003", "Datos Tres");
        bd.modificar(dato);
        ListarDatos(bd.listar());
        
        System.out.println("...........ELIMINAR........");
        
        id = "d002";
        bd.eliminar(id);
        ListarDatos(bd.listar());
        
    }
    
        public static void ListarDatos(ArrayList<Dato> datos){
             for (Dato d : datos) {
             System.out.println("Id :"+d.getId());
             System.out.println("Dato :"+d.getData());
       
                 System.out.println("-----------------");
        }
    }
    
}
