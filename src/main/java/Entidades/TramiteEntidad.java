package Entidades;

import controladores.ControladoresTipoCobro;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class TramiteEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTramite")
    private Long id;
    
    @Column(name = "costo", nullable = false)
    private int costo;
    
    @Column(name = "tipoTramite", nullable = false)
    private int tipoTramite;
    
    @Column(name = "fechaTramite", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaTramite;
    
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "idPersona")
    private PersonaEntidad persona;

    
    
    public TramiteEntidad() {
    }

    public TramiteEntidad(int costo, int tipoTramite, Calendar fechaTramite, PersonaEntidad persona) {
        
        this.costo = costo;
        this.tipoTramite = tipoTramite;
        this.fechaTramite = fechaTramite;
        this.persona = persona;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(int tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public Calendar getFechaTramite() {
        return fechaTramite;
    }

    public void setFechaTramite(Calendar fechaTramite) {
        this.fechaTramite = fechaTramite;
    }
    

    public PersonaEntidad getPersona() {
        return persona;
    }

    public void setPersona(PersonaEntidad cliente) {
        this.persona = cliente;
    }


//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof TramiteEntidad)) {
//            return false;
//        }
//        TramiteEntidad other = (TramiteEntidad) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TramiteEntidad{");
        sb.append("id=").append(id);
        sb.append(", costo=").append(costo);
        sb.append(", tipoTramite=").append(tipoTramite);
//        sb.append(", tipoCobro=").append(tipoCobro);
        sb.append(", fechaNacimiento=").append(fechaTramite);
        sb.append(", cliente=").append(persona);
        sb.append('}');
        return sb.toString();
    }

    

}
