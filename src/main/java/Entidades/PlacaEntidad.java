package Entidades;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PlacaEntidad extends TramiteEntidad implements Serializable {

//    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "idPlaca")
//    private Long id;
    
    @Column(name = "estado", nullable = false, length = 25)
    private String estado;
    
    @Column (name = "costo", nullable = false)
    private int costo;
    
    @Column (name = "numeroPlaca", nullable = false, length = 25)
    private String numeroPlaca;
    
    @Column (name = "fechaEmision", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fecha_emision;
    
    @Column (name = "fechaRecepcion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fecha_recepcion;
    
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idVehiculo")
    private VehiculoEntidad vehiculo;
    
//    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
//    @JoinColumn(name = "idCliente")
//    private PersonaEntidad cliente;
    
//    @OneToOne
//    @JoinColumn(name = "idTramite", referencedColumnName = "idTramite")
//    private TramiteEntidad tramite;
    
    

    public PlacaEntidad() {
    }

    public PlacaEntidad(String estado, int precio, String numeroPlaca, Calendar fecha_emision, Calendar fecha_recepcion) {
        this.estado = estado;
        this.costo = precio;
        this.numeroPlaca = numeroPlaca;
        this.fecha_emision = fecha_emision;
        this.fecha_recepcion = fecha_recepcion;
    }

//    public TramiteEntidad getTramite() {
//        return tramite;
//    }
//
//    public void setTramite(TramiteEntidad tramite) {
//        this.tramite = tramite;
//    }
//
//    public PersonaEntidad getCliente() {
//        return cliente;
//    }
//
//    public void setCliente(PersonaEntidad cliente) {
//        this.cliente = cliente;
//    }

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
        return costo;
    }

    public void setPrecio(int precio) {
        this.costo = precio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

   

    public Calendar getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Calendar fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Calendar getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(Calendar fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    
    
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

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
//        if (!(object instanceof PlacaEntidad)) {
//            return false;
//        }
//        PlacaEntidad other = (PlacaEntidad) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlacaEntidad{");
//        sb.append("id=").append(id);
        sb.append(", estado=").append(estado);
        sb.append(", costo=").append(costo);
        sb.append(", numeroPlaca=").append(numeroPlaca);
        sb.append(", fecha_emision=").append(fecha_emision);
        sb.append(", fecha_recepcion=").append(fecha_recepcion);
        sb.append(", vehiculo=").append(vehiculo);
//        sb.append(", cliente=").append(cliente);
//        sb.append(", tramite=").append(tramite);
        sb.append('}');
        return sb.toString();
    }

    

}
