package Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class LicenciaEntidad extends TramiteEntidad implements Serializable {
    
    @Column(name = "estado", nullable = false)
    private int estado;
    
    @Column(name = "vigencia", nullable = false)
    private int vigencia;
    
    @Column(name = "costo", nullable = false)
    private int costo;
    
//    
//    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
//    @JoinColumn(name = "idPersona")
//    private PersonaEntidad cliente;

    public LicenciaEntidad() {
    }

    public LicenciaEntidad(int estado, int vigencia, int costo) {
        this.estado = estado;
        this.vigencia = vigencia;
        this.costo = costo;
    }
    
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
//    
//    public PersonaEntidad getPersona() {
//        return cliente;
//    }
//
//    public void setCliente(PersonaEntidad cliente) {
//        this.cliente = cliente;
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LicenciaEntidad{");
//        sb.append("id=").append(id);
        sb.append(", estado=").append(estado);
        sb.append(", vigencia=").append(vigencia);
        sb.append(", costo=").append(costo);
        sb.append('}');
        return sb.toString();
    }

    public void setPersona(PersonaEntidad persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
