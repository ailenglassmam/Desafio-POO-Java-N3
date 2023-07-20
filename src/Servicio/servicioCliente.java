package Servicio;

import Entidad.Cliente;
import java.util.ArrayList;

/**
 *
 * división de responsabilidades: El scanner DEBE hacerlo el main, no el
 * servicio
 *
 * @author PC
 */
public class servicioCliente {

    //primero atributos, luego constructores
    ArrayList<Cliente> clientes;
    private int id = 1;

    //constructor para inicializar atributos de la clase (buena practica)
    public servicioCliente() {
        clientes = new ArrayList<>();
    }

    // metodos publicos: si alguien más quiero que los use
    // metodos privados: para uso interno/privado 
    public void registrarCliente(Cliente nc) {
        nc.setId(id);
        //incremento de forma automatica el id
        this.id++;
        // agrega los datos a la lista de clientes
        clientes.add(nc);
    }

    public void obtenerClienteEspecifico(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                System.out.println(clientes.get(i));
            }
        }
    }

    public void obtenerClientes() {
        System.out.println(clientes);
    }

    public void actualizarCliente(int id_modificacion, String nombre, String edad, String altura, String peso, String objetivo) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id_modificacion) {
                Cliente clienteActualizado = new Cliente(id_modificacion, nombre, edad, altura, peso, objetivo);
                clientes.set(i, clienteActualizado);
                break; //cuando encuentra actualiza y corta el bucle
            }
        }
    }

    public void eliminarCliente(int id_eliminar) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id_eliminar) {
                clientes.remove(id);
            }
        }
    }

}
