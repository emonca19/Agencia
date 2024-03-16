package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class HistorialPlacasVehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "estado", nullable = false, length = 25)
    private String estado;
    
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "idVehiculo")
    private VehiculoEntidad vehiculo;
    
    @OneToMany(mappedBy = "vehiculo", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<PlacaEntidad> placas;
    
    

    public HistorialPlacasVehiculo() {
    }

    public String getEstado() {
        return estado;
    }

    public List<PlacaEntidad> getPlacas() {
        return placas;
    }

    public void setPlacas(List<PlacaEntidad> placas) {
        this.placas = placas;
    }

    public VehiculoEntidad getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoEntidad vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        if (!(object instanceof HistorialPlacasVehiculo)) {
            return false;
        }
        HistorialPlacasVehiculo other = (HistorialPlacasVehiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.HistorialPlacasVehiculo[ id=" + id + " ]";
    }

}
