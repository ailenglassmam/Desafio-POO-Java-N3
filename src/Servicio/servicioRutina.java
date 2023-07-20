package Servicio;

import Entidad.Rutina;
import java.util.ArrayList;

/**
 * @author PC
 */
public class servicioRutina {

    //primero atributos, luego constructores
    ArrayList<Rutina> rutinas;
    private int id = 1;

    //constructor para inicializar atributos de la clase (buena practica)
    public servicioRutina() {
        rutinas = new ArrayList<>();
    }

    public void crearRutina(Rutina nr) {
        nr.setId(id);
        //incremento de forma automatica el id
        this.id++;
        // agrega los datos a la lista de clientes
        rutinas.add(nr);
    }

    public void obtenerRutinas() {
        System.out.println(rutinas);
    }

    public void obtenerRutinaEspecifica(int id_rutinaEspecifica) {
        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getId() == id_rutinaEspecifica) {
                System.out.println(rutinas.get(i));
            }
        }
    }

    public void actualizarRutina(int id_modificacionRutina, String nombreR, String duracion, String nivelDificultad, String descripcion) {
        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getId() == id_modificacionRutina) {
                Rutina clienteActualizado = new Rutina(id_modificacionRutina, nombreR, duracion, nivelDificultad, descripcion);
                rutinas.set(i, clienteActualizado);
                break; //cuando encuentra actualiza y corta el bucle
            }
        }
    }

    public void eliminarRutina(int id_eliminarRutina) {
        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getId() == id_eliminarRutina) {
                rutinas.remove(id);
            }
        }
    }

}
