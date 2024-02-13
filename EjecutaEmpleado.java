/**
 * Se encarga instanciar y posteriormente publicar la informacion pasada como parametro a un ojbeto de clase Empleado.
 * 
 * @author: Yago Alberto Ayala.
 * @version: 1.0.
 */

public class EjecutaEmpleado
{
    public static void main (String [] args){
        Empleado empleado1=new Empleado(1265679876,"Sanchez", "Juan", 100000, 1992);
        empleado1.Mostrar();
        
    }
    
}
