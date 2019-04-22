package ventavehiculo;

public class ControladorDeVehiculos {
    public static Auto registroDeAutos(){
        Auto prueba = new Auto();
        EntradaSalida.imprimirLinea(" ");
        EntradaSalida.imprimirLinea("Se dara de alta un nuevo Automovil");
        EntradaSalida.imprimir("Ingrese la marca del Vehiculo: ");
        prueba.setMarcaVehiculo(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese el modelo del Vehiculo (Nombre Modelo, Año): ");
        prueba.setModeloVehiculo(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese el número de Motor: ");
        prueba.setNumMotor(Integer.parseInt(EntradaSalida.ingresoDeDatos()));
        EntradaSalida.imprimir("Ingrese el número de Chasis: ");
        prueba.setNumChasis(Integer.parseInt(EntradaSalida.ingresoDeDatos()));
        EntradaSalida.imprimir("Ingrese la marca del Motor: ");
        prueba.setMarcaMotor(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese la marca del Chasis: ");
        prueba.setMarcaChasis(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese el precio de Venta del Automovil: ");
        prueba.setPrecio(Double.parseDouble(EntradaSalida.ingresoDeDatos()));
        EntradaSalida.imprimir("Ingrese el porcentaje de Descuento en caso de Efectivo: ");
        prueba.setPorcentajeDescuento(Double.parseDouble(EntradaSalida.ingresoDeDatos()));
        EntradaSalida.imprimir("Ingrese la cantidad de puertas del Automovil: ");
        prueba.setPuertas(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese el tipo de combustible que utiliza el Automovil: ");
        prueba.setCombustible(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimirLinea("Vehiculo registrado completamente.");
        return prueba;
    }
    
    public static Moto registroDeMotos(){
        EntradaSalida.imprimirLinea(" ");
        Moto prueba = new Moto();
        EntradaSalida.imprimirLinea("Se dara de alta una nueva Motocicleta");
        EntradaSalida.imprimir("Ingrese la marca del Vehiculo: ");
        prueba.setMarcaVehiculo(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese el modelo del Vehiculo (Nombre Modelo, Año): ");
        prueba.setModeloVehiculo(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese el número de Motor: ");
        prueba.setNumMotor(Integer.parseInt(EntradaSalida.ingresoDeDatos()));
        EntradaSalida.imprimir("Ingrese el número de Chasis: ");
        prueba.setNumChasis(Integer.parseInt(EntradaSalida.ingresoDeDatos()));
        EntradaSalida.imprimir("Ingrese la marca del Motor: ");
        prueba.setMarcaMotor(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese la marca del Chasis: ");
        prueba.setMarcaChasis(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese el precio de Venta de la Motocicleta: ");
        prueba.setPrecio(Double.parseDouble(EntradaSalida.ingresoDeDatos()));
        EntradaSalida.imprimir("Ingrese el porcentaje de Descuento en caso de Efectivo: ");
        prueba.setPorcentajeDescuento(Double.parseDouble(EntradaSalida.ingresoDeDatos()));
        EntradaSalida.imprimir("Ingrese de cuantos tiempos es la Motocicleta: ");
        prueba.setTiempo(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese la categoria de la Motocicleta: ");
        prueba.setCategoria(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimirLinea("Vehiculo registrado completamente.");
        return prueba;
    }
    
    public static Camioneta registroDeCamioneta(){
        EntradaSalida.imprimirLinea(" ");
        Camioneta prueba = new Camioneta();
        EntradaSalida.imprimirLinea("Se dara de alta una nueva Camioneta");
        EntradaSalida.imprimir("Ingrese la marca del Vehiculo: ");
        prueba.setMarcaVehiculo(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese el modelo del Vehiculo (Nombre Modelo, Año): ");
        prueba.setModeloVehiculo(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese el número de Motor: ");
        prueba.setNumMotor(Integer.parseInt(EntradaSalida.ingresoDeDatos()));
        EntradaSalida.imprimir("Ingrese el número de Chasis: ");
        prueba.setNumChasis(Integer.parseInt(EntradaSalida.ingresoDeDatos()));
        EntradaSalida.imprimir("Ingrese la marca del Motor: ");
        prueba.setMarcaMotor(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese la marca del Chasis: ");
        prueba.setMarcaChasis(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimir("Ingrese el precio de Venta del Automovil: ");
        prueba.setPrecio(Double.parseDouble(EntradaSalida.ingresoDeDatos()));
        EntradaSalida.imprimir("Ingrese el porcentaje de Descuento en caso de Efectivo: ");
        prueba.setPorcentajeDescuento(Double.parseDouble(EntradaSalida.ingresoDeDatos()));
        EntradaSalida.imprimir("Ingrese la capacidad de Carga de la Camioneta: ");
        prueba.setCapacidad(Double.parseDouble(EntradaSalida.ingresoDeDatos()));
        EntradaSalida.imprimir("Ingrese si la Camioneta es de Cabina simple o doble: ");
        prueba.setCabina(EntradaSalida.ingresoDeDatos());
        EntradaSalida.imprimirLinea("Vehiculo registrado completamente.");
        return prueba;
    }
}
