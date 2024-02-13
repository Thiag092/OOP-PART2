/**
 * Abstraccion de Laboratorio que especifica los datos del mismo para su posterior gestion con una drogueria.
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 */

public class Laboratorio {
    
    //Definicion de atributos;-------------------------------------------
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    
    //Metodos Set-----------------------------------------------------------------------------
    
    /**
     * @param: p_nombre: hace referencia la nombre del laboratorio.
     */
    private void setNombre(String p_nombre){
        this.nombre=p_nombre;
    }
    
    /**
     * @param: p_domicilio: Rerefencia al domicilio del laboratorio.
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio=p_domicilio;
    }
    
    /**
     * @param: p_telefono; Numero de telefono para comunicarse con el laboratorio.
     */
    private void setTelefono(String p_telefono){
        this.telefono=p_telefono;
    }
    
    /**
     * @param: p_compraMinima: Compra minima a la cual de ebe realizar con el respectivo laboratorio.
     */
    private void setCompraminima(int p_compraMinima){
        this.compraMinima=p_compraMinima;
    }
    
    /**
     * @param: p_diaEntrega: Dia de Entrega de los medicamentos solicitados.
     */
    private void setDiaEntrega(int p_diaEntrega){
        this.diaEntrega=p_diaEntrega;
    }
    
    //Ahora definimos los Getters de cada atributo:-------------------------------------
    
    /**
     * @return: Devuelve el nombre del Laboratorio de tipo String.
     */
   public String getNombre(){
        return this.nombre;
            }
    
    /**
    * @return: Devuelve cadena de caracteres referenciando el domicilio del Laboratorio.
   */
    public String getDomicilio(){
        return this.domicilio;
        }
    
    /**
     * @return: Devuelve cadenad e caracteres con el numero de contacto del Laboratorio.
     */
    public String getTelefono(){
        return this.telefono;
    }
    
    /**
     * @return: Devuelve la cantidad de compra minima que exije el Laboratorio.
     */
    public int getCompraMinima(){
        return this.compraMinima;
    }
    
    
    /**
     * @return: Devuelve el dia de entrega de los medicamentos/insumos solicitados.
     */
    public int getDiaEntrega(){
        return this.diaEntrega;
    }
    
    /**
     * /Constructor de la clase Laboratorio.---------------------------------------------------------------------
     * 
     * @param: p_nombre: Nombre del laboratorio.
     * @param: p_domicilio: Domicilio de la sede del laboratorio.
     * @param: p_telefono: Numero de telefono de contacto.
     * @param:p_compraMinima: Cantidad minima de compra exijida por la entidad.
     * @param: p_diaEntrega: Fecha estimada de entrega de los productos solicitados.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraminima(p_compraMinima);
        this.setDiaEntrega(p_diaEntrega);
    }
    
    /**
     * Constructor de la clase Laboratorio, similar al anterior, pero con la salvedad de que ya tiene los ultimos dos atributos inicializados en "0".
     * 
     * @param: p_nombre: Nombre del laboratorio.
     * @param: p_domicilio: Domicilio de la sede del laboratorio.
     * @param: p_telefono: Numero de telefono de contacto.
     */
     public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraminima(0);
        this.setDiaEntrega(0);
    }
    
    
    
    /**
     * Metodo que modifica la compra Minima en el caso de que lo amerite.
     * 
     */
    public void NuevaCompraMinima(int p_compraMinima){
        this.setCompraminima(p_compraMinima);
    }
    
    /**
     * Metodo que modifica el dia de la Netrega ante cualquier eventualidad.
     */
    public void NuevoDiaEntrega(int p_diaEntrega){
        
        this.setDiaEntrega(p_diaEntrega);
    }
    
    /**
     * Imprime la informacion del Laboratirio como su nombre, domicilio y numero de contacto.
     */
    public void Mostrar(){
        System.out.println("Laboratorio: " +this.getNombre());
        System.out.println("Domicilio: " +this.getDomicilio());
        System.out.println("Telefono: "+this.getTelefono());
    }
}