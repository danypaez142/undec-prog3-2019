package ventavehiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VentaVehiculo {

    public static void main(String[] args) {
        List<Auto> autosEnVenta = new ArrayList();
        List<Moto> motosEnVenta = new ArrayList();
        List<Camioneta> camionetasEnVenta = new ArrayList();
        List<Cliente> clientes = new ArrayList();
        Cliente c = new Cliente();
        int opcion;
        String terminar = "y";
        String buscador = "";
        do{
            EntradaSalida.imprimirLinea("Bienvenido al menu del Sistema");
            EntradaSalida.imprimirLinea("1. Menu de Carga de Datos");
            EntradaSalida.imprimirLinea("2. Menu de Ventas de Vehiculos");
            EntradaSalida.imprimir("Elija una opcion: ");
            opcion = Integer.parseInt(EntradaSalida.ingresoDeDatos());
            switch(opcion){
                case 1:
                    do {
                        EntradaSalida.imprimirLinea(" ");
                        EntradaSalida.imprimirLinea("Que desea registrar?");
                        EntradaSalida.imprimirLinea("1. Nuevo Cliente");
                        EntradaSalida.imprimirLinea("2. Nuevo Automovil");
                        EntradaSalida.imprimirLinea("3. Nueva Motocicleta");
                        EntradaSalida.imprimirLinea("4. Nueva Camioneta");
                        EntradaSalida.imprimirLinea("0. Salir");
                        EntradaSalida.imprimir("Elija una opcion: ");
                        opcion = Integer.parseInt(EntradaSalida.ingresoDeDatos());
                        switch(opcion){
                            case 0:
                                terminar = "n";
                                break;
                            case 1:
                                clientes.add(ControladorDeClientes.registroDeCliente());
                                EntradaSalida.imprimir("Desea continuar cargando datos? y/n:  ");
                                terminar = EntradaSalida.ingresoDeDatos();
                                break;
                            case 2:
                                autosEnVenta.add(ControladorDeVehiculos.registroDeAutos());
                                EntradaSalida.imprimir("Desea continuar cargando datos? y/n:  ");
                                terminar = EntradaSalida.ingresoDeDatos();
                                break;
                            case 3:
                                motosEnVenta.add(ControladorDeVehiculos.registroDeMotos());
                                EntradaSalida.imprimir("Desea continuar cargando datos? y/n:  ");
                                terminar = EntradaSalida.ingresoDeDatos();
                                break;
                            case 4:
                                camionetasEnVenta.add(ControladorDeVehiculos.registroDeCamioneta());
                                EntradaSalida.imprimir("Desea continuar cargando datos? y/n:  ");
                                terminar = EntradaSalida.ingresoDeDatos();
                                break;
                            default:
                                EntradaSalida.imprimirLinea("Opcion incorrecta, vuelva a seleccionar una opcion");
                                opcion = Integer.parseInt(EntradaSalida.ingresoDeDatos());
                                break;
                        }
                    } while(terminar.equals("y"));
                /*case 2:{
                    do{
                        imprimir("Ingrese el DNI del Cliente: ");
                        buscador = ingresoDeDatos();
                        c = busquedaClientePorDocumento(buscador, clientes);
                        imprimirLinea(c.datosDelCiente());
                        imprimirLinea("Que vehiculo desea comprar?");
                        imprimirLinea("1. Automovil");
                        imprimirLinea("2. Motocicleta");
                        imprimirLinea("3. Camioneta");
                        imprimir("Elija una opcion: ");
                        opcion = Integer.parseInt(ingresoDeDatos());
                        switch(opcion){
                            
                        }
                    }while(terminar.equals("y"));
                    imprimir("Desea Continuar en el Menu de Ventas? y/n: ");
                    terminar = ingresoDeDatos();
                    break;
                }*/
                    
                default:
                    EntradaSalida.imprimir("Desea Continuar en el Menu? y/n: ");
                    terminar = EntradaSalida.ingresoDeDatos();
                    break;
            }
            
        }while(terminar.equals("y"));
        
        
    }

    
    
    
    
    

    

}
