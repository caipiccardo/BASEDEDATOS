
package modelo;

import java.util.ArrayList;

public class BaseDeDatos {
 
    private ArrayList<Dato> datos;
    
    public BaseDeDatos(){
        this.datos = new ArrayList<Dato>();
    }
    
    public boolean agregar(Dato dato){
        return this.datos.add(dato);
    }
    
    public boolean eliminar(String id){
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(id)) {
                datos.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Dato> listar(){
        return this.datos;
    }
    
    public boolean modificar(Dato dato){
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(dato.getId())) {
                datos.get(i).setData(dato.getData());
                return true;
            }
        }
        return false;
    }
    
    
    
}
