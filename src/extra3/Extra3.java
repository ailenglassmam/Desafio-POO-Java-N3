package extra3;

import Entidad.Cliente;
import Entidad.Rutina;
import Servicio.servicioCliente;
import Servicio.servicioRutina;
import java.util.Scanner;

/**
 * @author PC
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente nc = new Cliente();
        Rutina nr = new Rutina();
        Scanner leer = new Scanner(System.in);
        servicioCliente nsc = new servicioCliente();
        servicioRutina nsr = new servicioRutina();

        int opcion;

        do {
            System.out.println("Selecciona una opción");
            System.out.println("");
            System.out.println("***** MENU CLIENTES *****");
            System.out.println("");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Obtener cliente definido");
            System.out.println("3. Obtener listado de clientes");
            System.out.println("4. Actualizar cliente");
            System.out.println("5. Eliminar cliente");
            System.out.println("");
            System.out.println("***** MENU RUTINAS *****");
            System.out.println("");
            System.out.println("6. Registrar rutina");
            System.out.println("7. Obtener rutinas");
            System.out.println("8. Obtener rutina específica");
            System.out.println("9. Actualizar rutina");
            System.out.println("10. Eliminar rutina");
            System.out.println("");
            System.out.println("11. Salir");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los siguientes datos para su registro");
                    System.out.print("Nombre:");
                    nc.setNombre(leer.nextLine());
                    System.out.print("Edad:");
                    nc.setEdad(leer.nextLine());
                    System.out.print("Altura:");
                    nc.setAltura(leer.nextLine());
                    System.out.print("Peso:");
                    nc.setPeso(leer.nextLine());
                    System.out.print("Objetivo:");
                    nc.setObjetivo(leer.nextLine());
                    nsc.registrarCliente(nc);
                    break;
                case 2:
                    System.out.println("Ingrese su número de socio (id)");
                    int id = leer.nextInt();
                    nsc.obtenerClienteEspecifico(id);
                    break;
                case 3:
                    nsc.obtenerClientes();
                    break;
                case 4:
                    System.out.println("Ingrese su número de socio (id)");
                    int id_modificacion = leer.nextInt();
                    leer.nextLine(); // Consumir el salto de línea pendiente
                    System.out.println("Ingrese los datos a modificar:");
                    System.out.println("");
                    System.out.print("Nombre:");
                    String nombre = leer.nextLine();
                    System.out.print("Edad:");
                    String edad = leer.nextLine();
                    System.out.print("Altura:");
                    String altura = leer.nextLine();
                    System.out.print("Peso:");
                    String peso = leer.nextLine();
                    System.out.print("Objetivo:");
                    String objetivo = leer.nextLine();
                    nsc.actualizarCliente(id_modificacion, nombre, edad, altura, peso, objetivo);
                    break;
                case 5:
                    System.out.println("Ingrese el número de socio (id) a eliminar de la base de datos");
                    int id_eliminar = leer.nextInt();
                    nsc.eliminarCliente(id_eliminar);
                    break;
                case 6:
                    System.out.println("Ingrese los siguientes datos para crear la rutina");
                    System.out.print("Nombre:");
                    nr.setNombre(leer.nextLine());
                    System.out.print("Duración:");
                    nr.setDuracion(leer.nextLine());
                    System.out.print("Nivel de dificultad:");
                    nr.setNivelDificultad(leer.nextLine());
                    System.out.print("Descripción:");
                    nr.setDescripcion(leer.nextLine());
                    nsr.crearRutina(nr);
                    break;
                case 7:
                    nsr.obtenerRutinas();
                    break;
                case 8:
                    System.out.println("Ingrese el número de rutina a consultar (id)");
                    int id_rutinaEspecifica = leer.nextInt();
                    nsr.obtenerRutinaEspecifica(id_rutinaEspecifica);
                    break;
                case 9:
                    System.out.println("Ingrese el número de la rutina que desea modificar (id)");
                    int id_modificacionRutina = leer.nextInt();
                    leer.nextLine(); // Consumir el salto de línea pendiente
                    System.out.println("Ingrese los datos a modificar:");
                    System.out.println("");
                    System.out.print("Nombre:");
                    String nombreR = leer.nextLine();
                    System.out.print("Duración:");
                    String duracion = leer.nextLine();
                    System.out.print("Nivel de dificultad:");
                    String nivelDificultad = leer.nextLine();
                    System.out.print("Descripción:");
                    String descripcion = leer.nextLine();
                    nsr.actualizarRutina(id_modificacionRutina, nombreR, duracion, nivelDificultad, descripcion);
                    break;
                case 10:
                    System.out.println("Ingrese el número de rutina (id) a eliminar de la base de datos");
                    int id_eliminarRutina = leer.nextInt();
                    nsr.eliminarRutina(id_eliminarRutina);
                    break;
                case 11:
                    System.out.println("Gracias por utilizar el sistema. Hasta la próxima.");
                    break;
                default:
                    System.out.println("Error");
            }

        } while (opcion != 11);

    }
}
