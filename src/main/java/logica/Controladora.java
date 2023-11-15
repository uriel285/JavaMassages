package logica;

import java.util.List;
import persistence.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia control = new ControladoraPersistencia();

    public void guardar(String nombre, String apellido, String telefono, String observacion, String mail, String calle, String numero, String depto, String alergia, String patologia) {
                
        Direccion dire = new Direccion();
        dire.setCalle(calle);
        dire.setNumero(numero);
        dire.setEsDepto(depto);
        
        Paciente paciente = new Paciente();
        paciente.setNombre(nombre);
        paciente.setApellido(apellido);
        paciente.setCorreo(mail);
        paciente.setTelefono(telefono);
        paciente.setObservaciones(observacion);
        paciente.setAlergia(alergia);
        paciente.setPatologia(patologia);
        paciente.setDireccion(dire);
        
        control.guardar(dire, paciente);
    }

    public List<Paciente> traerPaciente() {
        return control.traerPacientes();
    }

    public void borrarPaciente(int num_paciente) {
        control.borrarPaciente(num_paciente);
    }

    public Paciente traerPacientes(int num_paciente) {
        return control.traerPaciente(num_paciente);
    }
    
    public void modificarPaciente(Paciente pa,String nombre,String apellido,String telefono,String observacion,String mail,String alergia,String patologia,String calle,String numero,String depto){
        pa.setNombre(nombre);
        pa.setApellido(apellido);
        pa.setTelefono(telefono);
        pa.setObservaciones(observacion);
        pa.setCorreo(mail);
        pa.setAlergia(alergia);
        pa.setPatologia(patologia);
        control.modificarPaciente(pa);
        
        Direccion dire = this.buscarDireccion(pa.getDireccion().getDireId());
        dire.setCalle(calle);
        dire.setNumero(numero);
        dire.setEsDepto(depto);
        this.modificarDire(dire);
    }

    private Direccion buscarDireccion(int direId) {
        return control.trarDireccion(direId);
    }
    
    public void modificarDire(Direccion dire){
        control.modificarDire(dire);
    }
}
