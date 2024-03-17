package DTO;

import java.util.Calendar;

public class ClienteGeneradoDTO {
    
    private String rfc;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Calendar fechaNacimiento;
    private String telefono;

    public ClienteGeneradoDTO(String rfc, String nombre, String apellidoPaterno, String apellidoMaterno, Calendar fechaNacimiento, String telefono) {
     
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public ClienteGeneradoDTO() {
    }

    
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonaGeneradaDTO{");
        sb.append("rfc=").append(rfc);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellidoPaterno=").append(apellidoPaterno);
        sb.append(", apellidoMaterno=").append(apellidoMaterno);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }

}
