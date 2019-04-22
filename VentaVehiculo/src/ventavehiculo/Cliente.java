/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventavehiculo;

/**
 *
 * @author UNdeC
 */
public class Cliente {
    private String documento;
    private String nombre;
    private int edad;
    private String domicilio;

    public Cliente(){
    }
    
    public Cliente(String documento, String nombre, int edad, String domicilio) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String datosDelCiente(){
        return "Documento: " + this.documento + ", \nApellido y Nombre: " + this.nombre + "\n";
    }
    
}
