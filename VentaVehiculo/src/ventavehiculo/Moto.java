/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventavehiculo;

/**
 *
 * @author UNdeC
 */
public class Moto extends Vehiculo{
    private String tiempo;
    private String categoria;
    
    public Moto(){
    }

    public Moto(int numMotor, int numChasis, String marcaMotor, String marcaChasis, 
            double precio, double porcentajeDescuento, String tiempo, String categoria, 
            String marcaVehiculo, String modeloVehiculo) {
        super(numMotor, numChasis, marcaMotor, marcaChasis, precio, porcentajeDescuento, 
                marcaVehiculo, modeloVehiculo);
        this.tiempo = tiempo;
        this.categoria = categoria;
    }

    
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    
    

    
    
    
    
}
