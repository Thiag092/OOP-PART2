/**
 * Se encarga instanciar y posteriormente publicar la informacion pasada como parametro a un ojbeto de clase Cliente.
 * 
 * @author: Yago Alberto Ayala.
 * @version: 1.0.
 */


public class EjecutaCliente
{
   public static void main (String [] args){
       
       Cliente cliente1 = new Cliente(24444333, "Juan", "Perez", 200);
       cliente1.Mostrar();
   }
}
