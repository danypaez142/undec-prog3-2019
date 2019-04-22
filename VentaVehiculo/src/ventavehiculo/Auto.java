package ventavehiculo;

public class Auto extends Vehiculo{
    private String puertas;
    private String combustible;
    
    public Auto(){
    }

    public Auto(int numMotor, int numChasis, String marcaMotor, String marcaChasis,
    double precio, double porcentajeDescuento, String puertas, String combustible,
    String marcaVehiculo, String modeloVehiculo) {
        super(numMotor, numChasis, marcaMotor, marcaChasis, precio, porcentajeDescuento, marcaVehiculo, 
                modeloVehiculo);
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
