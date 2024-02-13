
import java.util.*;

 /**
 * Abstraccion de un empleado al cual se le solicita diferentes datos personales para su posterior publicacion y manejo.
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
public class Empleado {
   //Definicion de los atributos de la clase Empleado------------------------------------------------
   
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private long anioIngreso;
 
    
    /**
     * Constructor de la clase Empleado.
     * 
     * @param: p_cuil: Numero de cuil del empelado de hasta 11 digitos.
     * @param: p_nombre: Nombre del empleado.
     * @param: p_apellido: Apellido del empleado.
     * @param: p_importe; Sueldo basico del empleado.
     * @param: p_anio: Anio de ingreso del empleado.
     * 
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, long p_anio){
       
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
       
        
    }
   
    //Definimos los setters de cada atributo-----------------------------------------
    
    /**
     * @param: p_cuil: Numero de cuil del empleado, de hasta 11 digitos.
     */
    private void setCuil(long p_cuil){
        this.cuil=p_cuil;
      }
    
      /**
       * @param: p_nombre: Nombre del empleado.
       */
    private void setNombre(String p_nombre){
        this.nombre=(p_nombre);
    }
    
    /**
     * @param: p_apellido: Apellido del empleado.
     */
    private void setApellido(String p_apellido){
        this.apellido=p_apellido;
    }
    
    /**
     * @param: p_importe; Sueldo basico del empleado.
     */
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico=p_sueldoBasico;
    }
    
    /**
     * @param: p_anio: Anio de ingreso del empleado.
     */
    private void setAnioIngreso(long p_anio){
        this.anioIngreso=p_anio;
    }
    
    //Ahora definimos los Getters de cada atributo:-------------------------------------
    
    /**
     * @return: Devuelve el numero de cuil del empleado.
     */
    public long getCuil(){
        return this.cuil;
      }
    
      /**
       * @return: Devuelve el nombre dle empleado.
       */
    public String getNombre(){
        return this.nombre;
     }
    
     /**
      * @return: Devuelve el apellido del empleado.
      */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * Devuelve el sueldo basico dle empleado.
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    /**
     * @return: Devuelve el anio de ingreso del empleado.
     */
    public long getAnioIngreso(){
        return anioIngreso;
    }
    
    /**
     * Calcula la antiguedad del empleado, obtenido como resultado de la resta dle anio actual con el de ingreso del mismo.
     * 
     * @return: antiguedad del empleado en la empresa.
     */
    public long Antiguedad(){
       
        Calendar fechaHoy = new GregorianCalendar();
        long anioHoy = fechaHoy.get(Calendar.YEAR);
       
        long antiguedad = anioHoy - anioIngreso;
        return antiguedad;
    }
   //----------------------------------------------------------------------------------------------------
   
   /**
    * Calcula el valor del sueldo basico, menos las deducciones por obra social y seguro de vida.
    * 
    * @return: Devuelve el nuevo sueldo basico menos las deducciones mencionadas.
    */
    private double Descuento(){
        double seguroVida=1500;
        double obraSocial=(sueldoBasico* 0.02);
        sueldoBasico=(sueldoBasico-obraSocial)-seguroVida;
        return sueldoBasico;
    }
   
    /**
     * Modifica el sueldo del empleado con respecto a los adicionales, en concepto de antiguedad.
     * 
     * @return: Nuevo valor del sueldo basico con los adicionales.
     */
    private double Adicional (){
       
        
        double sueldoConAdicional = sueldoBasico; 
        if (this.Antiguedad() < 2) {
        sueldoConAdicional =sueldoConAdicional+ (sueldoBasico * 0.02); 
            } else if (this.Antiguedad() >= 2 && Antiguedad() < 10) {
        sueldoConAdicional =sueldoConAdicional+ (sueldoBasico * 0.04); 
            } else if (this.Antiguedad() >= 10) {
        sueldoConAdicional =sueldoConAdicional+ (sueldoBasico * 0.06); 
        }
        
        return sueldoConAdicional;

    }
   
    /**
     * Calcula el sueldo neto, correpsondiente al sueldo basico mas el adicional menos los descuentos.
     * 
     * @return: Devbuelve nuevo valor del sueldo.
     */
    public double SueldoNeto(){
        double sueldoNeto=(sueldoBasico+this.Adicional()) - this.Descuento();
        return sueldoNeto;
    }
    
    /**
     * Une la cadena de caracteres del nombre y apellido del empleado.
     * @return: Devuevle la cadena de caracteres unida.
     */
    public String NomyApe(){
        return this.getNombre()+", "+this.getApellido();
    }
    
    /**
     * Une la cadena de caracteres del nombre y apellido del empleado.
     * @return: Devuevle la cadena de caracteres unida.
     */
    public String ApeyNom(){
        
        return this.getApellido()+", "+this.getNombre();
    }
    
    /**
     * Imprime los datos personales del empleado, tales como nombre completo, cuil, antiguedad y sueldo neto.
     */
    public void Mostrar(){
        System.out.println("Nombre y apellido: "+this.NomyApe());
        System.out.println("CUIL: "+this.getCuil());
        System.out.println("Antiguedad: "+this.Antiguedad()+" años de servicio.");
        System.out.println("Sueldo neto: $" + this.SueldoNeto());
        }
    
    /**
    * Impime los datos personales del empleado en una sola linea.
    * 
    * @return: Datos del empelado en una sola linea.
     */
    public String MostrarLinea(){
            
            return this.getCuil()+"      "+this.ApeyNom()+"..................$"+this.SueldoNeto();
        }
}

