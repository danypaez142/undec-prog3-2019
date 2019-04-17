/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventavehiculo;

/**
 *
 * @author UNdeC
 */
public class Camioneta extends Vehiculo{
    private double capacidad;
    private String cabina;
    
    public Camioneta(){
    }

    public Camioneta(int numMotor, int numChasis, String marcaMotor, String marcaChasis, double precio, double porcentajeDescuento, double capacidad, String cabina) {
        super(numMotor, numChasis, marcaMotor, marcaChasis, precio, porcentajeDescuento);
        this.capacidad = capacidad;
        this.cabina = cabina;
    }
 
    public String getCabina() {
        return cabina;
    }

    public void setCabina(String cabina) {
        this.cabina = cabina;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
    
}
