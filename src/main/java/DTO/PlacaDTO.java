package DTO;

import java.util.Date;

public class PlacaDTO {

    private int costo;
    private String estado;
    private Date fechaEmision;
    private Date fechaRecepcion;
    private int numAlfanumerico;
    private int precio;
    private Long idCliente;
    private Long idVehiculo;
    private Long idTramite;

    public PlacaDTO(int costo, String estado, Date fechaEmision, Date fechaRecepcion, int numAlfanumerico, int precio, Long idCliente, Long idVehiculo, Long idTramite) {
        this.costo = costo;
        this.estado = estado;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
        this.numAlfanumerico = numAlfanumerico;
        this.precio = precio;
        this.idCliente = idCliente;
        this.idVehiculo = idVehiculo;
        this.idTramite = idTramite;
    }

    public PlacaDTO() {
    }
    
    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public int getNumAlfanumerico() {
        return numAlfanumerico;
    }

    public void setNumAlfanumerico(int numAlfanumerico) {
        this.numAlfanumerico = numAlfanumerico;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Long getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(Long idTramite) {
        this.idTramite = idTramite;
    }

}
