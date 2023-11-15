package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Direccion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int direId;
    private String calle;
    private String numero;
    private String esDepto;

    public Direccion() {
    }

    public Direccion(int direId, String calle, String numero, String esDepto) {
        this.direId = direId;
        this.calle = calle;
        this.numero = numero;
        this.esDepto = esDepto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEsDepto() {
        return esDepto;
    }

    public void setEsDepto(String esDepto) {
        this.esDepto = esDepto;
    }



    public int getDireId() {
        return direId;
    }

    public void setDireId(int direId) {
        this.direId = direId;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    
    
}
