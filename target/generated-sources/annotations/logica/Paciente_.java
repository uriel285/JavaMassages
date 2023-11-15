package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Direccion;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-25T01:28:49", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, String> apellido;
    public static volatile SingularAttribute<Paciente, String> correo;
    public static volatile SingularAttribute<Paciente, String> Patologia;
    public static volatile SingularAttribute<Paciente, String> observaciones;
    public static volatile SingularAttribute<Paciente, Direccion> direccion;
    public static volatile SingularAttribute<Paciente, String> alergia;
    public static volatile SingularAttribute<Paciente, Integer> pacienteId;
    public static volatile SingularAttribute<Paciente, String> telefono;
    public static volatile SingularAttribute<Paciente, String> nombre;

}