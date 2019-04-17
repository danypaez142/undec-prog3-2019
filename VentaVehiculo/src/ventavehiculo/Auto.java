/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventavehiculo;

/**
 *
 * @author UNdeC
 */
public class Auto extends Vehiculo{
    private String puertas;
    private String combustible;
    
    public Auto(){
    }

    public Auto(int numMotor, int numChasis, String marcaMotor, String marcaChasis, double precio, double porcentajeDescuento, String puertas, String combustible) {
        super(numMotor, numChasis, marcaMotor, marcaChasis, precio, porcentajeDescuento);
        this.puertas = puertas;
        this.combustible = combustible;
    }
    
    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }
    
    
    
    
    
}
