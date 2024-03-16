package Entidades;

import java.io.Serializable;
import java.util.Calendar;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class PersonaEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCliente")
    private Long idCliente;

    @Column(name = "curp", nullable = false, length = 18)
    private String curp;

    @Column(name = "fechaNacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaNacimiento;
    
    @Column(name = "rfc", nullable = false, length = 13)
    private String rfc;

    @Column(name = "telefono", nullable = false, length = 15)
    private String telefono;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombres;

    @Column(name = "apellidoPaterno", nullable = false, length = 25)
    private String apellidoPaterno;

    @Column(name = "apellidoMaterno", nullable = false, length = 25)
    private String apellidoMaterno;
    
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST})
    @JoinColumn(name = "idLicencia")
    private LicenciaEntidad licencia;
    
    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private List<TramiteEntidad> tramites;
    
//    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
//    private List<TramiteEntidad> tramites;
//    
//    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
//    private List<PlacaEntidad> placas;
//    
//    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
//    private List<LicenciaEntidad> licencias;
    
    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<VehiculoTieneCliente> vehiculoCliente;
    
    


    public PersonaEntidad() {
    }

    public PersonaEntidad(String curp, Calendar fechaNacimiento, String rfc, String telefono, String nombres, String apellido_paterno, String apellido_materno) {
        this.curp = curp;
        this.fechaNacimiento = fechaNacimiento;
        this.rfc = rfc;
        this.telefono = telefono;
        this.nombres = nombres;
        this.apellidoPaterno = apellido_paterno;
        this.apellidoMaterno = apellido_materno;
//        this.tramites = tramites;
//        this.placas = placas;
//        this.licencias = licencias;
//        this.vehiculoCliente = vehiculoCliente;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public LicenciaEntidad getLicencia() {
        return licencia;
    }

    public void setLicencia(LicenciaEntidad licencia) {
        this.licencia = licencia;
    }

//    public List<PlacaEntidad> getPlacas() {
//        return placas;
//    }
//
//    public void setPlacas(List<PlacaEntidad> placas) {
//        this.placas = placas;
//    }
//
//    public List<LicenciaEntidad> getLicencias() {
//        return licencias;
//    }
//
//    public void setLicencias(List<LicenciaEntidad> licencias) {
//        this.licencias = licencias;
//    }

    public List<TramiteEntidad> getTramites() {
        return tramites;
    }

    public void setTramites(List<TramiteEntidad> tramites) {
        this.tramites = tramites;
    }
    
    public List<VehiculoTieneCliente> getVehiculoCliente() {
        return vehiculoCliente;
    }

    public void setVehiculoCliente(List<VehiculoTieneCliente> vehiculoCliente) {
        this.vehiculoCliente = vehiculoCliente;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
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

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getApellido_paterno() {
        return apellidoPaterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellidoPaterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellidoMaterno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellidoMaterno = apellido_materno;
    }

//    public List<TramiteEntidad> getTramites() {
//        return tramites;
//    }
//
//    public void setTramites(List<TramiteEntidad> tramites) {
//        this.tramites = tramites;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaEntidad)) {
            return false;
        }
        PersonaEntidad other = (PersonaEntidad) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClienteEntidad{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", curp=").append(curp);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", rfc=").append(rfc);
        sb.append(", telefono=").append(telefono);
        sb.append(", nombres=").append(nombres);
        sb.append(", apellidoPaterno=").append(apellidoPaterno);
        sb.append(", apellidoMaterno=").append(apellidoMaterno);
//        sb.append(", tramites=").append(tramites);
//        sb.append(", placas=").append(placas);
//        sb.append(", licencias=").append(licencias);
        sb.append(", vehiculoCliente=").append(vehiculoCliente);
        sb.append('}');
        return sb.toString();
    }

    

}
