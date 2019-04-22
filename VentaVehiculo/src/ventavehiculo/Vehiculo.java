
package ventavehiculo;

/**
 *
 * @author UNdeC
 */
public class Vehiculo {
    private int numMotor;
    private int numChasis;
    private String marcaMotor;
    private String marcaChasis;
    private double precio;
    private double porcentajeDescuento;
    
    public Vehiculo(){
    }

    public Vehiculo(int numMotor, int numChasis, String marcaMotor, String marcaChasis, double precio, double porcentajeDescuento) {
        this.numMotor = numMotor;
        this.numChasis = numChasis;
        this.marcaMotor = marcaMotor;
        this.marcaChasis = marcaChasis;
        this.precio = precio;
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    public String getMarcaChasis() {
        return marcaChasis;
    }

    public void setMarcaChasis(String marcaChasis) {
        this.marcaChasis = marcaChasis;
    }

    public String getMarcaMotor() {
        return marcaMotor;
    }

    public void setMarcaMotor(String marcaMotor) {
        this.marcaMotor = marcaMotor;
    }

    public int getNumChasis() {
        return numChasis;
    }

    public void setNumChasis(int numChasis) {
        this.numChasis = numChasis;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
}
