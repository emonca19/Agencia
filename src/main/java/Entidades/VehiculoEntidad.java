package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class VehiculoEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVehiculo")
    private Long idVehiculo;
    
    @Column(name = "color", nullable = false, length = 20)
    private String color;
    
    @Column(name = "linea", nullable = false, length = 40)
    private String linea;
    
    @Column(name = "marca", nullable = false, length = 40)
    private String marca;
    
    @Column(name = "modelo", nullable = false, length = 4)
    private String modelo;
    
    @Column(name = "numSerie", nullable = false)
    private int numSerie;
    
    /**
     * 
     */
    @OneToMany(mappedBy = "vehiculo", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List <PlacaEntidad> placas;
    
    @OneToMany(mappedBy = "vehiculo", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<VehiculoTieneCliente> vehiculoCliente;

    public VehiculoEntidad() {
    }

    public VehiculoEntidad(String color, String linea, String marca, String modelo, int numSerie, List<PlacaEntidad> placas, List<VehiculoTieneCliente> vehiculoCliente) {
        this.color = color;
        this.linea = linea;
        this.marca = marca;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.placas = placas;
        this.vehiculoCliente = vehiculoCliente;
    }

    
    public Long getIdVehiculo() {
        return idVehiculo;
    }

    public List<PlacaEntidad> getPlacas() {
        return placas;
    }

    public void setPlacas(List<PlacaEntidad> placas) {
        this.placas = placas;
    }

    public List<VehiculoTieneCliente> getVehiculoCliente() {
        return vehiculoCliente;
    }

    public void setVehiculoCliente(List<VehiculoTieneCliente> vehiculoCliente) {
        this.vehiculoCliente = vehiculoCliente;
    }

    

    public void setIdVehiculo(Long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public List<PlacaEntidad> getPlaca() {
        return placas;
    }

    public void setPlaca(List<PlacaEntidad> placas) {
        this.placas = placas;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

   

    public Long getId() {
        return idVehiculo;
    }

    public void setId(Long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (idVehiculo != null ? idVehiculo.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof VehiculoEntidad)) {
//            return false;
//        }
//        VehiculoEntidad other = (VehiculoEntidad) object;
//        if ((this.idVehiculo == null && other.idVehiculo!= null) || (this.idVehiculo != null && !this.idVehiculo.equals(other.idVehiculo))) {
//            return false;
//        }
//        return true;
//    }

    
    
//    @Override
//    public String toString() {
//        return "Entidad.VehiculoEntidad[ id=" + idVehiculo + " ]";
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VehiculoEntidad{");
        sb.append("idVehiculo=").append(idVehiculo);
        sb.append(", color=").append(color);
        sb.append(", linea=").append(linea);
        sb.append(", marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", numSerie=").append(numSerie);
        sb.append(", placas=").append(placas);
        sb.append(", vehiculoCliente=").append(vehiculoCliente);
        sb.append('}');
        return sb.toString();
    }

}
