
/**
 * Se encarga instanciar y posteriormente publicar la informacion pasada como parametro a un ojbeto de clase Alumno.
 * 
 * @author: Yago Alberto Ayala.
 * @version: 1.0.
 */
public class EjecutaAlumno
{
    public static void main (String [] args){
        
        Alumno alumno1=new Alumno(34231123, "Yago", "Ayala");
        
        alumno1.Mostrar();
        
    }
}
