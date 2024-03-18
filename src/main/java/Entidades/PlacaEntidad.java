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
    private Calendar fechaEmision;
    
    @Column (name = "fechaRecepcion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaRecepcion;
    
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

    public PlacaEntidad(String estado, int precio, String numeroPlaca, Calendar fechaEmision, Calendar fechaRecepcion) {
        this.estado = estado;
        this.costo = precio;
        this.numeroPlaca = numeroPlaca;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
        this.fechaRecepcion = fechaRecepcion;
        this.fechaEmision = fechaEmision;
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

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Calendar getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Calendar fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
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

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

   

    public Calendar getFecha_emision() {
        return fechaEmision;
    }

    public void setFecha_emision(Calendar fecha_emision) {
        this.fechaEmision = fecha_emision;
    }

    public Calendar getFecha_recepcion() {
        return fechaRecepcion;
    }

    public void setFecha_recepcion(Calendar fecha_recepcion) {
        this.fechaRecepcion = fecha_recepcion;
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
        sb.append(", fecha_emision=").append(fechaEmision);
        sb.append(", fecha_recepcion=").append(fechaRecepcion);
        sb.append(", vehiculo=").append(vehiculo);
//        sb.append(", cliente=").append(cliente);
//        sb.append(", tramite=").append(tramite);
        sb.append('}');
        return sb.toString();
    }

    

}
