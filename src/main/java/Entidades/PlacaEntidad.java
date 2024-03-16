package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PlacaEntidad implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPlaca")
    private Long id;
    
    @Column(name = "estado", nullable = false, length = 25)
    private String estado;
    
    @Column (name = "precio", nullable = false)
    private int precio;
    
    @Column(name = "costo", nullable = false)
    private int costo;
    
    @Column (name = "numAlfanumerico", nullable = false)
    private int num_alfanumerico;
    
    @Column (name = "fechaEmision", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_emision;
    
    @Column (name = "fechaRecepcion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_recepcion;
    
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "idVehiculo")
    private VehiculoEntidad vehiculo;
    
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "idCliente")
    private ClienteEntidad cliente;
    
    @OneToOne
    @JoinColumn(name = "idTramite", referencedColumnName = "idTramite")
    private TramiteEntidad tramite;
    
    

    public PlacaEntidad() {
    }

    public PlacaEntidad(String estado, int precio, int num_alfanumerico, Date fecha_emision, Date fecha_recepcion, VehiculoEntidad vehiculo, ClienteEntidad cliente, TramiteEntidad tramite) {
        this.estado = estado;
        this.precio = precio;
        this.num_alfanumerico = num_alfanumerico;
        this.fecha_emision = fecha_emision;
        this.fecha_recepcion = fecha_recepcion;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.tramite = tramite;
    }

    public TramiteEntidad getTramite() {
        return tramite;
    }

    public void setTramite(TramiteEntidad tramite) {
        this.tramite = tramite;
    }

    public ClienteEntidad getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntidad cliente) {
        this.cliente = cliente;
    }

    public VehiculoEntidad getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoEntidad vehiculo) {
        this.vehiculo = vehiculo;
    }

    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNum_alfanumerico() {
        return num_alfanumerico;
    }

    public void setNum_alfanumerico(int num_alfanumerico) {
        this.num_alfanumerico = num_alfanumerico;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Date getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(Date fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
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
        if (!(object instanceof PlacaEntidad)) {
            return false;
        }
        PlacaEntidad other = (PlacaEntidad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.PlacaEntidad[ id=" + id + " ]";
    }

}
