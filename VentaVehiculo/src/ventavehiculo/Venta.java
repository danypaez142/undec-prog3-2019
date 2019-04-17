/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventavehiculo;

/**
 *
 * @author UNdeC
 */
public class Venta {
    private String formaPago;
    private String fecha;
    private double total;
    
    Vehiculo mivehiculo = new Vehiculo();
    Cliente cliente1 = new Cliente();

    public Venta(){
    }
    
    public Venta(String formaPago, String fecha, double total) {
        this.formaPago = formaPago;
        this.fecha = fecha;
        this.total = total;
    }

    public Cliente getCliente1() {
        return cliente1;
    }

    public void setCliente1(Cliente cliente1) {
        this.cliente1 = cliente1;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
