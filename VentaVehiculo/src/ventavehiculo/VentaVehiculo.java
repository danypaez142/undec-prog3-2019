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
            imprimirLinea("Bienvenido al menu del Sistema");
            imprimirLinea("1. Menu de Carga de Datos");
            imprimirLinea("2. Menu de Ventas de Vehiculos");
            imprimir("Elija una opcion: ");
            opcion = Integer.parseInt(ingresoDeDatos());
            switch(opcion){
                case 1:
                    do {
                        imprimirLinea(" ");
                        imprimirLinea("Que desea registrar?");
                        imprimirLinea("1. Nuevo Cliente");
                        imprimirLinea("2. Nuevo Automovil");
                        imprimirLinea("3. Nueva Motocicleta");
                        imprimirLinea("4. Nueva Camioneta");
                        imprimirLinea("0. Salir");
                        imprimir("Elija una opcion: ");
                        opcion = Integer.parseInt(ingresoDeDatos());
                        switch(opcion){
                            case 0:
                                terminar = "n";
                                break;
                            case 1:
                                clientes.add(registroDeCliente());
                                imprimir("Desea continuar cargando datos? y/n:  ");
                                terminar = ingresoDeDatos();
                                break;
                            case 2:
                                autosEnVenta.add(registroDeAutos());
                                imprimir("Desea continuar cargando datos? y/n:  ");
                                terminar = ingresoDeDatos();
                                break;
                            case 3:
                                motosEnVenta.add(registroDeMotos());
                                imprimir("Desea continuar cargando datos? y/n:  ");
                                terminar = ingresoDeDatos();
                                break;
                            case 4:
                                camionetasEnVenta.add(registroDeCamioneta());
                                imprimir("Desea continuar cargando datos? y/n:  ");
                                terminar = ingresoDeDatos();
                                break;
                            default:
                                imprimirLinea("Opcion incorrecta, vuelva a seleccionar una opcion");
                                opcion = Integer.parseInt(ingresoDeDatos());
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
                    imprimir("Desea Continuar en el Menu? y/n: ");
                    terminar = ingresoDeDatos();
                    break;
            }
            
        }while(terminar.equals("y"));
        
        
    }
    public static void imprimir(String cadena){
        System.out.print(cadena);
    }
    
    public static void imprimirLinea(String cadena){
        System.out.println(cadena);
    }   
    
    public static String ingresoDeDatos(){
        Scanner lector = new Scanner(System.in);
        return lector.nextLine();
    }
    
    public static Cliente registroDeCliente(){
        Cliente prueba = new Cliente();
        imprimirLinea(" ");
        imprimirLinea("Se dara de alta un nuevo Cliente");
        imprimir("Ingrese el número de Documento: ");
        prueba.setDocumento(ingresoDeDatos());
        imprimir("Ingrese el Nombre Completo del Cliente (Apellido, Nombres): ");
        prueba.setNombre(ingresoDeDatos());
        imprimir("Ingrese la edad del Cliente (> 18 años): ");
        prueba.setEdad(Integer.parseInt(ingresoDeDatos()));
        imprimir("Ingrese el domicilio del Cliente: ");
        prueba.setDocumento(ingresoDeDatos());
        imprimirLinea("Cliente " + prueba.getNombre() + " Registrado con éxito");
        return prueba;
    }
    
    public static Auto registroDeAutos(){
        Auto prueba = new Auto();
        imprimirLinea(" ");
        imprimirLinea("Se dara de alta un nuevo Automovil");
        imprimir("Ingrese la marca del Vehiculo: ");
        prueba.setMarcaVehiculo(ingresoDeDatos());
        imprimir("Ingrese el modelo del Vehiculo (Nombre Modelo, Año): ");
        prueba.setModeloVehiculo(ingresoDeDatos());
        imprimir("Ingrese el número de Motor: ");
        prueba.setNumMotor(Integer.parseInt(ingresoDeDatos()));
        imprimir("Ingrese el número de Chasis: ");
        prueba.setNumChasis(Integer.parseInt(ingresoDeDatos()));
        imprimir("Ingrese la marca del Motor: ");
        prueba.setMarcaMotor(ingresoDeDatos());
        imprimir("Ingrese la marca del Chasis: ");
        prueba.setMarcaChasis(ingresoDeDatos());
        imprimir("Ingrese el precio de Venta del Automovil: ");
        prueba.setPrecio(Double.parseDouble(ingresoDeDatos()));
        imprimir("Ingrese el porcentaje de Descuento en caso de Efectivo: ");
        prueba.setPorcentajeDescuento(Double.parseDouble(ingresoDeDatos()));
        imprimir("Ingrese la cantidad de puertas del Automovil: ");
        prueba.setPuertas(ingresoDeDatos());
        imprimir("Ingrese el tipo de combustible que utiliza el Automovil: ");
        prueba.setCombustible(ingresoDeDatos());
        imprimirLinea("Vehiculo registrado completamente.");
        return prueba;
    }
    
    public static Moto registroDeMotos(){
        imprimirLinea(" ");
        Moto prueba = new Moto();
        imprimirLinea("Se dara de alta una nueva Motocicleta");
        imprimir("Ingrese la marca del Vehiculo: ");
        prueba.setMarcaVehiculo(ingresoDeDatos());
        imprimir("Ingrese el modelo del Vehiculo (Nombre Modelo, Año): ");
        prueba.setModeloVehiculo(ingresoDeDatos());
        imprimir("Ingrese el número de Motor: ");
        prueba.setNumMotor(Integer.parseInt(ingresoDeDatos()));
        imprimir("Ingrese el número de Chasis: ");
        prueba.setNumChasis(Integer.parseInt(ingresoDeDatos()));
        imprimir("Ingrese la marca del Motor: ");
        prueba.setMarcaMotor(ingresoDeDatos());
        imprimir("Ingrese la marca del Chasis: ");
        prueba.setMarcaChasis(ingresoDeDatos());
        imprimir("Ingrese el precio de Venta de la Motocicleta: ");
        prueba.setPrecio(Double.parseDouble(ingresoDeDatos()));
        imprimir("Ingrese el porcentaje de Descuento en caso de Efectivo: ");
        prueba.setPorcentajeDescuento(Double.parseDouble(ingresoDeDatos()));
        imprimir("Ingrese de cuantos tiempos es la Motocicleta: ");
        prueba.setTiempo(ingresoDeDatos());
        imprimir("Ingrese la categoria de la Motocicleta: ");
        prueba.setCategoria(ingresoDeDatos());
        imprimirLinea("Vehiculo registrado completamente.");
        return prueba;
    }
    
    public static Camioneta registroDeCamioneta(){
        imprimirLinea(" ");
        Camioneta prueba = new Camioneta();
        imprimirLinea("Se dara de alta una nueva Camioneta");
        imprimir("Ingrese la marca del Vehiculo: ");
        prueba.setMarcaVehiculo(ingresoDeDatos());
        imprimir("Ingrese el modelo del Vehiculo (Nombre Modelo, Año): ");
        prueba.setModeloVehiculo(ingresoDeDatos());
        imprimir("Ingrese el número de Motor: ");
        prueba.setNumMotor(Integer.parseInt(ingresoDeDatos()));
        imprimir("Ingrese el número de Chasis: ");
        prueba.setNumChasis(Integer.parseInt(ingresoDeDatos()));
        imprimir("Ingrese la marca del Motor: ");
        prueba.setMarcaMotor(ingresoDeDatos());
        imprimir("Ingrese la marca del Chasis: ");
        prueba.setMarcaChasis(ingresoDeDatos());
        imprimir("Ingrese el precio de Venta del Automovil: ");
        prueba.setPrecio(Double.parseDouble(ingresoDeDatos()));
        imprimir("Ingrese el porcentaje de Descuento en caso de Efectivo: ");
        prueba.setPorcentajeDescuento(Double.parseDouble(ingresoDeDatos()));
        imprimir("Ingrese la capacidad de Carga de la Camioneta: ");
        prueba.setCapacidad(Double.parseDouble(ingresoDeDatos()));
        imprimir("Ingrese si la Camioneta es de Cabina simple o doble: ");
        prueba.setCabina(ingresoDeDatos());
        imprimirLinea("Vehiculo registrado completamente.");
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
