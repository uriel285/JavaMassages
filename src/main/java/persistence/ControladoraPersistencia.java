package persistence;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Direccion;
import logica.Paciente;
import persistence.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    DireccionJpaController direJpa = new DireccionJpaController();
    PacienteJpaController pacienteJpa = new PacienteJpaController();

    public void guardar(Direccion dire, Paciente paciente) {
       direJpa.create(dire);
       pacienteJpa.create(paciente);
    }

    public List<Paciente> traerPacientes() {
        return pacienteJpa.findPacienteEntities();
    }

    public void borrarPaciente(int num_paciente) {
        try {
            pacienteJpa.destroy(num_paciente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Paciente traerPaciente(int num_paciente) {
        return pacienteJpa.findPaciente(num_paciente);
    }

    public void modificarPaciente(Paciente pa) {
        try {
            pacienteJpa.edit(pa);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void modificarDire(Direccion dire){
        try {
            direJpa.edit(dire);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Direccion trarDireccion(int direId) {
        return direJpa.findDireccion(direId);
    }
}
