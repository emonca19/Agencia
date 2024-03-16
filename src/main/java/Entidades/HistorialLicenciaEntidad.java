package Entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class HistorialLicenciaEntidad implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idHistorialLicencia")
    private Long id;

    @Column(name = "estado", nullable = false, length = 25)
    private String estado;
    
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "idCliente")
    private ClienteEntidad cliente;
    
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "idLicencia")
    private LicenciaEntidad licencia;

    public HistorialLicenciaEntidad() {
    }

    public HistorialLicenciaEntidad(Long id, String estado, ClienteEntidad cliente, LicenciaEntidad licencia) {
        this.id = id;
        this.estado = estado;
        this.cliente = cliente;
        this.licencia = licencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ClienteEntidad getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntidad cliente) {
        this.cliente = cliente;
    }

    public LicenciaEntidad getLicencia() {
        return licencia;
    }

    public void setLicencia(LicenciaEntidad licencia) {
        this.licencia = licencia;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialLicenciaEntidad)) {
            return false;
        }
        HistorialLicenciaEntidad other = (HistorialLicenciaEntidad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.HistorialLicenciaEntidad[ id=" + id + " ]";
    }

}
