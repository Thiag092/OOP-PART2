import java.util.Scanner;
 
/**
 * Se encarga instanciar y posteriormente publicar la informacion pasada como parametro a un ojbeto de clase Laboratorio.
 * 
 * @author: Yago Alberto Ayala.
 * @version: 1.0.
 */

public class EjecutadorLab
{
    public static void main (String [] args){
    Laboratorio lab1= new Laboratorio("Colgate S.A.", "Junin 5240", "54-11-4239-8447");
    lab1.Mostrar();
    
}
}