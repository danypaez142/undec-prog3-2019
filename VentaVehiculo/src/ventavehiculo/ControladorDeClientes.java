package ventavehiculo;

import java.util.List;

public class ControladorDeClientes {
    public static Cliente registroDeCliente(){
        Cliente prueba = new Cliente();
        EntradaSalida.imprimir(" ");
        EntradaSalida.imprimirLinea("Se dara de alta un nuevo Cliente");
        EntradaSalida.imprimir("Ingrese el número de Documento: ");
        prueba.setDocumento(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese el Nombre Completo del Cliente (Apellido, Nombres): ");
        prueba.setNombre(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese la edad del Cliente (> 18 años): ");
        prueba.setEdad(Integer.parseInt(EntradaSalida.ingresoDeDatos()));
        EntradaSalida.imprimir("Ingrese el domicilio del Cliente: ");
        prueba.setDocumento(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimirLinea("Cliente " + prueba.getNombre() + " Registrado con éxito");
        return prueba;
    }
    
    public static Cliente busquedaClientePorDocumento(String documento, List<Cliente> clientes){
        Cliente retornar = new Cliente();
        for(Cliente c : clientes){
            if(c.getDocumento().equals(documento))
                retornar = c;
        }
        return retornar;
    }
}
