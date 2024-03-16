package Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class ClienteEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idCliente;

    @Column(name = "curp", nullable = false, length = 25)
    private String curp;

    @Column(name = "fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;

    @Column(name = "rfc", nullable = false, length = 25)
    private String rfc;

    @Column(name = "telefono", nullable = false, length = 25)
    private String telefono;

    @Column(name = "nombre", nullable = false, length = 50)
    private List<String> nombres;

    @Column(name = "apellido_paterno", nullable = false, length = 25)
    private String apellido_paterno;

    @Column(name = "apellido_materno", nullable = false, length = 25)
    private String apellido_materno;

    
    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<TramiteEntidad> tramites;
    
    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<PlacaEntidad> placas;
    
    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<LicenciaEntidad> licencias;
    
    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<Vehiculo_tiene_cliente> vehiculoCliente;
    
    


    public ClienteEntidad() {
    }

    public List<PlacaEntidad> getPlacas() {
        return placas;
    }

    public void setPlacas(List<PlacaEntidad> placas) {
        this.placas = placas;
    }

    public List<LicenciaEntidad> getLicencias() {
        return licencias;
    }

    public void setLicencias(List<LicenciaEntidad> licencias) {
        this.licencias = licencias;
    }

    public List<Vehiculo_tiene_cliente> getVehiculoCliente() {
        return vehiculoCliente;
    }

    public void setVehiculoCliente(List<Vehiculo_tiene_cliente> vehiculoCliente) {
        this.vehiculoCliente = vehiculoCliente;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setId(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<String> getNombres() {
        return nombres;
    }

    public void setNombres(List<String> nombres) {
        this.nombres = nombres;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public List<TramiteEntidad> getTramites() {
        return tramites;
    }

    public void setTramites(List<TramiteEntidad> tramites) {
        this.tramites = tramites;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteEntidad)) {
            return false;
        }
        ClienteEntidad other = (ClienteEntidad) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.ClienteEntidad[ id=" + idCliente + " ]";
    }

}
